package com.huatuo.pms.services;

import java.util.List;

import com.huatuo.bean.XtPersonBean;
import com.huatuo.common.Page;
import com.huatuo.pms.bean.MedicalRecordBean;
import com.huatuo.pms.bean.MedicalVisitBean;
import com.huatuo.pms.bean.OrderBean;
import com.huatuo.pms.bean.OrderDtlSupplyFrequencyBean;
import com.huatuo.pms.bo.BOPerson;
import com.huatuo.pms.bo.BOPersonFamily;

/**
 * 用户私人服务
 * 
 * @author
 */
public interface PersonService {

	/**
	 * 添加修改用户信息
	 * 
	 * @return
	 */
	public int updateOrSave(BOPerson person);

	/**
	 * 添加修改用户家人信息
	 * 
	 * @return
	 */
	public int updateOrSaveFamily(BOPersonFamily person);

	/**
	 * 通过用户id查询用户家庭成员
	 * 
	 * @return
	 */
	public List<BOPersonFamily> selectFamilyList(long userId);

	/**
	 * 通过家庭成员id查询家庭成员信息
	 * 
	 * @return
	 */
	public BOPersonFamily selectFamilyById(long familyId);

	/**
	 * 就诊记录分页-个人
	 * 
	 * @return
	 */
	public Page<MedicalVisitBean> selectMedicalRecordPage(String name, int sex, String dateB, String dateE, long patientId, long userId, long doctorId,
			int currentPage, int pageSize);

	/**
	 * 就诊记录分页-便民点
	 * 
	 * @return
	 */
	// public Page<MzMedicalRecord> selectMedicalVisitPage(String name, int sex,
	// String dateB,String dateE,long patientId,long userId, long doctorId, int
	// currentPage, int pageSize);

	/**
	 * 就诊记录分页-便民点
	 * 
	 * @return
	 */
	// public Page<MzMedicalRecord> selectMedicalVisitPageBypatientId(String
	// name, int sex, String dateB,String dateE,long patientId,long userId, long
	// doctorId, int currentPage, int pageSize);

	/**
	 * 就诊记录详细
	 * 
	 * @param visitId
	 * @return
	 */
	public MedicalRecordBean selectMedicalRecord(long visitId);

	/**
	 * 通过就诊id查询所有处方
	 * 
	 * @param visitId
	 * @return
	 */
	public List<OrderBean> orderByVisit(long visitId);

	/**
	 * 通过处方id查询所有药品
	 * 
	 * @param orderId
	 * @return
	 */
	public List<OrderDtlSupplyFrequencyBean> orderDtlByOrderId(long orderId);

	/**
	 * 通过处方id查询处方详细
	 * 
	 * @param orderId
	 * @return
	 */
	public OrderBean orderById(long orderId);

	List<MedicalVisitBean> getMedicalRecordPage(int currentPage, int pageSize, long patientId, long userId, long doctorId);

	/**
	 * 根据用户id查询出个人资料
	 * @param userId
	 * @return
	 */
	XtPersonBean getPersonByUserId(Long userId);
	
	/**
	 * 修改个人信息
	 * @param xtPersonBean
	 * @return
	 */
	Integer updateXtPerson(XtPersonBean xtPersonBean);
}
