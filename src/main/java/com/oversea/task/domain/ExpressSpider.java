package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class ExpressSpider implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6000478595372842475L;
	
	private Long id;
	private String orderNo;
	private String mallOrderNo;
	private Long productEntityId;
	private Integer groupNumber;
	private String expressNo;
	private Integer status;
	private String remark;
	private Date gmtCreate;
	private Date gmtModified;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getMallOrderNo() {
		return mallOrderNo;
	}
	public void setMallOrderNo(String mallOrderNo) {
		this.mallOrderNo = mallOrderNo;
	}
	public Long getProductEntityId() {
		return productEntityId;
	}
	public void setProductEntityId(Long productEntityId) {
		this.productEntityId = productEntityId;
	}
	public Integer getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}
	public String getExpressNo() {
		return expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
}
