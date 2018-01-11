package com.huatuo.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.bean.XtPersonBean;
import com.huatuo.common.Page;
import com.huatuo.common.Utils;
import com.huatuo.db.bean.MzMedicalRecord;
import com.huatuo.db.bean.MzOrder;
import com.huatuo.db.bean.MzZdFrequency;
import com.huatuo.db.bean.VMedicalVisit;
import com.huatuo.db.bean.VOrderDtlSupplyFrequency;
import com.huatuo.db.bean.XtPerson;
import com.huatuo.db.bean.XtPersonFamily;
import com.huatuo.db.bean.XtZdOccupation;
import com.huatuo.db.bean.YpZdSupply;
import com.huatuo.db.bean.YpZdUnit;
import com.huatuo.db.pojo.PersonFamilyPojo;
import com.huatuo.db.repository.DbMedicalRecordRepository;
import com.huatuo.db.repository.DbMzZdFrequencyRepository;
import com.huatuo.db.repository.DbOccupationRepository;
import com.huatuo.db.repository.DbOderRepository;
import com.huatuo.db.repository.DbPersonRepository;
import com.huatuo.db.repository.DbYpZdUnitRepository;
import com.huatuo.db.repository.DbZdSupplyRepository;
import com.huatuo.pms.bean.MedicalRecordBean;
import com.huatuo.pms.bean.MedicalVisitBean;
import com.huatuo.pms.bean.OrderBean;
import com.huatuo.pms.bean.OrderDtlSupplyFrequencyBean;
import com.huatuo.pms.bo.BOPerson;
import com.huatuo.pms.bo.BOPersonFamily;
import com.huatuo.pms.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private DbPersonRepository personRepository;

	@Autowired
	private DbMedicalRecordRepository medicalRecordRepository;

	@Autowired
	private DbOderRepository mzOderRepository;
	
	@Autowired
	private DbZdSupplyRepository dbZdSupplyRepository;
	
	@Autowired
	private DbMzZdFrequencyRepository frequencyRepository;
	
	@Autowired
	private DbYpZdUnitRepository unitRepository;
	
	/**
	 * 是否发布(0:发布,1:未发布)
	 */
	private static final int ORDER_STATE = 0;//发布

	@Override
	public int updateOrSave(BOPerson person) {
		XtPerson target = new XtPerson();
		target=Utils.exchangeObject(person, target.getClass());
		long id = person.getId();
		int rows = 0;
		if (id == 0) {
			rows = personRepository.insert(target);
		} else {
			rows = personRepository.update(target);
		}
		return rows;
	}

	@Override
	public int updateOrSaveFamily(BOPersonFamily person) {

		XtPersonFamily xpf = new XtPersonFamily();
		xpf=Utils.exchangeObject(person, xpf.getClass());
		long id = person.getId();
		int rows = 0;
		if (id == 0) {
			rows = personRepository.insertFamily(xpf);
		} else {
			rows = personRepository.updateFamily(xpf);
		}
		return rows;
	}

	@Override
	public List<BOPersonFamily> selectFamilyList(long userId) {
		List<PersonFamilyPojo> ls = personRepository.selectFamily(userId);
		ArrayList<BOPersonFamily> targetLs = new ArrayList<BOPersonFamily>();
		for (PersonFamilyPojo pf : ls) {
			BOPersonFamily target = new BOPersonFamily();
			target=Utils.exchangeObject(pf, target.getClass());
			target.setAge(Utils.getLocalizedAge(target.getBirthdate()));
			targetLs.add(target);
		}
		return targetLs;
	}

	@Override
	public BOPersonFamily selectFamilyById(long familyId) {
		PersonFamilyPojo famlimy = personRepository.selectFamilyById(familyId);
		BOPersonFamily target = new BOPersonFamily();
		target=Utils.exchangeObject(famlimy, target.getClass());
		return target;
	}

	@Autowired
	private DbOccupationRepository occupationRepository;
	
	@Override
	public Page<MedicalVisitBean> selectMedicalRecordPage(String name, int sex, String dateB, String dateE, long patientId, long userId, long doctorId,
			int currentPage, int pageSize) {
		if (dateE == null || "".equals(dateE)) {
			java.text.SimpleDateFormat matter1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			dateE = matter1.format(new Date());
		}
		// 计算查询偏条数
		int total = medicalRecordRepository.count(name, sex, dateB, dateE, patientId, userId, doctorId);
		Page<MedicalVisitBean> pageBack = new Page<MedicalVisitBean>(total, currentPage, pageSize);
		if(total>0){
			Page<VMedicalVisit> page = new Page<VMedicalVisit>(total, currentPage, pageSize);
			// 查询list
			List<VMedicalVisit> list = medicalRecordRepository.selectMedicalRecordPage(name, sex, dateB, dateE, patientId, userId, doctorId,
					page.getStart(), pageSize);
			List<MedicalVisitBean> beansList = new ArrayList<MedicalVisitBean>();
			for (VMedicalVisit vMedicalVisit : list) {
				int occupationId = vMedicalVisit.getOccupationId();
				if (occupationId != 0) {
					XtZdOccupation xtZdOccupation = occupationRepository.selectOccupation(occupationId);
					if (xtZdOccupation != null) {
						vMedicalVisit.setOccupationName(xtZdOccupation.getName());
					}
				}
				MedicalVisitBean medicalVisitBean = Utils.exchangeObject(vMedicalVisit, MedicalVisitBean.class);
				beansList.add(medicalVisitBean);
			}
			pageBack.setList(beansList);
		}
		// 计算总页数
		return pageBack;
	}

	// @Override
	// public Page<MzMedicalRecord> selectMedicalVisitPage(String name, int sex,
	// String dateB, String dateE, long patientId, long userId,
	// long doctorId, int currentPage, int pageSize) {
	//
	// // if(dateE==null || "".equals(dateE)){
	// // java.text.SimpleDateFormat matter1=new
	// // java.text.SimpleDateFormat("yyyy-MM-dd");
	// // dateE=matter1.format(new Date());
	// // }
	// // 计算查询偏条数
	// int total = medicalRecordRepository.count(name, sex, dateB, dateE,
	// patientId, userId, doctorId);
	// Page<MzMedicalRecord> page = new
	// Page<MzMedicalRecord>(total,currentPage,pageSize);
	// // 查询list
	// List<MzMedicalRecord> list = medicalRecordRepository
	// .selectMedicalRecordPage(name, sex, dateB, dateE, patientId,
	// userId, doctorId, page.getStart(), pageSize);
	// page.setList(list);
	// return page;
	// }

	// @Override
	// public Page<MzMedicalRecord> selectMedicalVisitPageBypatientId(String
	// name,
	// int sex, String dateB, String dateE, long patientId, long userId,
	// long doctorId, int currentPage, int pageSize) {
	//
	// // if(dateE==null || "".equals(dateE)){
	// // java.text.SimpleDateFormat matter1=new
	// // java.text.SimpleDateFormat("yyyy-MM-dd");
	// // dateE=matter1.format(new Date());
	// // }
	// // 计算查询偏条数
	// int total = medicalRecordRepository.count(name, sex, dateB,
	// dateE, patientId, userId, doctorId);
	// Page<MzMedicalRecord> page = new
	// Page<MzMedicalRecord>(total,currentPage,pageSize);
	// // 查询list
	// List<MzMedicalRecord> list = medicalRecordRepository
	// .selectMedicalRecordPage(name, sex, dateB, dateE,
	// patientId, userId, doctorId, page.getStart(), pageSize);
	// page.setList(list);
	// return page;
	// }

	@Override
	public List<OrderBean> orderByVisit(long visitId) {
		List<OrderBean> beansList = new ArrayList<>();
		List<MzOrder> list = mzOderRepository.orderByVisit(visitId);
		for (MzOrder mzOrder : list) {
			if(mzOrder.getOrderState() == ORDER_STATE){	
				OrderBean orderBean = Utils.exchangeObject(mzOrder, OrderBean.class);
				beansList.add(orderBean);
			}
		}
		return beansList;
	}

	@Override
	public List<OrderDtlSupplyFrequencyBean> orderDtlByOrderId(long orderId) {
		List<OrderDtlSupplyFrequencyBean> beansList = new ArrayList<>();
		List<VOrderDtlSupplyFrequency> list = mzOderRepository.orderDtlByOrder(orderId);
		for (VOrderDtlSupplyFrequency source : list) {
			OrderDtlSupplyFrequencyBean bean = Utils.exchangeObject(source, OrderDtlSupplyFrequencyBean.class);
			//查询单位
			YpZdSupply supply = dbZdSupplyRepository.getSupplyById(source.getSupplyId());
			MzZdFrequency frequency = frequencyRepository.getZdFrequency(source.getFrequId());
			YpZdUnit unit1 = unitRepository.selectYpZdUnit(source.getAmountUnit());
			YpZdUnit unit2 = unitRepository.selectYpZdUnit(source.getUseUnit());
			YpZdUnit unit3 = unitRepository.selectYpZdUnit(source.getDoseUnit());
			//将单位放入bean
			bean.setSupplyName(supply==null?"":supply.getName());
			bean.setFrequName(frequency==null?"":frequency.getName());
			bean.setPrintName(frequency==null?"":frequency.getPrintName());
			bean.setAmountName(unit1==null?"":unit1.getName());
			bean.setUseName(unit2==null?"":unit2.getName());
			bean.setDoseName(unit3==null?"":unit3.getName());
			
			beansList.add(bean);
		}
		return beansList;
	}

	@Override
	public MedicalRecordBean selectMedicalRecord(long visitId) {
		MzMedicalRecord medicalRecord = medicalRecordRepository.selectMedicalRecord(visitId);
		MedicalRecordBean medicalRecordBean = Utils.exchangeObject(medicalRecord, MedicalRecordBean.class);
		return medicalRecordBean;
	}

	@Override
	public OrderBean orderById(long orderId) {
		MzOrder mzOrder = mzOderRepository.orderById(orderId);
		OrderBean orderBean = Utils.exchangeObject(mzOrder, OrderBean.class);
		return orderBean;
	}

	@Override
	public List<MedicalVisitBean> getMedicalRecordPage(int currentPage, int pageSize, long patientId, long userId, long doctorId) {
		if (currentPage == 0) {
			currentPage++;
		}
		int start = (currentPage - 1) * pageSize;
		// 查询list
		List<MedicalVisitBean> beansList = new ArrayList<>();
		List<VMedicalVisit> list = medicalRecordRepository.selectMedicalRecordPage("", 3, "", "", patientId, userId, doctorId, start, pageSize);
		for (VMedicalVisit vMedicalVisit : list) {
			MedicalVisitBean medicalVisitBean = Utils.exchangeObject(vMedicalVisit, MedicalVisitBean.class);
			beansList.add(medicalVisitBean);
		}
		return beansList;
	}

	@Override
	public XtPersonBean getPersonByUserId(Long userId) {
		if(userId == null || userId <= 0){
			throw new RuntimeException("用户Id为空");
		}
		return Utils.exchangeObject(personRepository.getPersonByUserId(userId), XtPersonBean.class);
	}

	@Override
	public Integer updateXtPerson(XtPersonBean xtPersonBean) {
		return personRepository.update(Utils.exchangeObject(xtPersonBean, XtPerson.class));
	}
}
