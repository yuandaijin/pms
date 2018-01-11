package com.huatuo.pms.bo;

import java.io.Serializable;

public class BaseUserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -920637970055292342L;
	public long userId;
	public String userName;
	public String name;
	public String mobile;
	public String email;
	public String userType;
	private String token;
	private String loginType;
	/**
	 * 是否设置了支付密码
	 */
	private Integer isSetPayPwd;
	
	
	//哈尔滨项目需求字段
	/**
	 * 便民点用户-浮动推广页
	 * (0:不开启,1:开启);
	 * 默认不开启,
	 */
	private Integer promote;
	
	/**
	 * 便民点用户-支付流程
	 * (0:不需要支付,1:需要支付);
	 * 默认需要支付,
	 */
	private Integer needPay;
	
	/**
	 * 便民点用户-是否需要验证患者信息
	 * (0:否,1:是);
	 * 默认是,
	 */
	private Integer validatePatient;
	
	/**
	 * 便民点用户-web导航菜单栏
	 * (0:找医生,1:找医院,2:名医馆,3:服务记录,4:新闻资讯,5:健康百科);
	 * 默认全部(多个使用","分隔),
	 */
	private String webMenu;
	//哈尔滨项目需求字段
	

	public Integer getIsSetPayPwd() {
		return isSetPayPwd;
	}

	public void setIsSetPayPwd(Integer isSetPayPwd) {
		this.isSetPayPwd = isSetPayPwd;
	}

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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getWebMenu() {
		return webMenu;
	}

	public void setWebMenu(String webMenu) {
		this.webMenu = webMenu;
	}

	public Integer getPromote() {
		return promote;
	}

	public void setPromote(Integer promote) {
		this.promote = promote;
	}

	public Integer getNeedPay() {
		return needPay;
	}

	public void setNeedPay(Integer needPay) {
		this.needPay = needPay;
	}

	public Integer getValidatePatient() {
		return validatePatient;
	}

	public void setValidatePatient(Integer validatePatient) {
		this.validatePatient = validatePatient;
	}

	/*
	 * public BaseUserInfo(XtUser user) { this.userId = user.getId();
	 * this.userName = user.getUserName(); this.name = user.getName();
	 * this.mobile = user.getMobile(); this.email = user.getEmail();
	 * this.userType = user.getUserType(); }
	 */
	public BaseUserInfo() {

	}
}
