package com.huatuo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.common.Utils;
import com.huatuo.db.bean.XtDoctor;
import com.huatuo.db.repository.DbDoctorRepository;
import com.huatuo.pms.bean.XtDoctorsBean;
import com.huatuo.pms.bo.BODoctorInfo;
import com.huatuo.pms.services.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DbDoctorRepository doctorRepository;
	
	@Override
	public List<XtDoctorsBean> getDoctorByOrgId(Integer orgId) {
		List<XtDoctorsBean> list = new ArrayList<>();
		List<XtDoctor> list2 = doctorRepository.getDoctorByOrgId(orgId);
		for (XtDoctor xtDoctor : list2) {
			Integer titlesClinical = xtDoctor.getTitlesClinical();
			if(titlesClinical == null){
				titlesClinical = 0;
				xtDoctor.setTitlesClinical(titlesClinical);
			}
			list.add(Utils.exchangeObject(xtDoctor, XtDoctorsBean.class));
		}
		return list;
	}
	@Override
	public BODoctorInfo getDoctorById(String doctorId) {
		XtDoctor xtDoctor = doctorRepository.findDoctor(Long.parseLong(doctorId));
		return Utils.exchangeObject(xtDoctor, BODoctorInfo.class);
	}
	@Override
	public BODoctorInfo getDoctorByUserId(String userId) {
		XtDoctor xtDoctor = doctorRepository.getDoctorByUserId(Long.parseLong(userId));
		return Utils.exchangeObject(xtDoctor, BODoctorInfo.class);
	}
	@Override
	public int countNum(String roleId, List<Integer> orgIds, String startTime, String endTime) {
		int count = doctorRepository.countNum(roleId, orgIds, startTime, endTime);
		if(count > 0){
			return count;
		}
		return 0;
	}
	@Override
	public int countDoctorTitle(List<Integer> orgIds, Integer titlesClinical) {
		int count = doctorRepository.countDoctorTitle(orgIds, titlesClinical);
		if(count > 0){
			return count;
		}
		return 0;
	}
}
