package com.huatuo.pms.bo;

import java.io.Serializable;

import com.huatuo.bean.XtAddressBean;


@SuppressWarnings("serial")
public class BOPersonInfo extends BaseUserInfo implements Serializable{
	private long personId;
	private String age;
	private int sex;
	private String birthdate;
	private int marry;
	private String nation;
	private String birthPlace;
	private long addressId;
	/**
	 * 地址相关的bean
	 */
	private XtAddressBean xtAddressBean;
	/*private int provinceCode;
	private String province;
	private int cityCode;
	private String city;
	private int countyCode;
	private String county;
	private int roadCode;
	private String road;
	private String homeAddress;*/
	private int occupationId;
	private String homeTel;
	private String socialId;
	private String allergicHistory;
	private int socialIdType;
	private double weight;
	private double height;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSocialIdType() {
		return socialIdType;
	}

	public void setSocialIdType(int socialIdType) {
		this.socialIdType = socialIdType;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getMarry() {
		return marry;
	}

	public void setMarry(int marry) {
		this.marry = marry;
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

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	/*public int getProvinceCode() {
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

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}*/

	public XtAddressBean getXtAddressBean() {
		return xtAddressBean;
	}

	public void setXtAddressBean(XtAddressBean xtAddressBean) {
		this.xtAddressBean = xtAddressBean;
	}

	public Integer getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(Integer occupationId) {
		this.occupationId = occupationId;
	}

	public String getHomeTel() {
		return homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/*public PersonInfo(XtUser user, XtPerson person) {
		super(user);
		if (person == null) {
			return;
		}
		this.personId = person.getId() != 0 ? person.getId() : null;
		this.age = person.getAge();
		this.sex = person.getSex();
		this.birthdate = person.getBirthdate();
		this.marry = person.getMarry();
		this.birthPlace = person.getBirthPlace();
		this.homeDistrict = person.getHomeDistrict();
		this.homeAddress = person.getHomeAddress();
		this.occupationId = person.getOccupationId();
		this.homeTel = person.getHomeTel();
		this.socialId = person.getSocialId();
		this.allergicHistory = person.getAllergicHistory();
		this.socialIdType = person.getSocialIdType();
		this.weight = person.getWeight();
		this.nation = person.getNation();
	}*/
    public BOPersonInfo() {
		
	}
}
