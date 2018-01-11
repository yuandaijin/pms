package com.huatuo.pms.services;

import java.text.ParseException;
import java.util.List;

import com.huatuo.bean.XtUserBean;
import com.huatuo.pms.bean.DoctorDetailBean;
import com.huatuo.pms.bean.XtDoctorsBean;
import com.huatuo.pms.bo.BOPersonInfo;
import com.huatuo.pms.bo.BOUser;
import com.huatuo.pms.bo.BOVisitInfo;
import com.huatuo.pms.bo.BaseUserInfo;
import com.huatuo.request.VisitForm;

/**
 * 用户个人服务
 * @author
 *
 */
public interface UserService {

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
	public BaseUserInfo loginUser(String userName, String pwd);

	/**
	 * 通过userid获取用户信息
	 * 
	 * @param userId
	 * @return
	 */
	public BaseUserInfo getUser(long userId);

	/**
	 * 登录日志
	 * 
	 * @param token
	 *            令牌
	 * @param userId
	 *            用户id
	 * @param userType
	 *            用户类型
	 * @param loginDate
	 *            登录时间
	 * @param deviceType
	 *            设备类型，0PC，1Andorid，2iOS
	 * @param browser
	 *            自定义的浏览器版本
	 * @param ip
	 *            来访者IP地址
	 */
	public void logLogin(String token, long userId, int userType, String loginDate, int deviceType, String browser,
			String ip);

	/**
	 * 登出日志
	 * 
	 * @param loginOutDate
	 * @param token
	 */
	public void logLogout(String token, String loginOutDate);

	/**
	 * session超时造成的退出登录
	 * 
	 * @param loginOutDate
	 * @param token
	 */
	public void logLogoutSessionTimeout(String token, String loginOutDate);

	/**
	 * 注册用户
	 * 
	 * @param user
	 * @return
	 */

	public int registerUser(BOUser user);

	/**
	 * 密码修改
	 * 
	 * @param id
	 *            用户ID
	 * @param newpassword
	 *            新密码
	 * @return
	 */
	public int updatePassword(long id, String newpassword);

	/**
	 * 判断用户名是否存在
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public boolean isExists(String username);
	
	/**
	 * 判断用户名是否存在
	 * 
	 * @param username
	 *            用户名
	 * @return
	 */
	public BOUser getUserByuserName(String username);

	/**
	 * 通过id查询用户详细信息
	 * 
	 * @param id
	 * @return
	 */
	public BOUser getUserById(long id);

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 * @return
	 */
	public int updateUser(BOUser user);

	/**
	 * 保存用户信息(包含登陆相关)
	 * 
	 * @param visit
	 * @return
	 * @throws ParseException 
	 */
	public int savePerson (BOVisitInfo visit) throws ParseException;
	
	/**
	 * 获取医生信息
	 * 
	 * @param
	 * @return
	 */
	public DoctorDetailBean getDoctorDetailById(long userId);

	/**
	 * 获取用户信息-手机
	 * 
	 * @param
	 * @return
	 */
	public BOUser getUserByMobile(String mobile);

	/**
	 * 获取用户信息-邮件
	 * 
	 * @param
	 * @return
	 */
	public BOUser getUserByEmail(String email);
	
	/**
	 * 修改手机号
	 * @param mobile
	 * @return
	 */
	public int updateMobile(long id, String mobile);
	
	/**
	 * 修改邮箱
	 * @param email
	 * @return
	 */
	public int updateEmail(long id, String email);
	

	/**
	 * 获取用户信息-姓名
	 * 
	 * @param
	 * @return
	 */
	public BOUser getUserByname(String name);

	/**
	 * 保存用户信息
	 * @param personInfo
	 * @return 返回保存的行数
	 */
	public int savePerson(BOPersonInfo personInfo);

	/**
	 * 根据用户id，返回XtUser
	 * @param userId
	 * @return 返回XtUser
	 */
	public BOUser getPhoneUser(long userId);

	/**
	 * 保存用户手机
	 * 
	 * @param
	 * @return
	 * @throws ParseException
	 */
	public int savePhonePerson(VisitForm visit) throws ParseException;
	
	/**
	 * 更新缓存
	 * @param request
	 * @param userInfo
	 */
	//public void updateUserInfo(HttpServletRequest request, BaseUserInfo userInfo);
	
	/**
	 * 新增用户并返回主键
	 * @param user
	 * @return
	 */
	public long addUser(XtUserBean user);

	/**
	 * 修改给定用户的状态
	 * @param userId
	 * @param delFlag
	 * @return
	 */
	public int updateFlag(Long userId, Integer delFlag);

	/**
	 * cms用于给定用户主键查询用户信息
	 * @param userId
	 * @return
	 */
	public XtUserBean getUserByUserId(Long userId);

	/**
	 * 根据医生id修改对应的信息
	 * @param name
	 * @param sex
	 * @param mobile
	 * @param email
	 * @param zdOrgId
	 * @param userId
	 */
	public int updateManyInfo(String name, Integer sex, String mobile,
			String email, Integer zdOrgId, Long userId);
	
	/**
	 * 添加或修改个人信息
	 * 
	 * @param Doctor
	 * @return
	 */
	public int saveOrUpdate(XtDoctorsBean doctor);
	
	/**
	 * 根据userId查询出医生信息
	 * @param userId
	 * @return
	 */
	public DoctorDetailBean queryDoctor(String userId);
	/**
	 * 通过orgId获得工作人员列表
	 * @param orgId
	 * @return
	 */
	public List<BOUser> getDoctorByOrgId(Integer orgId);

	/**
	 * 更新机构id
	 * @param userId
	 * @param zdOrgId
	 */
	public void updateOrgId(String userId, int zdOrgId);

	/**
	 * 通过用户名密码判断是否存在用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	public Boolean loginValidate(String name, String pwd);
}
