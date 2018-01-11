package com.huatuo.pms.bo;

import java.io.Serializable;

/**
 * 医生redis保存就诊信息
 * @author caohu
 *
 */
public class FlexVisitInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5592421076806121454L;
	private BaseUserInfo userInfo;
	public long visitId;
	public long doctorId;
	public long timestamp;

	public FlexVisitInfo(BaseUserInfo userInfo, long visitId, long doctorId, long timestamp) {
		this.userInfo = userInfo;
		this.visitId = visitId;
		this.doctorId = doctorId;
		this.timestamp = timestamp;
	}

	public BaseUserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(BaseUserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
