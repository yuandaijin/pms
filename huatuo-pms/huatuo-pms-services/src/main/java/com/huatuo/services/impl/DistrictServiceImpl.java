package com.huatuo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.bean.XtAddressBean;
import com.huatuo.bean.XtZdDistrictBean;
import com.huatuo.bean.XtZdDistrictPojoBean;
import com.huatuo.common.Config;
import com.huatuo.common.Utils;
import com.huatuo.db.bean.XtAddress;
import com.huatuo.db.bean.XtZdDistrict;
import com.huatuo.db.pojo.XtZdDistrictPojo;
import com.huatuo.db.repository.DbDistrictRepository;
import com.huatuo.db.repository.DbXtAddressRepository;
import com.huatuo.pms.bean.DistrictBean;
import com.huatuo.pms.services.DistrictService;

/** 
 * 地址服务相关接口
 * 
 */
@Service
public class DistrictServiceImpl implements DistrictService{
	
	@Autowired
	private DbDistrictRepository xtZdDistrictRepository;
	
	@Autowired
	private DbXtAddressRepository dbXtAddressRepository;
	
	/**
	 * 添加地市关联
	 * @param xtAddressBean
	 * @return
	 */
	@Override
	public Long insertXtAddress(XtAddressBean xtAddressBean) {
		XtAddress xtAddress = Utils.exchangeObject(xtAddressBean, XtAddress.class);
		Long addressId = dbXtAddressRepository.insertXtAddress(xtAddress);
		if(addressId > 0){
			xtAddressBean.setAddressId(addressId);
		}
		return addressId;
	}
	
	/**
	 * 根据id查询
	 * @param addressId	地市关联表id
	 * @return
	 */
	@Override
	public XtAddressBean getXtAddress(Long addressId) {
		XtAddress xtAddress = dbXtAddressRepository.getXtAddress(addressId);
		return Utils.exchangeObject(xtAddress, XtAddressBean.class);
	}
	
	
	/**
	 * 通过parent_id查询，并返回区域
	 * @param parent_id 上级地区
	 * @return 
	 * */
	public List<XtZdDistrictBean> getDistrictByParent(int parentId){
		List<XtZdDistrict> list = xtZdDistrictRepository.getDistrictByParent(parentId);
		List<XtZdDistrictBean> backList = new ArrayList<XtZdDistrictBean>();
		if(list != null && list.size() > 0){
			for(XtZdDistrict xtZdDistrict : list){
				XtZdDistrictBean target = Utils.exchangeObject(xtZdDistrict, XtZdDistrictBean.class);
				backList.add(target);
			}
		}
		return backList;
	}

	public XtZdDistrictBean getDistrictBychildId(int childId) {
		return Utils.exchangeObject(xtZdDistrictRepository.getDistrictBychildId(childId), XtZdDistrictBean.class);
	}

	
	public XtZdDistrictBean getDistrictById(int id) {
		return Utils.exchangeObject(xtZdDistrictRepository.getDistrictById(id), XtZdDistrictBean.class);
	}

	/**
	 * 设置地市
	 * @param provinceCode
	 * @param cityCode
	 * @param countyCode
	 * @param roadCode
	 * @return
	 */
	public int setDistrict(int provinceCode, int cityCode, int countyCode, int roadCode){
		if(roadCode != 0) return roadCode;
		if(countyCode != 0) return countyCode;
		if(cityCode != 0) return cityCode;
		if(provinceCode != 0) return provinceCode;
		return 0;
	}

	
	public List<XtZdDistrictBean> setDistrictList(int id, List<XtZdDistrictBean> list){
		XtZdDistrictBean bean = Utils.exchangeObject(xtZdDistrictRepository.getDistrictById(id), XtZdDistrictBean.class);
		if(bean == null) return list;
		list.add(bean);
		return this.setDistrictList(bean.getParentId(), list);
	}
	
	public DistrictBean getDistrictAll(int id){
		DistrictBean district=new DistrictBean();
		List<XtZdDistrictBean> list = new ArrayList<XtZdDistrictBean>();
		this.setDistrictList(id, list);
		for(XtZdDistrictBean bean : list){
			switch (bean.getGrade()) {
			case Config.FIELD_DISTRICT_PROVINCE:
				district.setProvinceId(bean.getId());
				district.setCitys(this.getDistrictByParent(bean.getId()));
				break;
			case Config.FIELD_DISTRICT_CITY:
				district.setCityId(bean.getId());
				district.setCountys(this.getDistrictByParent(bean.getId()));
				break;
			case Config.FIELD_DISTRICT_COUNTY:
				district.setCountyId(bean.getId());
				district.setRoads(this.getDistrictByParent(bean.getId()));
				break;
			case Config.FIELD_DISTRICT_ROAD:
				district.setRoadId(bean.getId());
				break;
			default:
				break;
			}
		}
		district.setProvinces(this.getDistrictByParent(Config.FIELD_DISTRICT_PROVINCE_PARENTID));
		return district;
	}

	@Override
	public List<XtZdDistrictPojoBean> getDistrictByParentId(Integer parentId) {
		List<XtZdDistrictPojo> xtZdDistrict = xtZdDistrictRepository.getDistrictByParentId(parentId);
		List<XtZdDistrictPojoBean> beans = new ArrayList<>();
		if(xtZdDistrict != null){
			for (XtZdDistrictPojo xtZdDistrictPojo : xtZdDistrict) {
				XtZdDistrictPojoBean bean = Utils.exchangeObject(xtZdDistrictPojo, XtZdDistrictPojoBean.class);
				beans.add(bean);
			}
		}
		return beans;
	}

}
