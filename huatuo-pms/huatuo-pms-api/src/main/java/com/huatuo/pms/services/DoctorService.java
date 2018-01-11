package com.huatuo.pms.services;

import java.util.List;

import com.huatuo.pms.bean.XtDoctorsBean;
import com.huatuo.pms.bo.BODoctorInfo;

public interface DoctorService {

	/**
	 * 通过orgId获得医生列表
	 * @param orgId
	 * @return
	 */
	public List<XtDoctorsBean> getDoctorByOrgId(Integer orgId);
	/**
	 * 通过医生主键拿到医生
	 * @param doctorId
	 * @return
	 */
	public BODoctorInfo getDoctorById(String doctorId);
	
	/**
	 * 通过user_id拿到医生
	 * @param doctorId
	 * @return
	 */
	public BODoctorInfo getDoctorByUserId(String userId);
	
	/**
	 * 根据角色和机构集合查询医生总数
	 * @param roleId	角色
	 * @param orgIds	机构id集合
	 * @param startTime	开始时间
	 * @param endTime 	结束时间
	 * @return
	 */
	public int countNum(String roleId, List<Integer> orgIds, String startTime, String endTime);
	
	/**
	 * 个体诊所医生职称分布	
	 * @param orgIds			机构id集合	
	 * @param titlesClinical	临床职称
	 * @return
	 */
	public int countDoctorTitle(List<Integer> orgIds, Integer titlesClinical);
}
