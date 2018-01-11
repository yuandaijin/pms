package com.huatuo.request;

import java.util.List;

/**
 * 创建处方
 * 
 * @author maocai.luo
 * 
 */
public class FlexCreateOrderRequest {
	/**
	 * 处方类型( 1:西药处方 2:中草药处方)
	 */
	public int orderType;
	/**
	 * 剂数
	 */
	public int amount;
	/**
	 * 处方说明（40字符）
	 */
	public String explain;

	/**
	 * 处方详情列表
	 */
	private List<FlexCreateOrderDetail> orderDetailList;

	public FlexCreateOrderRequest() {
	}

	public List<FlexCreateOrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<FlexCreateOrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
}
