package com.huatuo.request;

public class FeedbackForm {
	
    private String name;

    private String mobile;

    private String email;

    private String countext;
    
    private String imgCode;

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

	public String getCountext() {
		return countext;
	}

	public void setCountext(String countext) {
		this.countext = countext;
	}

	public String getImgCode() {
		return imgCode;
	}

	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
    
//	FeedbackForm(String name, String mobile, String countext, String imgCode){
//	    this.name = name;
//	    this.mobile = mobile;
//	    this.countext = countext;
//	    this.imgCode = imgCode;
//	}
}
