package com.huatuo.pms.security;

import org.springframework.security.core.GrantedAuthority;

import com.huatuo.common.Config;
import com.huatuo.pms.bo.BaseUserInfo;

public class HuatuoGrantedAuthority implements GrantedAuthority {
	private static final long serialVersionUID = 1L;

	private String authority;

	private static HuatuoGrantedAuthority AUTHORITY_PERSON = new HuatuoGrantedAuthority("ROLE_PERSON");
	private static HuatuoGrantedAuthority AUTHORITY_ORG = new HuatuoGrantedAuthority("ROLE_ORG");
	private static HuatuoGrantedAuthority AUTHORITY_DOCTOR = new HuatuoGrantedAuthority("ROLE_DOCTOR");
	private static HuatuoGrantedAuthority AUTHORITY_MANAGER = new HuatuoGrantedAuthority("ROLE_MANAGER");

	public HuatuoGrantedAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

	public static HuatuoGrantedAuthority getAuthority(BaseUserInfo userInfo) {
		String userType = userInfo.getLoginType();
		if (userType != null) {
			if (userType.equals(Config.FIELD_USER_TYPE_PERSON)) {
				return AUTHORITY_PERSON;
			}
			if (userType.equals(Config.FIELD_USER_TYPE_ORG)) {
				return AUTHORITY_ORG;
			}
			if (userType.equals(Config.FIELD_USER_TYPE_DOCTOR)) {
				return AUTHORITY_DOCTOR;
			}
		}
		if(userType.equals(Config.FIELD_USER_TYPE_MANAGER)){
			return AUTHORITY_MANAGER;
		}
		return null;
	}
}
