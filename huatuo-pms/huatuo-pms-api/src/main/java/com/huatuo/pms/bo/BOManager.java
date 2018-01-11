package com.huatuo.pms.bo;

import java.io.Serializable;
@SuppressWarnings("serial")
public class BOManager extends BaseUserInfo implements Serializable{

	private String name;
	private long managerId;
	
	public BOManager() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}
	
}
