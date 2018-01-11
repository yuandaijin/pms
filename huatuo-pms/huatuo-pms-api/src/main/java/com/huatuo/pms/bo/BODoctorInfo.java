package com.huatuo.pms.bo;

import java.io.Serializable;


@SuppressWarnings("serial")
public class BODoctorInfo extends BaseUserInfo implements Serializable{
	private long doctorId;
	private long id;
	private int sex;
	
	private String age;
	
	private String birthdate;
	
	private String language;
	
	private int socialIdType;
	
	private String socialId;
	
	private int specialtyId;
	
	private int zdOrgId;
	
	private String zdOrgName;
	
	private String dept;
	
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
     * 教学职称名称
     */
    private String titlesTeachName;
	
	private String goodAt;
	
	private String avgTime;
	
	private String picture;
	
	private String nation;
	
	private String birthPlace;
	
	private float appraise;

	private double twPrice;

	private double spPrice;

	private double smPrice;
	
	private String roleId;
	
	private int doctorType;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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

	public String getZdOrgName() {
		return zdOrgName;
	}

	public void setZdOrgName(String zdOrgName) {
		this.zdOrgName = zdOrgName;
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

	public String getAvgTime() {
		return avgTime;
	}

	public void setAvgTime(String avgTime) {
		this.avgTime = avgTime;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
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

	public float getAppraise() {
		return appraise;
	}

	public void setAppraise(float appraise) {
		this.appraise = appraise;
	}

	public double getTwPrice() {
		return twPrice;
	}

	public void setTwPrice(double twPrice) {
		this.twPrice = twPrice;
	}

	public double getSpPrice() {
		return spPrice;
	}

	public void setSpPrice(double spPrice) {
		this.spPrice = spPrice;
	}

	public double getSmPrice() {
		return smPrice;
	}

	public void setSmPrice(double smPrice) {
		this.smPrice = smPrice;
	}

	public int getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(int doctorType) {
		this.doctorType = doctorType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	/*public DoctorInfo(XtUser user, VDoctorDetail doctor) {
		super(user);
		if (doctor == null) {
			return;
		}
		this.doctorId = doctor.getDoctorId();
		this.sex = doctor.getSex();
		this.age = doctor.getAge();
		this.birthdate = doctor.getBirthdate();
		this.language = doctor.getLanguage();
		this.socialIdType = doctor.getSocialIdType();
		this.socialId = doctor.getSocialId();
		this.specialtyId = doctor.getSpecialtyId();
		this.zdOrgId = doctor.getZdOrgId();
		this.zdOrgName = doctor.getOrgName();
		this.dept = doctor.getDept();
		this.titles = doctor.getTitles();
		this.goodAt = doctor.getGoodAt();
		this.avgTime = doctor.getAvgTime();
		this.picture = doctor.getPicture();
		this.nation = doctor.getNation();
		this.birthPlace = doctor.getBirthPlace();
	}*/
}
