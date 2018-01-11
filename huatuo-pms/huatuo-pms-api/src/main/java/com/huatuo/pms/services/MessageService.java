package com.huatuo.pms.services;

import com.huatuo.common.BaseResponse;

/**
 * 短信和邮件服务
 * 
 */
public interface MessageService {

	/**
	 * 发送短信验证码
	 * @param mobile
	 * @return
	 */
	public BaseResponse sendMobile(String mobile);
	
	/**
	 * 验证短信验证码
	 * @param mobile
	 * @return
	 */
	public BaseResponse checkCode(String moblie,String code);
	
}
