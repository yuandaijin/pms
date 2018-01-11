package com.huatuo.pms.bo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BOZdOrg implements Serializable{
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.id
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private int id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.parent_id
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private int parentId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.name
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.alias_name
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String aliasName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.org_kind
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private int orgKind;
	
	 /**
     * 省份id
     */
    private int provinceCode;

    /**
     * 省份
     */
    private String province;
	 /**
     *城市id
     */
    private int cityCode;

    /**
     * 城市
     */
    private String city;

    /**
     *区/县id
     */
    private int countyCode;

    /**
     * 区/县
     */
    private String county;

    /**
     * 街道id
     */
    private int roadCode;

    /**
     * 街道
     */
    private String road;
    
    /**
     * 地址Id
     */
    private long addressId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.org_district
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private int orgDistrict;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.address
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String address;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.setup_type
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private int setupType;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.scale
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private int scale;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.telephone
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String telephone;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.py_code
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String pyCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.email
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String email;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.description
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String description;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.d_code
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private String dCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.del_flag
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private boolean delFlag;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column xt_zd_org.is_open
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	private boolean isOpen;
	private String createTime;
	
	/**
	 * 经度
	 */
	private double longitude;
	
	/**
	 * 纬度
	 */
	private double latitude;
	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.id
	 * 
	 * @return the value of xt_zd_org.id
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public int getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.id
	 * 
	 * @param id
	 *            the value for xt_zd_org.id
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.parent_id
	 * 
	 * @return the value of xt_zd_org.parent_id
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.parent_id
	 * 
	 * @param parentId
	 *            the value for xt_zd_org.parent_id
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.name
	 * 
	 * @return the value of xt_zd_org.name
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.name
	 * 
	 * @param name
	 *            the value for xt_zd_org.name
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.alias_name
	 * 
	 * @return the value of xt_zd_org.alias_name
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getAliasName() {
		return aliasName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.alias_name
	 * 
	 * @param aliasName
	 *            the value for xt_zd_org.alias_name
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.org_kind
	 * 
	 * @return the value of xt_zd_org.org_kind
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public int getOrgKind() {
		return orgKind;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.org_kind
	 * 
	 * @param orgKind
	 *            the value for xt_zd_org.org_kind
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setOrgKind(int orgKind) {
		this.orgKind = orgKind;
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

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.org_district
	 * 
	 * @return the value of xt_zd_org.org_district
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public int getOrgDistrict() {
		return orgDistrict;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.org_district
	 * 
	 * @param orgDistrict
	 *            the value for xt_zd_org.org_district
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setOrgDistrict(int orgDistrict) {
		this.orgDistrict = orgDistrict;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.address
	 * 
	 * @return the value of xt_zd_org.address
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.address
	 * 
	 * @param address
	 *            the value for xt_zd_org.address
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.setup_type
	 * 
	 * @return the value of xt_zd_org.setup_type
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public int getSetupType() {
		return setupType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.setup_type
	 * 
	 * @param setupType
	 *            the value for xt_zd_org.setup_type
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setSetupType(int setupType) {
		this.setupType = setupType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.scale
	 * 
	 * @return the value of xt_zd_org.scale
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.scale
	 * 
	 * @param scale
	 *            the value for xt_zd_org.scale
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setScale(int scale) {
		this.scale = scale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.telephone
	 * 
	 * @return the value of xt_zd_org.telephone
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.telephone
	 * 
	 * @param telephone
	 *            the value for xt_zd_org.telephone
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.py_code
	 * 
	 * @return the value of xt_zd_org.py_code
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getPyCode() {
		return pyCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.py_code
	 * 
	 * @param pyCode
	 *            the value for xt_zd_org.py_code
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setPyCode(String pyCode) {
		this.pyCode = pyCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.email
	 * 
	 * @return the value of xt_zd_org.email
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.email
	 * 
	 * @param email
	 *            the value for xt_zd_org.email
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.description
	 * 
	 * @return the value of xt_zd_org.description
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.description
	 * 
	 * @param description
	 *            the value for xt_zd_org.description
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.d_code
	 * 
	 * @return the value of xt_zd_org.d_code
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public String getdCode() {
		return dCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.d_code
	 * 
	 * @param dCode
	 *            the value for xt_zd_org.d_code
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setdCode(String dCode) {
		this.dCode = dCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.del_flag
	 * 
	 * @return the value of xt_zd_org.del_flag
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public boolean isDelFlag() {
		return delFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.del_flag
	 * 
	 * @param delFlag
	 *            the value for xt_zd_org.del_flag
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column xt_zd_org.is_open
	 * 
	 * @return the value of xt_zd_org.is_open
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public boolean isIsOpen() {
		return isOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column xt_zd_org.is_open
	 * 
	 * @param isOpen
	 *            the value for xt_zd_org.is_open
	 * 
	 * @mbggenerated Tue Aug 18 12:19:49 CST 2015
	 */
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	
	
}
