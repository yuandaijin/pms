package com.huatuo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.common.Utils;
import com.huatuo.db.bean.XtDoctorTemporary;
import com.huatuo.db.repository.DbDoctorTemporaryRepository;
import com.huatuo.pms.bean.XtDoctorTemporaryBean;
import com.huatuo.pms.services.DoctorTemporaryService;
@Service
public class DoctorTemporaryServiceImpl implements DoctorTemporaryService {
	
	@Autowired
	private DbDoctorTemporaryRepository doctorTemporaryRepository;
	
	@Override
	public List<XtDoctorTemporaryBean> getByOrgId(int orgId) {
		List<XtDoctorTemporaryBean> list = new ArrayList<>();
				
		List<XtDoctorTemporary> list2 = doctorTemporaryRepository.queryDoctorListByOrgId(orgId);
		for (XtDoctorTemporary xtDoctorTemporary : list2) {
			list.add(Utils.exchangeObject(xtDoctorTemporary, XtDoctorTemporaryBean.class));
		}
		
		return list;
	}

	@Override
	public XtDoctorTemporaryBean getByUserId(String id) {
		XtDoctorTemporary doctorTemporary = doctorTemporaryRepository.getByUserId(id);
		return Utils.exchangeObject(doctorTemporary, XtDoctorTemporaryBean.class);
	}
	
}
