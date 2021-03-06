package com.huatuo.pms.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MedicalRecordBean implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.visit_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private long visitId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.patient_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private long patientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.times
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private int times;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.name
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.age
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.sex
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private int sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.marry
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private int marry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.birth_place
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String birthPlace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.home_town
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private long addressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.home_address
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String homeAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.occupation_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private int occupationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.relate_tel
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String relateTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.social_id_type
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private int socialIdType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.social_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String socialId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.create_time
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.create_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private long createDoctor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.chief_complaint
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String chiefComplaint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.allergic_history
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String allergicHistory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.present_illness
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String presentIllness;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.past_illness
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String pastIllness;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.suggestion
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String suggestion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.audit_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private long auditDoctor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.audit_time
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.status
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private int status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.BODY_EXAM
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String bodyExam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.DIAG_DESC
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String diagDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.rec_type
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private int recType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.consult_note
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String consultNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.consult_suggestion
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private String consultSuggestion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_medical_record.consult_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    private long consultDoctor;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.id
     *
     * @return the value of mz_medical_record.id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.id
     *
     * @param id the value for mz_medical_record.id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.visit_id
     *
     * @return the value of mz_medical_record.visit_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public long getVisitId() {
        return visitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.visit_id
     *
     * @param visitId the value for mz_medical_record.visit_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setVisitId(long visitId) {
        this.visitId = visitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.patient_id
     *
     * @return the value of mz_medical_record.patient_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public long getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.patient_id
     *
     * @param patientId the value for mz_medical_record.patient_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.times
     *
     * @return the value of mz_medical_record.times
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public int getTimes() {
        return times;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.times
     *
     * @param times the value for mz_medical_record.times
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setTimes(int times) {
        this.times = times;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.name
     *
     * @return the value of mz_medical_record.name
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.name
     *
     * @param name the value for mz_medical_record.name
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.age
     *
     * @return the value of mz_medical_record.age
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.age
     *
     * @param age the value for mz_medical_record.age
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.sex
     *
     * @return the value of mz_medical_record.sex
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public int getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.sex
     *
     * @param sex the value for mz_medical_record.sex
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.marry
     *
     * @return the value of mz_medical_record.marry
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public int getMarry() {
        return marry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.marry
     *
     * @param marry the value for mz_medical_record.marry
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setMarry(int marry) {
        this.marry = marry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.birth_place
     *
     * @return the value of mz_medical_record.birth_place
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.birth_place
     *
     * @param birthPlace the value for mz_medical_record.birth_place
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.home_address
     *
     * @return the value of mz_medical_record.home_address
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.home_address
     *
     * @param homeAddress the value for mz_medical_record.home_address
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.occupation_id
     *
     * @return the value of mz_medical_record.occupation_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public int getOccupationId() {
        return occupationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.occupation_id
     *
     * @param occupationId the value for mz_medical_record.occupation_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setOccupationId(int occupationId) {
        this.occupationId = occupationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.relate_tel
     *
     * @return the value of mz_medical_record.relate_tel
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getRelateTel() {
        return relateTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.relate_tel
     *
     * @param relateTel the value for mz_medical_record.relate_tel
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setRelateTel(String relateTel) {
        this.relateTel = relateTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.social_id_type
     *
     * @return the value of mz_medical_record.social_id_type
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public int getSocialIdType() {
        return socialIdType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.social_id_type
     *
     * @param socialIdType the value for mz_medical_record.social_id_type
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setSocialIdType(int socialIdType) {
        this.socialIdType = socialIdType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.social_id
     *
     * @return the value of mz_medical_record.social_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getSocialId() {
        return socialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.social_id
     *
     * @param socialId the value for mz_medical_record.social_id
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.create_time
     *
     * @return the value of mz_medical_record.create_time
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.create_time
     *
     * @param createTime the value for mz_medical_record.create_time
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.create_doctor
     *
     * @return the value of mz_medical_record.create_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public long getCreateDoctor() {
        return createDoctor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.create_doctor
     *
     * @param createDoctor the value for mz_medical_record.create_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setCreateDoctor(long createDoctor) {
        this.createDoctor = createDoctor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.chief_complaint
     *
     * @return the value of mz_medical_record.chief_complaint
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getChiefComplaint() {
        return chiefComplaint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.chief_complaint
     *
     * @param chiefComplaint the value for mz_medical_record.chief_complaint
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.allergic_history
     *
     * @return the value of mz_medical_record.allergic_history
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getAllergicHistory() {
        return allergicHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.allergic_history
     *
     * @param allergicHistory the value for mz_medical_record.allergic_history
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.present_illness
     *
     * @return the value of mz_medical_record.present_illness
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getPresentIllness() {
        return presentIllness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.present_illness
     *
     * @param presentIllness the value for mz_medical_record.present_illness
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setPresentIllness(String presentIllness) {
        this.presentIllness = presentIllness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.past_illness
     *
     * @return the value of mz_medical_record.past_illness
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getPastIllness() {
        return pastIllness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.past_illness
     *
     * @param pastIllness the value for mz_medical_record.past_illness
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setPastIllness(String pastIllness) {
        this.pastIllness = pastIllness;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.suggestion
     *
     * @return the value of mz_medical_record.suggestion
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.suggestion
     *
     * @param suggestion the value for mz_medical_record.suggestion
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.audit_doctor
     *
     * @return the value of mz_medical_record.audit_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public long getAuditDoctor() {
        return auditDoctor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.audit_doctor
     *
     * @param auditDoctor the value for mz_medical_record.audit_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setAuditDoctor(long auditDoctor) {
        this.auditDoctor = auditDoctor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.audit_time
     *
     * @return the value of mz_medical_record.audit_time
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.audit_time
     *
     * @param auditTime the value for mz_medical_record.audit_time
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.status
     *
     * @return the value of mz_medical_record.status
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public int getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.status
     *
     * @param status the value for mz_medical_record.status
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.BODY_EXAM
     *
     * @return the value of mz_medical_record.BODY_EXAM
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getBodyExam() {
        return bodyExam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.BODY_EXAM
     *
     * @param bodyExam the value for mz_medical_record.BODY_EXAM
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setBodyExam(String bodyExam) {
        this.bodyExam = bodyExam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.DIAG_DESC
     *
     * @return the value of mz_medical_record.DIAG_DESC
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getDiagDesc() {
        return diagDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.DIAG_DESC
     *
     * @param diagDesc the value for mz_medical_record.DIAG_DESC
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setDiagDesc(String diagDesc) {
        this.diagDesc = diagDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.rec_type
     *
     * @return the value of mz_medical_record.rec_type
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public int getRecType() {
        return recType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.rec_type
     *
     * @param recType the value for mz_medical_record.rec_type
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setRecType(int recType) {
        this.recType = recType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.consult_note
     *
     * @return the value of mz_medical_record.consult_note
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getConsultNote() {
        return consultNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.consult_note
     *
     * @param consultNote the value for mz_medical_record.consult_note
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setConsultNote(String consultNote) {
        this.consultNote = consultNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.consult_suggestion
     *
     * @return the value of mz_medical_record.consult_suggestion
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public String getConsultSuggestion() {
        return consultSuggestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.consult_suggestion
     *
     * @param consultSuggestion the value for mz_medical_record.consult_suggestion
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setConsultSuggestion(String consultSuggestion) {
        this.consultSuggestion = consultSuggestion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_medical_record.consult_doctor
     *
     * @return the value of mz_medical_record.consult_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public long getConsultDoctor() {
        return consultDoctor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_medical_record.consult_doctor
     *
     * @param consultDoctor the value for mz_medical_record.consult_doctor
     *
     * @mbggenerated Thu Aug 27 14:08:41 CST 2015
     */
    public void setConsultDoctor(long consultDoctor) {
        this.consultDoctor = consultDoctor;
    }
}