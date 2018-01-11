package com.huatuo.request;

public class FlexMedicalRecordRequest {
	/**
	 * 过敏史（150字符）
	 */
	public String allergicHistory;
	/**
	 * 主诉（100字符）
	 */
	public String chiefComplaint;
	/**
	 * 现病史（150字符）
	 */
	public String presentIllness;
	/**
	 * 既往史（150字符）
	 */
	public String pastIllness;
	/**
	 * 处理意见（150字符）
	 */
	public String suggestion;
	
	/**
	 * 查体
	 */
	private String bodyExam;

	public String getBodyExam() {
		return bodyExam;
	}

	public void setBodyExam(String bodyExam) {
		this.bodyExam = bodyExam;
	}

	public FlexMedicalRecordRequest() {

	}
}
