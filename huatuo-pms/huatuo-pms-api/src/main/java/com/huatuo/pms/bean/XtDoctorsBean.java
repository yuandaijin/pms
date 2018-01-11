package com.huatuo.pms.bean;

import java.io.Serializable;

public class XtDoctorsBean implements Serializable {

	private static final Long serialVersionUID = -727854376521533709L;
	  private Long id;
	/**
	 * 所属用户id
	 */
	private Long userId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 性别，0男，1女
	 */
	private Integer sex;

	/**
	 * 民族
	 */
	private String nation;

	/**
	 * 专科id
	 */
	private Integer specialtyId;

	/**
	 * 所属医院
	 */
	private Integer zdOrgId;

	/**
	 * 临床职称
	 */
	private Integer titlesClinical;

	/**
	 * 教学职称
	 */
	private Integer titlesTeach;

	/**
	 * 擅长
	 */
	private String goodAt;

	/**
	 * 身份证件号
	 */
	private String socialId;

	/**
	 * 医生角色
	 */
	private String roleId;

	/**
	 * 医生类型(1:西医 2:中医)
	 */
	private Integer doctorType;
	/**
	 * 所属科室
	 */
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Integer getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(Integer specialtyId) {
		this.specialtyId = specialtyId;
	}

	public Integer getZdOrgId() {
		return zdOrgId;
	}

	public void setZdOrgId(Integer zdOrgId) {
		this.zdOrgId = zdOrgId;
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
		this.goodAt = goodAt;
	}

	public String getSocialId() {
		return socialId;
	}

	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(Integer doctorType) {
		this.doctorType = doctorType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static Long getSerialversionuid() {
		return serialVersionUID;
	}

}