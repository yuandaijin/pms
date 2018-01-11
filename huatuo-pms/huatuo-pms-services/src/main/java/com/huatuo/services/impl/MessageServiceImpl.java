package com.huatuo.services.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.huatuo.bean.XtMessageBean;
import com.huatuo.common.BaseResponse;
import com.huatuo.common.Config;
import com.huatuo.common.MessageUtil;
import com.huatuo.common.Utils;
import com.huatuo.common.sms.MessageConfig;
import com.huatuo.common.sms.SendMessage;
import com.huatuo.db.bean.XtMessage;
import com.huatuo.db.repository.DbMessageRepository;
import com.huatuo.pms.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	
	@Autowired
	private DbMessageRepository messageRepository;
	
	public int save(long id, int messageType, String form, String code) {
		XtMessage message = new XtMessage();
		message.setMessageType(messageType);
		if(messageType == MessageConfig.FLELD_MESSAGETYPE_SMTP){
			message.setEmail(form);
			message.setTitle(MessageConfig.FLELD_SMTP_SUBJECT_VERIFICATION);
			message.setContent(MessageConfig.getEmailCountext(form, code));
		}else{
			message.setMobile(form);
			message.setTitle(MessageConfig.FLELD_MOBILE_SUBJECT_VERIFICATION);
			message.setContent(MessageConfig.getMoblieCountext(code));
		}
		message.setUserId(id);
		message.setCode(code);
		message.setCreateTime(Utils.getNowTime());
		
		return messageRepository.save(message);
	}

	public XtMessageBean getXtMessage(String mobile, String email, String code) {
		XtMessage message = messageRepository.getEmailXtMessage(code); // 获取验证码
		if(StringUtils.isEmpty(message)){
			return null;
		}
		if(!StringUtils.isEmpty(mobile) && !mobile.equals(message.getMobile())){
			return null;
		}
		if(!code.equals(message.getCode())){
			return null;
		}
		long time = Utils.getTimeNum(Utils.getNowTime(), message.getCreateTime());
		if(MessageConfig.FLELD_TIME > time) { 
			return Utils.exchangeObject(message, XtMessageBean.class);
		}
		return null;
	}

	public XtMessageBean getXtMessageinfo(String mobile,String email) {
		return Utils.exchangeObject(messageRepository.getXtMessage(mobile,email), XtMessageBean.class);
	}

	public XtMessageBean getEmailXtMessage(String code) {
		XtMessage message = messageRepository.getEmailXtMessage(code);
		if(message != null && message.getCode().equals(code)){
			long time = Utils.getTimeNum(Utils.getNowTime(), message.getCreateTime());
			if(MessageConfig.FLELD_TIME > time) {
				return Utils.exchangeObject(message, XtMessageBean.class);
			}
		}
		return null;
	}

	public boolean sendEmail(long id, String email) throws MessagingException {
		String code = MessageConfig.getcode(email);
		int rows = this.save(id,1,email,code);
		if(rows < 1){
			return false;
		}
		SendMessage.sendMail(email, MessageConfig.FLELD_SMTP_SUBJECT_VERIFICATION, MessageConfig.getEmailCountext(email,code));
		return true;
	}
	
	public boolean sendMoblieEmail(long id, String email) throws MessagingException {
		String code = MessageConfig.getcode()+"";
		int rows = this.save(id,1,email,code);
		if(rows < 1){
			return false;
		}
		SendMessage.sendMail(email, MessageConfig.FLELD_SMTP_SUBJECT_VERIFICATION, MessageConfig.getMoblieCountext(code));
		return true;
	}

	public boolean sendMobile(long id, String mobile) {
		String code = MessageConfig.getcode()+"";
		int rows = this.save(id,MessageConfig.FLELD_MESSAGETYPE_MOBILE,mobile,code);
		if(rows < 1){
			return false;
		}
		SendMessage.sendMobile(mobile, MessageConfig.getMoblieCountext(code));
//		if(res.equals("0")){
//			
//		}
		return true;
	}

	public boolean sendBindEmail(long id, String email) throws MessagingException {
		String code = MessageConfig.getcode(email);
		int rows = this.save(id, MessageConfig.FLELD_MESSAGETYPE_SMTP, email,code);
		if(rows < 1){
			return false;
		}
		SendMessage.sendMail(email, MessageConfig.FLELD_SMTP_SUBJECT_VERIFICATION, MessageConfig.getEmailBindCountext(email,code));
		return true;
	}

	public boolean sendBindMobile(long id, String mobile) {
		String code = MessageConfig.getcode()+"";
		int rows = this.save(id, MessageConfig.FLELD_MESSAGETYPE_MOBILE, mobile, code);
		if(rows < 1){
			return false;
		}
		SendMessage.sendMobile(mobile, MessageConfig.getMoblieCountext(code));
		return true;
	}

	public int countMessage(String mobile, String email) {
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = new Date();
		Calendar date = Calendar.getInstance();
		date.setTime(beginDate);
		date.set(Calendar.MINUTE, date.get(Calendar.DATE) -10);
		String startTime = dft.format(date.getTime());
		return messageRepository.countMessage(mobile, email, startTime, Utils.getNowTime());
	}

	public int updateMessage(XtMessageBean message) {
//		XtMessage message = messageRepository.getEmailXtMessage(code);
		message.setIsUse(Config.FIELD_MESSAGE_USE);
		return messageRepository.update(Utils.exchangeObject(message, XtMessage.class));
	}

	public boolean sendMobileCheck(List<String> list,String message) {
		if(list.size()>0){
		    for (String mobile : list) {
		    	this.save(0, MessageConfig.FLELD_MESSAGETYPE_MOBILE, mobile, null);
		    	SendMessage.sendMobile(mobile, message);
			}
		}else{
			return false;
		}
		return true;
	}

	public DbMessageRepository getMessageRepository() {
		return messageRepository;
	}

	public void setMessageRepository(DbMessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}

	public boolean sendMobileCheck(String mobile, String message) {
		SendMessage.sendMobile(mobile, message);
		return true;
	}
	
	/**
	 * 发送短信验证码
	 * @param mobile
	 * @param request
	 * @param model
	 * @return
	 */
	@Override
	public BaseResponse sendMobile(String mobile){
		BaseResponse resp=new BaseResponse();
		int count = this.countMessage(mobile, null);
		if(count >= MessageConfig.FLELD_MESSAGE_COUNT){
			resp.setCode(MessageUtil.CODE_FAILURE);
			resp.setMessage(MessageUtil.IMG_MOBILE_CODE_ERROR);
			return resp;
		}
		XtMessageBean message = this.getXtMessageinfo(mobile, null);
		if(!StringUtils.isEmpty(message)){
			long time = Utils.getTimeNum(Utils.getNowTime(), message.getCreateTime());
			if(MessageConfig.FLELD_MOBILE_TIME > time){
				resp.setCode(MessageUtil.CODE_FAILURE);
				resp.setMessage(MessageUtil.IMG_MOBILE_CODE_ERROR);
				return resp;
			}
		}
		if(this.sendMobile(0L,mobile)){
			return BaseResponse.reSuccess();
		}else{
			return BaseResponse.refailure();
		}
	}
	
	@Override
	public BaseResponse checkCode(String moblie,String code){
		XtMessageBean message = this.getXtMessage(moblie,null,code);
		if(StringUtils.isEmpty(message)){
			BaseResponse resp = new BaseResponse();
			resp.setCode(MessageUtil.CODE_FAILURE);
			resp.setMessage(MessageUtil.MOBILE_CODE_ERROR);
			return resp;
		}
		if(message.getIsUse() == Config.FIELD_MESSAGE_USE){
			BaseResponse resp = new BaseResponse();
			resp.setCode(MessageUtil.CODE_ERROR);
			resp.setMessage(MessageUtil.CODE_USE);
			return resp;
		}
		this.updateMessage(message);
		return BaseResponse.reSuccess();
	}
}
