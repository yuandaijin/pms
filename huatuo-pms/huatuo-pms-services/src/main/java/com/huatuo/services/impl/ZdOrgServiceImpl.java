package com.huatuo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.bean.XtZdOrgBean;
import com.huatuo.common.Utils;
import com.huatuo.db.bean.VOrgDetail;
import com.huatuo.db.bean.XtAddress;
import com.huatuo.db.bean.XtZdOrg;
import com.huatuo.db.pojo.XtZdOrgPojo;
import com.huatuo.db.repository.DbOrgRepository;
import com.huatuo.db.repository.DbXtAddressRepository;
import com.huatuo.pms.bean.OrgDetailBean;
import com.huatuo.pms.bo.BOOrgAndUser;
import com.huatuo.pms.bo.BOUser;
import com.huatuo.pms.bo.BOZdOrg;
import com.huatuo.pms.services.UserService;
import com.huatuo.pms.services.ZdOrgService;

/**
 * 机构服务
 * 
 * @author zhanglm
 * 
 */
@Service
public class ZdOrgServiceImpl implements ZdOrgService {

	@Autowired
	private DbOrgRepository xtZdOrgRepository;
	
	@Autowired
	private DbOrgRepository dbOrgRepository;

	@Autowired
	private UserService userService;
	
	@Autowired
	private DbXtAddressRepository xtAddressRepository;

	@Override
	public int addOrUpdate(BOZdOrg zdOrg) {
		XtZdOrg target = new XtZdOrg();
		target=Utils.exchangeObject(zdOrg, target.getClass());
		return xtZdOrgRepository.add(target);
	}

	public int updateOneOrg(BOZdOrg zdOrg) {
		XtZdOrg target = new XtZdOrg();
		target=Utils.exchangeObject(zdOrg, target.getClass());
		return xtZdOrgRepository.updateOneOrg(target);
	}
	
	@Override
	public List<BOZdOrg> findAll(String name) {
		List<XtZdOrg> ls = xtZdOrgRepository.listContainsName(name);
		ArrayList<BOZdOrg> targetLs = new ArrayList<BOZdOrg>();
		for (XtZdOrg source : ls) {
			BOZdOrg target = new BOZdOrg();
			target=Utils.exchangeObject(source, target.getClass());
			targetLs.add(target);
		}
		return targetLs;
	}

	@Override
	public BOZdOrg findById(int id) {

		BOZdOrg target = new BOZdOrg();
		target=Utils.exchangeObject(xtZdOrgRepository.getOrgById(id), target.getClass());
		return target;
	}

	@Override
	public BOZdOrg getXtZdOrg(int orgId) {
		
		BOZdOrg target = new BOZdOrg();
		target=Utils.exchangeObject(xtZdOrgRepository.getOrgById(orgId), target.getClass());
		return target;
	}

	@Override
	public int saveXtZdOrg(BOZdOrg zdOrg) {
		XtZdOrg target = new XtZdOrg();
		target=Utils.exchangeObject(zdOrg, target.getClass());
		return xtZdOrgRepository.add(target);
	}

	@Override
	public int updateXtZdOrgAndUser(BOOrgAndUser record) {

		XtZdOrg r = xtZdOrgRepository.getOrgById(record.getId());
		XtAddress xtAddress = new XtAddress();
		xtAddress.setAddressId(record.getAddressId());
		xtAddress.setProvinceCode(record.getProvinceCode());
		xtAddress.setProvince(record.getProvince());
		xtAddress.setCityCode(record.getCityCode());
		xtAddress.setCity(record.getCity());
		xtAddress.setCountyCode(record.getCountyCode());
		xtAddress.setCounty(record.getCounty());
		xtAddress.setRoadCode(record.getRoadCode());
		xtAddress.setRoad(record.getRoad());
		xtAddress.setAddress(record.getAddress());
		xtAddressRepository.updateXtAddress(xtAddress);
		r.setName(record.getName());
		r.setAliasName(record.getAliasName());
		r.setDescription(record.getDescription());
		// r.setEmail(record.getEmail());
		r.setAddressId(record.getAddressId());
		r.setOrgKind(record.getOrgKind());
		r.setScale(record.getScale());
		r.setSetupType(record.getSetupType());
		// r.setTelephone(record.getTelephone());
		int row = xtZdOrgRepository.update(r);
		if (row > 0) {
			BOUser  xt= userService.getUserById(record.getUserId());
			// xt.setEmail(record.getEmail());
			// xt.setMobile(record.getTelephone());
			xt.setName(record.getName());// 机构
			row = userService.updateUser(xt);
		}
		return row;
	}
	@Override
	public OrgDetailBean getOrgDetailByUserId(long id) {
		VOrgDetail orgDetail=xtZdOrgRepository.getOrgDetailByUserId(id);
		OrgDetailBean orgDetailBean=Utils.exchangeObject(orgDetail, OrgDetailBean.class);
		return orgDetailBean;
	}

	@Override
	public int add(BOZdOrg zdOrg) {
		XtZdOrg target = new XtZdOrg();
		target=Utils.exchangeObject(zdOrg, target.getClass());
		return xtZdOrgRepository.addResultId(target);
	}

	@Override
	public BOZdOrg queryOrgCode(String orgCode) {
		BOZdOrg target = new BOZdOrg();
		XtZdOrg xtaOrg=xtZdOrgRepository.queryOrgCode(orgCode);
		target=Utils.exchangeObject(xtaOrg, target.getClass());
		return target;
	}

	@Override
	public List<BOZdOrg> getOrgsByTypeAndArea(Integer setupType,Integer provinceCode,Integer cityCode,Integer countyCode,Integer roadCode) {
		List<BOZdOrg> list = new ArrayList<BOZdOrg>();
		
		List<XtZdOrg> orgList = xtZdOrgRepository.getOrgList(setupType, provinceCode, cityCode, countyCode, roadCode);
		for(XtZdOrg xtZdOrg:orgList){
			BOZdOrg bOZdOrg=Utils.exchangeObject(xtZdOrg, BOZdOrg.class);
			list.add(bOZdOrg);
		}
		return list;
	}

	@Override
	public List<Integer> getOrgsByAddress(Integer setupType, Integer provinceCode, 
			Integer cityCode, Integer countyCode, Integer roadCode, String startTime, 
			String endTime) {
		List<Integer> orgIds = new ArrayList<>();
		List<XtZdOrg> beans = xtZdOrgRepository.getOrgsByAddress(setupType, provinceCode, 
							cityCode, countyCode, roadCode, startTime, endTime);
		if(beans != null){
			for (XtZdOrg xtZdOrg : beans) {
				orgIds.add(xtZdOrg.getId());
			}
		}
		return orgIds;
	}

	@Override
	public List<String> queryOrgdId(String orgName, String roadCode) {
		List<String> str = xtZdOrgRepository.queryOrgdId(orgName, roadCode);
		if(str != null){
			return str;
		}
		return null;
	}

	@Override
	public List<BOZdOrg> queryOrg(String roadCode,boolean flag) {
		List<BOZdOrg> list = new ArrayList<BOZdOrg>();
		List<XtZdOrg> orgList = xtZdOrgRepository.queryOrg(roadCode,flag);
		for(XtZdOrg xtZdOrg:orgList){
			BOZdOrg bOZdOrg=Utils.exchangeObject(xtZdOrg, BOZdOrg.class);
			list.add(bOZdOrg);
		}
		if(list.size() > 0){
			return list;
		}
		return null;
	}

	@Override
	public XtZdOrg getXtZdOrgBeanById(Integer id) {
		XtZdOrgPojo dto=dbOrgRepository.getXtZdOrgBeanById(id);
		XtZdOrg org=Utils.exchangeObject(dto, XtZdOrg.class);
		if(null != org){
			return org;
		}
		return null;
	}
	
	
}
