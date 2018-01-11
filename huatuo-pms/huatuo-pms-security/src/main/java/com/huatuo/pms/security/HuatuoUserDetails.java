package com.huatuo.pms.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.huatuo.pms.bo.BaseUserInfo;


/**
 * 拦截器
 * @author caohu
 *
 */
public class HuatuoUserDetails implements UserDetails {
	private static final long serialVersionUID = 1L;
	private BaseUserInfo userInfo;

	public HuatuoUserDetails(BaseUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public BaseUserInfo getUserInfo() {
		return userInfo;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<HuatuoGrantedAuthority> collection = new ArrayList<HuatuoGrantedAuthority>();
		collection.add(HuatuoGrantedAuthority.getAuthority(userInfo));
		return collection;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return userInfo.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
