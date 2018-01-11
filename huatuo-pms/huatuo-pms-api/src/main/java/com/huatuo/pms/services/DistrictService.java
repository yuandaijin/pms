package com.huatuo.pms.services;

import java.util.List;

import com.huatuo.bean.XtAddressBean;
import com.huatuo.bean.XtZdDistrictBean;
import com.huatuo.bean.XtZdDistrictPojoBean;
import com.huatuo.pms.bean.DistrictBean;

/** 
 * 地址服务相关接口
 * 
 */
public interface DistrictService {
	
	/**
	 * 通过父级id查询，并返回区域
	 * @param parent_id 上级地区
	 * @return 
	 * */
	public List<XtZdDistrictBean> getDistrictByParent(int parentId);
	
	/**
	 * 通过传入地址id查询出所有下属区域
	 * @param id
	 * @return
	 */
	public DistrictBean getDistrictAll(int id);
	
	/**
	 * 添加地市关联
	 * @param xtAddressBean
	 * @return
	 */
	public Long insertXtAddress(XtAddressBean xtAddressBean);
	
	/**
	 * 根据id查询
	 * @param addressId	地市关联表id
	 * @return
	 */
	public XtAddressBean getXtAddress(Long addressId);
	
	/**
	 * 根据地区及下级地区的id和name
	 * @param parentId  地区id
	 * @return
	 */
	public List<XtZdDistrictPojoBean> getDistrictByParentId(Integer parentId);
}
