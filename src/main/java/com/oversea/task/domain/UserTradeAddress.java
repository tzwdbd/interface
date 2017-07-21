package com.oversea.task.domain;

import java.io.Serializable;
import java.util.List;
public class UserTradeAddress extends Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2561106759984109314L;
	private static final String BLANK=" ";
	private String payNo;
	private List<String> payNoList;
	
	public List<String> getPayNoList() {
		return payNoList;
	}
	public void setPayNoList(List<String> payNoList) {
		this.payNoList = payNoList;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	public String getDeliveryAddress() {
		StringBuffer deliveryAddressBuffer = new StringBuffer();
		deliveryAddressBuffer.append(this.getState()).append(BLANK)
		                     .append(this.getCity()).append(BLANK)
		                     .append(this.getDistrict()).append(BLANK)
		                     .append(this.getAddress());
		
		return deliveryAddressBuffer.toString();
	}
}