package com.huatuo.pms.bean;

import java.io.Serializable;
import java.util.List;

import com.huatuo.bean.XtZdDistrictBean;

public class DistrictBean implements Serializable{

	private static final long serialVersionUID = 7181001347317513725L;

	private int provinceId;
	
	private List<XtZdDistrictBean> provinces;
	
	private int cityId;
	
	private List<XtZdDistrictBean> citys;
	
	private int countyId;

	private List<XtZdDistrictBean> countys;
	
	private int roadId;
	
	private List<XtZdDistrictBean> roads;

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public List<XtZdDistrictBean> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<XtZdDistrictBean> provinces) {
		this.provinces = provinces;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public List<XtZdDistrictBean> getCitys() {
		return citys;
	}

	public void setCitys(List<XtZdDistrictBean> citys) {
		this.citys = citys;
	}

	public int getCountyId() {
		return countyId;
	}

	public void setCountyId(int countyId) {
		this.countyId = countyId;
	}

	public List<XtZdDistrictBean> getCountys() {
		return countys;
	}

	public void setCountys(List<XtZdDistrictBean> countys) {
		this.countys = countys;
	}

	public int getRoadId() {
		return roadId;
	}

	public void setRoadId(int roadId) {
		this.roadId = roadId;
	}

	public List<XtZdDistrictBean> getRoads() {
		return roads;
	}

	public void setRoads(List<XtZdDistrictBean> roads) {
		this.roads = roads;
	}
	
}
