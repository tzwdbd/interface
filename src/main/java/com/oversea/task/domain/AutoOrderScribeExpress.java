package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class AutoOrderScribeExpress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2751344522259202408L;
	private Long id;
	private String siteName;
	private String orderListUrl;
	private String orderListLoadedCode;
	private String orderListCode;
	private String orderNumberCode;
	private String orderStatusCode;
	private String orderDetailJump;
	private Date gmtCreate;
	private Date gmtModified;
	private String operator;
	private String nextPageUrl;
	private String notShipingStr;
	private String shipingStr;
	private String cancelledStr;
	public String getNextPageUrl() {
		return nextPageUrl;
	}

	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName=siteName;
	}
	public String getOrderListUrl() {
		return orderListUrl;
	}

	public void setOrderListUrl(String orderListUrl) {
		this.orderListUrl=orderListUrl;
	}
	public String getOrderListLoadedCode() {
		return orderListLoadedCode;
	}

	public void setOrderListLoadedCode(String orderListLoadedCode) {
		this.orderListLoadedCode=orderListLoadedCode;
	}
	public String getOrderListCode() {
		return orderListCode;
	}

	public void setOrderListCode(String orderListCode) {
		this.orderListCode=orderListCode;
	}
	public String getOrderNumberCode() {
		return orderNumberCode;
	}

	public void setOrderNumberCode(String orderNumberCode) {
		this.orderNumberCode=orderNumberCode;
	}
	public String getNotShipingStr() {
		return notShipingStr;
	}

	public void setNotShipingStr(String notShipingStr) {
		this.notShipingStr = notShipingStr;
	}

	public String getShipingStr() {
		return shipingStr;
	}

	public void setShipingStr(String shipingStr) {
		this.shipingStr = shipingStr;
	}

	public String getCancelledStr() {
		return cancelledStr;
	}

	public void setCancelledStr(String cancelledStr) {
		this.cancelledStr = cancelledStr;
	}

	public String getOrderStatusCode() {
		return orderStatusCode;
	}

	public void setOrderStatusCode(String orderStatusCode) {
		this.orderStatusCode=orderStatusCode;
	}
	public String getOrderDetailJump() {
		return orderDetailJump;
	}

	public void setOrderDetailJump(String orderDetailJump) {
		this.orderDetailJump=orderDetailJump;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate=gmtCreate;
	}
	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified=gmtModified;
	}
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator=operator;
	}
}