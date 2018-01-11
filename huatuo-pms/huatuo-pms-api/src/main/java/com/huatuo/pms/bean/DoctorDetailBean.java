package com.huatuo.pms.bean;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class DoctorDetailBean implements Serializable {

	private static final long serialVersionUID = -3831606877444384700L;

	private Long userId;

    private Long doctorId;
    
    private String name;
    
    private String addressId; 
    private String address;

    private Integer age;

    private Integer sex;

    private String birthdate;

    private String language;

    private Integer specialtyId;

    private String specialtyName;

    private String userName;

    private String mobile;

    private String email;

    private Integer zdOrgId;

    private String orgName;

    private String dept;
    
    /**
     * 临床职称
     */
    private Integer titlesClinical;
    
    /**
     * 临床职称名称
     */
    private String titlesClinicalName;
    
    /**
     * 教学职称
     */
    private Integer titlesTeach;
    
    /**
     * 教学职称名称
     */
    private String titlesTeachName;

    private String goodAt;

    private String avgTime;
    
    private String createTime;

    private Integer socialIdType;

    private String socialId;

    private String picture;

    private Integer state;

    private String nation;

    private String birthPlace;
    
    private float appraise;

    private BigDecimal twPrice;

    private BigDecimal spPrice;

    private BigDecimal smPrice;
    
    private Integer isCheck;
    
    private String roleId;
    
    private Integer delFlag;

    private BigDecimal yyPrice;
    
    /**
	 * 是否开通预约服务
	 */
	private Integer isYy;
	
    /**
     * 是否开通视频门诊(0:未开通,1:开通)
     */
    private Integer isSp;
    
    private Integer doctorType;

	public BigDecimal getYyPrice() {
		return yyPrice;
	}

	public void setYyPrice(BigDecimal yyPrice) {
		this.yyPrice = yyPrice;
	}

	public Integer getIsYy() {
		return isYy;
	}

	public void setIsYy(Integer isYy) {
		this.isYy = isYy;
	}

	public Integer getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(Integer doctorType) {
		this.doctorType = doctorType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
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

	public Integer getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}

	public String getSpecialtyName() {
		return specialtyName;
	}

	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Integer getZdOrgId() {
		return zdOrgId;
	}

	public void setZdOrgId(Integer zdOrgId) {
		this.zdOrgId = zdOrgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getTitlesClinical() {
		return titlesClinical;
	}

	public void setTitlesClinical(Integer titlesClinical) {
		this.titlesClinical = titlesClinical;
	}

	public String getTitlesClinicalName() {
		return titlesClinicalName;
	}

	public void setTitlesClinicalName(String titlesClinicalName) {
		this.titlesClinicalName = titlesClinicalName;
	}

	public Integer getTitlesTeach() {
		return titlesTeach;
	}

	public void setTitlesTeach(Integer titlesTeach) {
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

	public Integer getSocialIdType() {
		return socialIdType;
	}

	public void setSocialIdType(Integer socialIdType) {
		this.socialIdType = socialIdType;
	}

	public String getSocialId() {
		return socialId;
	}

	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public Integer getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(Integer isCheck) {
		this.isCheck = isCheck;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public Integer getIsSp() {
		return isSp;
	}

	public void setIsSp(Integer isSp) {
		this.isSp = isSp;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		DoctorDetailBean doctorDetailBean=new DoctorDetailBean();
		Method method=doctorDetailBean.getClass().getMethod("getTitlesClinical");
		System.out.println(method.toString());
	}
	@Override
	public String toString() {
		return "DoctorDetailBean [userId=" + userId + ", doctorId=" + doctorId
				+ ", name=" + name + ", addressId=" + addressId + ", address="
				+ address + ", age=" + age + ", sex=" + sex + ", birthdate="
				+ birthdate + ", language=" + language + ", specialtyId="
				+ specialtyId + ", specialtyName=" + specialtyName
				+ ", userName=" + userName + ", mobile=" + mobile + ", email="
				+ email + ", zdOrgId=" + zdOrgId + ", orgName=" + orgName
				+ ", dept=" + dept + ", titlesClinical=" + titlesClinical
				+ ", titlesClinicalName=" + titlesClinicalName
				+ ", titlesTeach=" + titlesTeach + ", titlesTeachName="
				+ titlesTeachName + ", goodAt=" + goodAt + ", avgTime="
				+ avgTime + ", createTime=" + createTime + ", socialIdType="
				+ socialIdType + ", socialId=" + socialId + ", picture="
				+ picture + ", state=" + state + ", nation=" + nation
				+ ", birthPlace=" + birthPlace + ", appraise=" + appraise
				+ ", twPrice=" + twPrice + ", spPrice=" + spPrice
				+ ", smPrice=" + smPrice + ", isCheck=" + isCheck + ", roleId="
				+ roleId + ", delFlag=" + delFlag + ", yyPrice=" + yyPrice
				+ ", isYy=" + isYy + ", isSp=" + isSp + ", doctorType="
				+ doctorType + "]";
	}
}