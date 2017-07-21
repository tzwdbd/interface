package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

/** 
* @author: yangyan 
  @Package: com.oversea.task.domain
  @Description:
* @time   2016年10月21日 下午3:01:59 
*/
public class OrderPayAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9021919976226470473L;

	// 主键ID
	private Long id;
	
	// 支付帐号名
	private String account;
	// 登录密码
	private String loginPassword;
	// 支付密码
	private String payPassword;
	// 余额
	private String balance;
	// 信用卡卡号id
	private Long creditCardId;
	// 支付帐号类型
	private String accountType;
	// 支付帐号所属人姓名
	private String owner;
	// 绑定手机号
	private String bindPhone;
	
	private Date lastLogin;
	
	private Date gmtCreate;
	
	private Date gmtModify;
	// 备注
	private String remarks;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public Long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(Long creditCardId) {
		this.creditCardId = creditCardId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBindPhone() {
		return bindPhone;
	}
	public void setBindPhone(String bindPhone) {
		this.bindPhone = bindPhone;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModify() {
		return gmtModify;
	}
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
    public String toString() {
		 return "OrderPayAccount [id=" + id + ", account=" + account + ", loginPassword=" + loginPassword + ", payPassword=" + payPassword + ", balance=" + balance + ", creditCardId=" + creditCardId + ", accountType=" + accountType + ", owner=" + owner + ", bindPhone="
	                + bindPhone + ", lastLogin=" + lastLogin + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify + ", remarks=" + remarks + "]";
    }
}
 