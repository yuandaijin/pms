package com.huatuo.request;

import java.math.BigDecimal;

import javax.validation.constraints.Min;

import com.huatuo.common.BeansMessage;

public class VisitForm {

	private long userId = 0;
	
	private long personId = 0;
	
	private long memberId = 0;
	
	@Min(value = BeansMessage.IDVALUE, message = BeansMessage.DOCTORID)
	private long doctorId = 0;
	
	private String mzCode;
	
	private String visitDept;
	
	private String name;
	
	private int sex = 0;
	
	private String age;
	
	private int ageType;
	
	private int marry;
	
	private String birthPlace;				//籍贯
	
	private String nation;
	
	 private int provinceCode;
	    
	private String province;
	
	private int cityCode;
	
	private String city;
	
	private int countyCode;
	
	private String county;
	
	private int roadCode;
	
	private String road;
	
	private Long addressId;
	
	private String address;
	
	private int occupationId;
	
	private String tel;
	
	private int socialIdType;
	
	private String socialId;
	
	private int relationId;

	private String allergicHistory;
	
	private double weight;
	
	private String email;
	
	private String mobile;
	
	private String birthdate;
	
	private int visitType = 0;
	
	/**
	 * 病情描述
	 */
	private String illnessDescribe;
	
	/**
	 * 医生预约服务信息Id
	 */
	private Long reservationId;
	
	/**
	 * 服务费
	 */
	private BigDecimal serviceCost;
	
	/**
	 * 本人标记
	 */
	private Integer isSelfConsult;
	
	/**
	 * 患者id
	 */
	private Long patientId;
	
	/**
	 * 预约开始时间
	 */
	private String rStartTime;
	/**
	 * 预约结束时间
	 */
	private String rEndTime;
	
	/**
	 * 医生用户Id
	 */
	private Long doctorUid;
	
	/**
	 * 预约诊号
	 */
	private String reservationNum;
	
	/**
	 * 是否本人咨询
	 */
	private Integer selfFlag;
	
	/**
	 * 用户类型
	 */
	private String userType;
		
	/**
	 * 与visit订单11对应的支付订单号
	 */
	private String PayOrderNumber;
	
	/**
	 * 业务订单Id
	 */
	private Long visitId;
	
	public Long getVisitId() {
		return visitId;
	}
	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}
	public String getPayOrderNumber() {
		return PayOrderNumber;
	}
	public void setPayOrderNumber(String payOrderNumber) {
		PayOrderNumber = payOrderNumber;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Integer getSelfFlag() {
		return selfFlag;
	}
	public void setSelfFlag(Integer selfFlag) {
		this.selfFlag = selfFlag;
	}
	public String getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(String reservationNum) {
		this.reservationNum = reservationNum;
	}
	public Long getDoctorUid() {
		return doctorUid;
	}
	public void setDoctorUid(Long doctorUid) {
		this.doctorUid = doctorUid;
	}
	public String getrStartTime() {
		return rStartTime;
	}
	public void setrStartTime(String rStartTime) {
		this.rStartTime = rStartTime;
	}
	public String getrEndTime() {
		return rEndTime;
	}
	public void setrEndTime(String rEndTime) {
		this.rEndTime = rEndTime;
	}
		
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Long getReservationId() {
		return reservationId;
	}
	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
	public BigDecimal getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}
	public Integer getIsSelfConsult() {
		return isSelfConsult;
	}
	public void setIsSelfConsult(Integer isSelfConsult) {
		this.isSelfConsult = isSelfConsult;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public int getRelationId() {
		return relationId;
	}
	public void setRelationId(int relationId) {
		this.relationId = relationId;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getMzCode() {
		return mzCode;
	}
	public void setMzCode(String mzCode) {
		this.mzCode = mzCode;
	}
	public String getVisitDept() {
		return visitDept;
	}
	public void setVisitDept(String visitDept) {
		this.visitDept = visitDept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getAgeType() {
		return ageType;
	}
	public void setAgeType(int ageType) {
		this.ageType = ageType;
	}
	public int getMarry() {
		return marry;
	}
	public void setMarry(int marry) {
		this.marry = marry;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getSocialIdType() {
		return socialIdType;
	}
	public void setSocialIdType(int socialIdType) {
		this.socialIdType = socialIdType;
	}
	public String getSocialId() {
		return socialId;
	}
	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}
	public String getAllergicHistory() {
		return allergicHistory;
	}
	public void setAllergicHistory(String allergicHistory) {
		this.allergicHistory = allergicHistory;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public int getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(int countyCode) {
		this.countyCode = countyCode;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getRoadCode() {
		return roadCode;
	}
	public void setRoadCode(int roadCode) {
		this.roadCode = roadCode;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public int getVisitType() {
		return visitType;
	}
	public void setVisitType(int visitType) {
		this.visitType = visitType;
	}
	public String getIllnessDescribe() {
		return illnessDescribe;
	}
	public void setIllnessDescribe(String illnessDescribe) {
		this.illnessDescribe = illnessDescribe;
	}
	public VisitForm(){
	}
}
