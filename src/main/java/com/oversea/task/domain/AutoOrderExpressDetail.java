package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class AutoOrderExpressDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3981763112434214111L;
	private Long id;
	private Integer orderType;
	private String siteName;
	private String orderDetailLoadedCode;
	private String expressNoCode;
	private String expressCompanyCode;
	private Date gmtCreate;
	private Date gmtModified;
	private String operator;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName=siteName;
	}
	public String getOrderDetailLoadedCode() {
		return orderDetailLoadedCode;
	}

	public void setOrderDetailLoadedCode(String orderDetailLoadedCode) {
		this.orderDetailLoadedCode=orderDetailLoadedCode;
	}
	public String getExpressNoCode() {
		return expressNoCode;
	}

	public void setExpressNoCode(String expressNoCode) {
		this.expressNoCode=expressNoCode;
	}
	public String getExpressCompanyCode() {
		return expressCompanyCode;
	}

	public void setExpressCompanyCode(String expressCompanyCode) {
		this.expressCompanyCode=expressCompanyCode;
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