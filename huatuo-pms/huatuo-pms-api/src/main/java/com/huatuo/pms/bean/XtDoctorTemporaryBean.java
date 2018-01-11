package com.huatuo.pms.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XtDoctorTemporaryBean implements Serializable{

	private String doctorId;

    private String userId;

    private String name;

    private Integer age;

    private Integer sex;

    private String nation;

    private String birthdate;

    private String birthPlace;
    
    private String duty;

    private String language;

    private String languageCn;

    private String specialtyId;

    private String orgId;

    private Integer doctorType;

    private String dept;

    private String deptCn;

    private Integer titlesClinical;
    
    private String TitlesClinicalName;
    
    private Integer titlesTeach;
    
    private String titlesTeachName;

    private String goodAt;

    private String avgTime;

    private Integer socialIdType;

    private String socialId;

    private String roleId;

    private String picture;

    private Integer praise;

    private Float appraise;

    private BigDecimal twPrice;

    private BigDecimal spPrice;

    private BigDecimal smPrice;

    private BigDecimal yyPrice;

    private Integer isTw;

    private Integer isSp;

    private Integer isSm;

    private Integer isJt;

    private Integer isYy;

    private Integer isCs;

    private String doctorApplyId;

    private Integer delFlag;

    private Long bonusId;

    private String seatType;

    private String seatTitle;

    private Date syncTime;

    private Integer uses;

    private String addressId;

    private Integer taskState;

    private String taskDescribe;

    private String taskTime;

    private String taskCmsUserId;

    private String createTime;

    private Integer authenticationState;

    private String synopsis;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getLanguageCn() {
        return languageCn;
    }

    public void setLanguageCn(String languageCn) {
        this.languageCn = languageCn == null ? null : languageCn.trim();
    }

    public String getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(String specialtyId) {
        this.specialtyId = specialtyId == null ? null : specialtyId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Integer getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(Integer doctorType) {
        this.doctorType = doctorType;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getDeptCn() {
        return deptCn;
    }

    public void setDeptCn(String deptCn) {
        this.deptCn = deptCn == null ? null : deptCn.trim();
    }

    public Integer getTitlesClinical() {
        return titlesClinical;
    }

    public void setTitlesClinical(Integer titlesClinical) {
        this.titlesClinical = titlesClinical;
    }

    public Integer getTitlesTeach() {
        return titlesTeach;
    }

    public void setTitlesTeach(Integer titlesTeach) {
        this.titlesTeach = titlesTeach;
    }

    public String getGoodAt() {
        return goodAt;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt == null ? null : goodAt.trim();
    }

    public String getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(String avgTime) {
        this.avgTime = avgTime == null ? null : avgTime.trim();
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
        this.socialId = socialId == null ? null : socialId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Float getAppraise() {
        return appraise;
    }

    public void setAppraise(Float appraise) {
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

    public BigDecimal getYyPrice() {
        return yyPrice;
    }

    public void setYyPrice(BigDecimal yyPrice) {
        this.yyPrice = yyPrice;
    }

    public Integer getIsTw() {
        return isTw;
    }

    public void setIsTw(Integer isTw) {
        this.isTw = isTw;
    }

    public Integer getIsSp() {
        return isSp;
    }

    public void setIsSp(Integer isSp) {
        this.isSp = isSp;
    }

    public Integer getIsSm() {
        return isSm;
    }

    public void setIsSm(Integer isSm) {
        this.isSm = isSm;
    }

    public Integer getIsJt() {
        return isJt;
    }

    public void setIsJt(Integer isJt) {
        this.isJt = isJt;
    }

    public Integer getIsYy() {
        return isYy;
    }

    public void setIsYy(Integer isYy) {
        this.isYy = isYy;
    }

    public Integer getIsCs() {
        return isCs;
    }

    public void setIsCs(Integer isCs) {
        this.isCs = isCs;
    }

    public String getDoctorApplyId() {
        return doctorApplyId;
    }

    public void setDoctorApplyId(String doctorApplyId) {
        this.doctorApplyId = doctorApplyId == null ? null : doctorApplyId.trim();
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Long getBonusId() {
        return bonusId;
    }

    public void setBonusId(Long bonusId) {
        this.bonusId = bonusId;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType == null ? null : seatType.trim();
    }

    public String getSeatTitle() {
        return seatTitle;
    }

    public void setSeatTitle(String seatTitle) {
        this.seatTitle = seatTitle == null ? null : seatTitle.trim();
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public Integer getUses() {
        return uses;
    }

    public void setUses(Integer uses) {
        this.uses = uses;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public String getTaskDescribe() {
        return taskDescribe;
    }

    public void setTaskDescribe(String taskDescribe) {
        this.taskDescribe = taskDescribe == null ? null : taskDescribe.trim();
    }

    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime == null ? null : taskTime.trim();
    }

    public String getTaskCmsUserId() {
        return taskCmsUserId;
    }

    public void setTaskCmsUserId(String taskCmsUserId) {
        this.taskCmsUserId = taskCmsUserId == null ? null : taskCmsUserId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getAuthenticationState() {
        return authenticationState;
    }

    public void setAuthenticationState(Integer authenticationState) {
        this.authenticationState = authenticationState;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }
    

    public String getTitlesClinicalName() {
		return TitlesClinicalName;
	}

	public void setTitlesClinicalName(String titlesClinicalName) {
		TitlesClinicalName = titlesClinicalName;
	}

	public String getTitlesTeachName() {
		return titlesTeachName;
	}

	public void setTitlesTeachName(String titlesTeachName) {
		this.titlesTeachName = titlesTeachName;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorId=").append(doctorId);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", nation=").append(nation);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", birthPlace=").append(birthPlace);
        sb.append(", language=").append(language);
        sb.append(", languageCn=").append(languageCn);
        sb.append(", specialtyId=").append(specialtyId);
        sb.append(", orgId=").append(orgId);
        sb.append(", doctorType=").append(doctorType);
        sb.append(", dept=").append(dept);
        sb.append(", deptCn=").append(deptCn);
        sb.append(", titlesClinical=").append(titlesClinical);
        sb.append(", titlesTeach=").append(titlesTeach);
        sb.append(", goodAt=").append(goodAt);
        sb.append(", avgTime=").append(avgTime);
        sb.append(", socialIdType=").append(socialIdType);
        sb.append(", socialId=").append(socialId);
        sb.append(", roleId=").append(roleId);
        sb.append(", picture=").append(picture);
        sb.append(", praise=").append(praise);
        sb.append(", appraise=").append(appraise);
        sb.append(", twPrice=").append(twPrice);
        sb.append(", spPrice=").append(spPrice);
        sb.append(", smPrice=").append(smPrice);
        sb.append(", yyPrice=").append(yyPrice);
        sb.append(", isTw=").append(isTw);
        sb.append(", isSp=").append(isSp);
        sb.append(", isSm=").append(isSm);
        sb.append(", isJt=").append(isJt);
        sb.append(", isYy=").append(isYy);
        sb.append(", isCs=").append(isCs);
        sb.append(", doctorApplyId=").append(doctorApplyId);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", bonusId=").append(bonusId);
        sb.append(", seatType=").append(seatType);
        sb.append(", seatTitle=").append(seatTitle);
        sb.append(", syncTime=").append(syncTime);
        sb.append(", uses=").append(uses);
        sb.append(", addressId=").append(addressId);
        sb.append(", taskState=").append(taskState);
        sb.append(", taskDescribe=").append(taskDescribe);
        sb.append(", taskTime=").append(taskTime);
        sb.append(", taskCmsUserId=").append(taskCmsUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", authenticationState=").append(authenticationState);
        sb.append(", synopsis=").append(synopsis);
        sb.append("]");
        return sb.toString();
    }
}