package com.huatuo.pms.services;

import java.util.List;

import com.huatuo.pms.bean.XtDoctorTemporaryBean;


/**
 * 医生入驻诊所申请
 * @author Administrator
 *
 */
public interface DoctorTemporaryService {

	/**
	 * 拿到诊所下面所有申请加入的医生
	 * @param orgId
	 * @return
	 */
	List<XtDoctorTemporaryBean> getByOrgId(int orgId);

	/**
	 * 
	 * @param id
	 * @return
	 */
	XtDoctorTemporaryBean getByUserId(String id);
	
}
