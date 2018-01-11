package com.huatuo.request;

import java.util.List;


public class FlexWsMultiVisitQueueRequest {
	private String accessToken;
	private List<FlexVisitQueue> visitQueueList;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public List<FlexVisitQueue> getVisitQueueList() {
		return visitQueueList;
	}

	public void setVisitQueueList(List<FlexVisitQueue> visitQueueList) {
		this.visitQueueList = visitQueueList;
	}

	public FlexWsMultiVisitQueueRequest() {
		super();
	}

}
