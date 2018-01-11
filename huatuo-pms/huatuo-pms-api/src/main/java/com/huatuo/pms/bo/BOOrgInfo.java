package com.huatuo.pms.bo;

import java.io.Serializable;

import com.huatuo.bean.XtAddressBean;


@SuppressWarnings("serial")
public class BOOrgInfo extends BaseUserInfo implements Serializable{
	private int parentId;
	private int orgId;
	private String orgname;
	private String aliasName;
	private int orgKind;
	private long addressId;
	private XtAddressBean xtAddressBean;
	
	private int setupType;
	private int scale;
	private String telephone;
	private String pyCode;
	private String email;
	private String description;
	private String dCode;
	private boolean delFlag;
	private boolean isOpen;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public XtAddressBean getXtAddressBean() {
		return xtAddressBean;
	}

	public void setXtAddressBean(XtAddressBean xtAddressBean) {
		this.xtAddressBean = xtAddressBean;
	}

	public int getSetupType() {
		return setupType;
	}

	public void setSetupType(int setupType) {
		this.setupType = setupType;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDelFlag() {
		return delFlag;
	}

	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public int getOrgKind() {
		return orgKind;
	}

	public void setOrgKind(int orgKind) {
		this.orgKind = orgKind;
	}
	
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getPyCode() {
		return pyCode;
	}

	public void setPyCode(String pyCode) {
		this.pyCode = pyCode;
	}

	public String getdCode() {
		return dCode;
	}

	public void setdCode(String dCode) {
		this.dCode = dCode;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	/*public OrgInfo(XtUser user, XtZdOrg zdOrg) {
		super(user);
		if (zdOrg == null) {
			return;
		}
		this.orgKind = zdOrg.getOrgKind();
		this.pyCode = zdOrg.getPyCode();
		this.address = zdOrg.getAddress();
		this.aliasName = zdOrg.getAliasName();
		this.dCode = zdOrg.getdCode();
		this.description = zdOrg.getDescription();
		this.email = zdOrg.getEmail();
		this.orgname = zdOrg.getName();
		this.orgDistrict = zdOrg.getOrgDistrict();
		this.orgId = zdOrg.getId();
		this.orgKind = zdOrg.getOrgKind();
		this.scale = zdOrg.getScale();
		this.setupType = zdOrg.getSetupType();
		this.telephone = zdOrg.getTelephone();
	}*/
}
