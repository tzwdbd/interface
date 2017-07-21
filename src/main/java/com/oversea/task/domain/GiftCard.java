package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class GiftCard implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4603759326985130577L;
	private Long id;
	private Integer accountId;
	private String siteName;
	private String balance;
	private String securityCode;
	private String isUsed;
	private String isProcess;
	private Date gmtCreate;
	private Date gmtModified;
	private String isSuspect;
	private String realBalance;
	private Integer isRechargeNow;
	private String rate;
	private String operatorName;
	private String passWord;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId=accountId;
	}
	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName=siteName;
	}
	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance=balance;
	}
	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode=securityCode;
	}
	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed=isUsed;
	}
	
	public String getIsProcess() {
		return isProcess;
	}

	public void setIsProcess(String isProcess) {
		this.isProcess = isProcess;
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

	public String getIsSuspect() {
		return isSuspect;
	}

	public void setIsSuspect(String isSuspect) {
		this.isSuspect = isSuspect;
	}

	public String getRealBalance() {
		return realBalance;
	}

	public void setRealBalance(String realBalance) {
		this.realBalance = realBalance;
	}

	public Integer getIsRechargeNow() {
		return isRechargeNow;
	}

	public void setIsRechargeNow(Integer isRechargeNow) {
		this.isRechargeNow = isRechargeNow;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}