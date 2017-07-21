package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class GiftCardConfig implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4729965301788744847L;
	private Long id;
	private String siteName;
	private Integer balance;
	private Integer isPrime;
	private Float percent;
	private String remarks;
	private Date gmtCreate;
	private Date gmtModified;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Integer getIsPrime() {
		return isPrime;
	}
	public void setIsPrime(Integer isPrime) {
		this.isPrime = isPrime;
	}
	public Float getPercent() {
		return percent;
	}
	public void setPercent(Float percent) {
		this.percent = percent;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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