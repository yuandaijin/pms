package com.huatuo.request;

import java.math.BigDecimal;

public class DoctorForm {
	public long userId;
	public String userName;
	public String name;
	public String mobile;
	public String email;
	public long doctorId;
	public int sex;
	public int age;
	public String birthdate;
	public String language;
	public int socialIdType;
	public String socialId;
	public int specialtyId;
	public int zdOrgId;
	public String dept;
	/**
     * 临床职称
     */
    private int titlesClinical;
    
    /**
     * 临床职称名称
     */
    private String titlesClinicalName;
    
    /**
     * 教学职称
     */
    private int titlesTeach;
    
    /**
     * 图文咨询价格
     */
    private BigDecimal twPrice;
    /**
     * 视频门诊价格
     */
    private BigDecimal spPrice;
    /**
     * 上门服务价格
     */
    private BigDecimal smPrice;
    
    
    public BigDecimal getTwPrice() {
		return twPrice;
	}
	public void setTwPrice(BigDecimal twPrice) {
		this.twPrice = twPrice;
	}
	public BigDecimal getSpPrice() {
		return spPrice;
	}
	public void setSpPrice(BigDecimal spPrice) {
		this.spPrice = spPrice;
	}
	public BigDecimal getSmPrice() {
		return smPrice;
	}
	public void setSmPrice(BigDecimal smPrice) {
		this.smPrice = smPrice;
	}
	/**
     * 教学职称名称
     */
    private String titlesTeachName;
	public String goodAt;
//	public String picture;
	public String nation;
	public String birthPlace;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
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
	public int getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}
	public int getZdOrgId() {
		return zdOrgId;
	}
	public void setZdOrgId(int zdOrgId) {
		this.zdOrgId = zdOrgId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getTitlesClinical() {
		return titlesClinical;
	}
	public void setTitlesClinical(int titlesClinical) {
		this.titlesClinical = titlesClinical;
	}
	public String getTitlesClinicalName() {
		return titlesClinicalName;
	}
	public void setTitlesClinicalName(String titlesClinicalName) {
		this.titlesClinicalName = titlesClinicalName;
	}
	public int getTitlesTeach() {
		return titlesTeach;
	}
	public void setTitlesTeach(int titlesTeach) {
		this.titlesTeach = titlesTeach;
	}
	public String getTitlesTeachName() {
		return titlesTeachName;
	}
	public void setTitlesTeachName(String titlesTeachName) {
		this.titlesTeachName = titlesTeachName;
	}
	public String getGoodAt() {
		return goodAt;
	}
	public void setGoodAt(String goodAt) {
		this.goodAt = goodAt;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	
}
