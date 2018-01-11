package com.huatuo.services.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.huatuo.bean.XtAddressBean;
import com.huatuo.bean.XtUserBean;
import com.huatuo.common.Config;
import com.huatuo.common.Utils;
import com.huatuo.common.enums.TitlesClinicalType;
import com.huatuo.common.enums.TitlesTeachType;
import com.huatuo.db.bean.VDoctorDetail;
import com.huatuo.db.bean.XtDoctor;
import com.huatuo.db.bean.XtPerson;
import com.huatuo.db.bean.XtUser;
import com.huatuo.db.bean.XtZdOrg;
import com.huatuo.db.repository.DbDoctorRepository;
import com.huatuo.db.repository.DbLoginLogRepository;
import com.huatuo.db.repository.DbOrgRepository;
import com.huatuo.db.repository.DbPersonRepository;
import com.huatuo.db.repository.DbUserRepository;
import com.huatuo.db.repository.DbXtAddressRepository;
import com.huatuo.pms.bean.DoctorDetailBean;
import com.huatuo.pms.bean.XtDoctorsBean;
import com.huatuo.pms.bo.BODoctorInfo;
import com.huatuo.pms.bo.BOOrgInfo;
import com.huatuo.pms.bo.BOPersonInfo;
import com.huatuo.pms.bo.BOUser;
import com.huatuo.pms.bo.BOVisitInfo;
import com.huatuo.pms.bo.BaseUserInfo;
import com.huatuo.pms.services.UserService;
import com.huatuo.request.VisitForm;

@Service
// @com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private DbUserRepository userRepository;
	@Autowired
	private DbLoginLogRepository loginLogRepository;
	@Autowired
	private DbPersonRepository personRepository;
	@Autowired
	private DbDoctorRepository doctorRepository;
	@Autowired
	private DbOrgRepository zdOrgRepository;
	@Autowired
	private DbXtAddressRepository xtAddressRepository;

	/**
	 * 用户登录
	 * 
	 * @param userName
	 *            用户名
	 * @param pwd
	 *            密码
	 * @param userType
	 *            用户类型(1:普通用户,2:药店用户,3:医生)
	 * @return
	 */
	public BaseUserInfo loginUser(String userName, String pwd) {
		if (userName == null || userName.length() == 0 || pwd == null || pwd.length() == 0) {
			return null;
		}
		BOUser user = this.getUserByname(userName);
		if (user == null || !pwd.equals(user.getPwd())) {
			return null;
		}
		return getUser(user.getId());
	}

	public BaseUserInfo getUser(long userId) {
		BaseUserInfo baseUser = null;
		Object XtObj = null;
		XtUser xtuser = userRepository.getUserById(userId);
		String userType = xtuser.getUserType();
		if (userType.contains(Config.FIELD_USER_TYPE_PERSON) &&
				!userType.contains(Config.FIELD_USER_TYPE_ORG)){
			XtObj = personRepository.getPersonByUserId(xtuser.getId());
			baseUser = new BOPersonInfo();
		}
		if (userType.contains(Config.FIELD_USER_TYPE_PERSON)
				&& userType.contains(Config.FIELD_USER_TYPE_ORG)) {
			XtObj = zdOrgRepository.getOrgById(xtuser.getOrgId());
			baseUser = new BOOrgInfo();
		}
		if (userType.contains(Config.FIELD_USER_TYPE_ORG)&&
				!userType.contains(Config.FIELD_USER_TYPE_PERSON)) {
			XtObj = zdOrgRepository.getOrgById(xtuser.getOrgId());
			baseUser = new BOOrgInfo();
		}
		if (userType.contains(Config.FIELD_USER_TYPE_DOCTOR)) {
			baseUser = new BODoctorInfo();
			XtObj = doctorRepository.getDoctorByUserIdToLogin(userId);
			((BODoctorInfo)baseUser).setZdOrgName(((VDoctorDetail)XtObj).getOrgName());
		}
		
		if (userType.contains(Config.FIELD_USER_TYPE_MANAGER)) {
			XtObj = zdOrgRepository.getOrgById(xtuser.getOrgId());
			baseUser = new BOOrgInfo();
		}
		
		if(XtObj!=null){
			BeanUtils.copyProperties(XtObj, baseUser);
		}
		if(xtuser!=null){
			BeanUtils.copyProperties(xtuser, baseUser);
		}
		if(userType.contains(Config.FIELD_USER_TYPE_PERSON) && 
				!userType.contains(Config.FIELD_USER_TYPE_ORG)){
			((BOPersonInfo)baseUser).setAge(Utils.getLocalizedAge(((BOPersonInfo)baseUser).getBirthdate()));
			XtAddressBean address = Utils.exchangeObject(xtAddressRepository.getXtAddress(((BOPersonInfo)baseUser).getAddressId()), XtAddressBean.class);
			((BOPersonInfo)baseUser).setXtAddressBean(StringUtils.isEmpty(address)? new XtAddressBean() : address);
		} else if(userType.contains(Config.FIELD_USER_TYPE_DOCTOR)){
			((BODoctorInfo)baseUser).setAge(Utils.getLocalizedAge(((BODoctorInfo)baseUser).getBirthdate()));
			if(((BODoctorInfo)baseUser).getTitlesClinical() > 0){
				((BODoctorInfo)baseUser).setTitlesClinicalName(TitlesClinicalType.getName(((BODoctorInfo)baseUser).getTitlesClinical()));
			}
			if(((BODoctorInfo)baseUser).getTitlesTeach() > 0){
				((BODoctorInfo)baseUser).setTitlesTeachName(TitlesTeachType.getName(((BODoctorInfo)baseUser).getTitlesTeach()));
			}
		} else if(userType.contains(Config.FIELD_USER_TYPE_ORG)){
			((BOOrgInfo)baseUser).setXtAddressBean(Utils.exchangeObject(xtAddressRepository.getXtAddress(((BOOrgInfo)baseUser).getAddressId()), XtAddressBean.class));
		} 
		else if (userType.contains(Config.FIELD_USER_TYPE_MANAGER)) {
			((BOOrgInfo)baseUser).setXtAddressBean(Utils.exchangeObject(xtAddressRepository.getXtAddress(((BOOrgInfo)baseUser).getAddressId()), XtAddressBean.class));
		}
		// 特殊处理：字段不一致
		baseUser.setUserId(xtuser.getId());
		return baseUser;
	}

	static BaseUserInfo convent(XtUser xtuser, Object obj) {
		BaseUserInfo baseUser = null;
		if (obj instanceof XtPerson) {
			baseUser = new BOPersonInfo();
			// 特殊处理：数据要求
			long personId = ((XtPerson) obj).getId();
			((BOPersonInfo) baseUser).setPersonId(personId);
		} else if (obj instanceof VDoctorDetail) {
			baseUser = new BODoctorInfo();
		} else if (obj instanceof XtZdOrg) {
			baseUser = new BOOrgInfo();
		} else {
			throw new RuntimeException("不支持的用户类型");
		}
		if(obj!=null){
			BeanUtils.copyProperties(obj, baseUser);
		}
		if(xtuser!=null){
			BeanUtils.copyProperties(xtuser, baseUser);
		}
		// 特殊处理：字段不一致
		baseUser.setUserId(xtuser.getId());
		
		return baseUser;

	}

	/**
	 * 登录日志
	 * 
	 * @param bean
	 */
	public void logLogin(String token, long userId, int userType, String loginDate, int deviceType, String browser, String ip) {
		loginLogRepository.insertLog(token, userId, userType, loginDate, deviceType, browser, ip);
	}

	/**
	 * 登出日志
	 * 
	 * @param loginOutDate
	 * @param token
	 */
	public void logLogout(String token, String loginOutDate) {
		loginLogRepository.updateLog(token, loginOutDate, false);
	}

	@Override
	public void logLogoutSessionTimeout(String token, String loginOutDate) {
		loginLogRepository.updateLog(token, loginOutDate, true);
	}

	@Override
	public int registerUser(BOUser user) {
		XtUser target=new XtUser();
		if(user!=null){
			BeanUtils.copyProperties(user, target);
		}
		return userRepository.insertUser(target);
	}

	@Override
	public int updatePassword(long id, String newpassword) {
		XtUser user = userRepository.getUserById(id);
		if (user != null) {
			user.setPwd(newpassword);
			return userRepository.updateUser(user);
		}
		return 0;
	}

	@Override
	public boolean isExists(String username) {
		XtUser user = userRepository.getUserByUserName(username);
		return (user != null);
	}

	public BOUser getUserById(long id) {
		XtUser xtu = userRepository.getUserById(id);
		BOUser target = new BOUser();
		target=Utils.exchangeObject(xtu, target.getClass());

		return target;
	}

	/**
	 * 保存用户信息
	 * 
	 * @param visit
	 * @return
	 * @throws ParseException
	 */
	public int savePerson(BOVisitInfo visit) throws ParseException {
		XtUser user = userRepository.getUserById(visit.getUserId());
		user.setName(visit.getName());
		user.setSex(visit.getSex());
		// user.setMobile(visit.getMobile());
		// user.setEmail(visit.getEmail());
		int rows = userRepository.updateUser(user);

		XtPerson person = personRepository.getPersonByUserId(user.getId());
		if (person == null) {
			person = new XtPerson();
		}
		person.setUserId(visit.getUserId());
		person.setName(visit.getName());
		person.setSex(visit.getSex());
		person.setMarry(visit.getMarry());
//		if (!StringUtils.isEmpty(visit.getNation()))
			person.setNation(visit.getNation());
		person.setBirthPlace(visit.getBirthPlace());
		person.setAddressId(visit.getAddressId());
		person.setOccupationId(visit.getOccupationId());
		person.setHomeTel(visit.getTel());
		person.setSocialIdType(visit.getSocialIdType());
		person.setSocialId(visit.getSocialId());
		person.setAllergicHistory(visit.getAllergicHistory());
		person.setBirthdate(visit.getBirthdate());
		if (!StringUtils.isEmpty(visit.getWeight()))
			person.setWeight(visit.getWeight());
		if (person.getId() != 0) {
			rows = personRepository.update(person);
		} else {
			personRepository.insert(person);
		}

		return rows;
	}

	
	@Override
	public DoctorDetailBean getDoctorDetailById(long doctorId) {
		VDoctorDetail doctorDetail = doctorRepository.getDoctorDetailById(doctorId);
		DoctorDetailBean doctorDetailBean = Utils.exchangeObject(doctorDetail, DoctorDetailBean.class);
		if(doctorDetailBean != null) {
			if(doctorDetailBean.getTitlesClinical() > 0){
				doctorDetailBean.setTitlesClinicalName(TitlesClinicalType.getName(doctorDetailBean.getTitlesClinical()));
			}
			if(doctorDetailBean.getTitlesTeach() > 0){
				doctorDetailBean.setTitlesTeachName(TitlesTeachType.getName(doctorDetailBean.getTitlesTeach()));
			}
		}
		return doctorDetailBean;
	}

	@Override
	public BOUser getUserByMobile(String mobile) {
		XtUser source=userRepository.getUserByMobile(mobile);
		BOUser target = new BOUser();
		target=Utils.exchangeObject(source, target.getClass());
		return target;
	}

	@Override
	public BOUser getUserByEmail(String email) {
		XtUser source= userRepository.getUserByEmail(email);
		BOUser target = new BOUser();
		target=Utils.exchangeObject(source, target.getClass());
//		BeanUtils.copyProperties(source, target);
		return target;
	}
	@Override
	public BOUser getUserByuserName(String username) {
		BOUser target = new BOUser();
		XtUser source = userRepository.getUserByUserName(username);
		target=Utils.exchangeObject(source, target.getClass());
		return target;
	}

	@Override
	public int updateMobile(long id, String mobile) {
		XtUser user = userRepository.getUserById(id);
		user.setMobile(mobile);
		return userRepository.updateUser(user);
	}

	@Override
	public int updateEmail(long id, String email) {
		XtUser user = userRepository.getUserById(id);
		user.setEmail(email);
		return userRepository.updateUser(user);
	}

	public BOUser getUserByname(String name) {
		XtUser user = null;
		if (Utils.isMobile(name)) {
			user = userRepository.getUserByMobile(name);
		} else if (name.contains("@") && Utils.isEmail(name)) {
			user = userRepository.getUserByEmail(name);
		} else {
			user = userRepository.getUserByUserName(name);
		}
		return Utils.exchangeObject(user, BOUser.class);
	}

	@Override
	public int updateUser(BOUser user) {
		XtUser target = new XtUser();
		target=Utils.exchangeObject(user, target.getClass());
		return userRepository.updateUser(target);
	}

	/**
	 * 保存用户信息
	 * 
	 * @param personInfo
	 * @return 返回保存的行数
	 */
	@Override
	public int savePerson(BOPersonInfo personInfo) {
		XtPerson person = personRepository.getPersonByUserId(personInfo.getUserId());
		if (person == null) {
			person = new XtPerson();
		}
		int rows =0;
		person.setAllergicHistory(personInfo.getAllergicHistory());
		person.setBirthdate(personInfo.getBirthdate());
		person.setBirthPlace(personInfo.getBirthPlace());
		person.setAddressId(personInfo.getAddressId());
		person.setHomeTel(personInfo.getHomeTel());
		person.setMarry(personInfo.getMarry());
		person.setName(personInfo.getName());
		person.setNation(personInfo.getNation());
		person.setOccupationId(personInfo.getOccupationId());
		person.setSex(personInfo.getSex());
		person.setSocialId(personInfo.getSocialId());
		person.setUserId(personInfo.getUserId());
		person.setWeight(personInfo.getWeight());
		person.setAddressId(personInfo.getAddressId());
		if (!StringUtils.isEmpty(personInfo.getHeight())) {
			person.setHeight(personInfo.getHeight());
		}
		if (person.getId() != 0) {
			rows=personRepository.update(person);
		} else {
			rows=personRepository.insert(person);
		}
		return rows;
	}

	/**
	 * 根据用户id，返回XtUser
	 * 
	 * @param userId
	 * @return 返回XtUser
	 */
	
	@Override
	public BOUser getPhoneUser(long userId) {
		XtUser source= userRepository.getUserById(userId);
		BOUser target = new BOUser();
		target=Utils.exchangeObject(source, target.getClass());
		return target;
	}
	
	@Override
	public int savePhonePerson(VisitForm visit) throws ParseException {
		XtUser user = userRepository.getUserById(visit.getUserId());
		user.setName(visit.getName());
		user.setSex(visit.getSex());
		// user.setMobile(visit.getMobile());
		// user.setEmail(visit.getEmail());
		int rows = userRepository.updateUser(user);

		XtPerson person = personRepository.getPersonByUserId(user.getId());
		if (person == null) {
			person = new XtPerson();
		}
		person.setUserId(visit.getUserId());
		person.setName(visit.getName());
		person.setSex(visit.getSex());
		person.setMarry(visit.getMarry());
		if (!StringUtils.isEmpty(visit.getNation())) {
			person.setNation(visit.getNation());
		}
		person.setBirthPlace(visit.getBirthPlace());
		person.setAddressId(visit.getAddressId());
		person.setOccupationId(visit.getOccupationId());
		person.setHomeTel(visit.getTel());
		person.setSocialIdType(visit.getSocialIdType());
		person.setSocialId(visit.getSocialId());
		person.setAllergicHistory(visit.getAllergicHistory());
		if (!StringUtils.isEmpty(visit.getWeight())) {
			person.setWeight(visit.getWeight());
		}
		if (person.getId() != 0) {
			rows = personRepository.update(person);
		} else {
			personRepository.insert(person);
		}
		return rows;
	}

	@Override
	public long addUser(XtUserBean user) {
		XtUser xtUser = Utils.exchangeObject(user, XtUser.class);
		if(userRepository.insertUser(xtUser) > 0 ) {
			return xtUser.getId();
		}
		return 0;
	}

	@Override
	public int updateFlag(Long userId, Integer delFlag) {
		if(userId == null || userId == 0 || delFlag == null) {
			return 0;
		}
		return userRepository.updateFlag(userId, delFlag);
	}

	@Override
	public XtUserBean getUserByUserId(Long userId) {
		return Utils.exchangeObject(userRepository.getUserById(userId), XtUserBean.class);
	}

	@Override
	public int updateManyInfo(String name, Integer sex, String mobile,
			String email, Integer zdOrgId, Long userId) {
		return userRepository.updateManyInfo(name, sex, mobile, email, zdOrgId, userId);
	}

//	@Override
//	public void updateUserInfo(HttpServletRequest request, BaseUserInfo userInfo) {
//		SecurityContext securityContext = (SecurityContext) request.getSession().getAttribute(
//				HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY);
//		if (securityContext == null) {
//			return;
//		}
//		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//				userInfo.getUserName(), userInfo);
//		securityContext.setAuthentication(authentication);
//	}
	
	@Override
	public int saveOrUpdate(XtDoctorsBean doctor) {
		XtDoctor xtDoctor = Utils.exchangeObject(doctor, XtDoctor.class);
		//判断扩展表中是否存在数据，有则update，无则insert
		XtDoctor xt =doctorRepository.selectDoctor(String.valueOf(doctor.getUserId()));
		if(null != xt){
			return doctorRepository.updateDoctor(xtDoctor);
		}else{
			xtDoctor.setUserId(doctor.getUserId());
			return  doctorRepository.add(xtDoctor);
		}
	}

	@Override
	public DoctorDetailBean queryDoctor(String userId) {
		//clinics项目退费处需要
		if(null != userId){
			XtDoctor xtdoctor =doctorRepository.selectDoctor(userId);
			DoctorDetailBean bean = new DoctorDetailBean();
			bean.setDoctorId(xtdoctor.getId());
			bean.setName(xtdoctor.getName());
			bean.setUserId(xtdoctor.getUserId());
			bean.setAge(xtdoctor.getAge());
			bean.setSex(xtdoctor.getSex());
			bean.setNation(xtdoctor.getNation());
			bean.setSocialId(xtdoctor.getSocialId());
			bean.setRoleId(xtdoctor.getRoleId());
			bean.setGoodAt(xtdoctor.getGoodAt());
			bean.setDoctorType(xtdoctor.getDoctorType()!=null?xtdoctor.getDoctorType():1);
			bean.setTitlesClinical(xtdoctor.getTitlesClinical());
			return bean;
		}
		return null;
	}

	@Override
	public List<BOUser> getDoctorByOrgId(Integer orgId) {
		
		List<BOUser> list = new ArrayList<>();
		List<XtUser> xtUsers = userRepository.getDoctorByOrgId(orgId);
		for (XtUser xtUser : xtUsers) {
			BOUser user = Utils.exchangeObject(xtUser, BOUser.class);
			list.add(user);
		}
		return list;
	}

	@Override
	public void updateOrgId(String userId, int zdOrgId) {
		userRepository.updateOrgId(Long.parseLong(userId),zdOrgId);
	}

	@Override
	public Boolean loginValidate(String name, String pwd) {
		return userRepository.getByNameAndPWD(name,pwd)>0;
	}


	
}
