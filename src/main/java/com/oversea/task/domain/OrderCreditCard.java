package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

/** 
* @author: yangyan 
  @Package: com.oversea.task.domain
  @Description:
* @time   2016年8月15日 下午6:10:45 
*/
public class OrderCreditCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2088683841579819402L;
	
	private Long id;
    private String cardNo;
    private String bankName;
    private String bindPhone;
    private String payThresh;
    private String cardAddress;
    private String cardPassword;
    private String suffixNo;
    private String expiryDate;
    private Double currentThresh;
    private String owner;
    private String ownerChn;
    private Date createTime;
    private Date modifyTime;
    private Date lastPayTime;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBindPhone() {
		return bindPhone;
	}
	public void setBindPhone(String bindPhone) {
		this.bindPhone = bindPhone;
	}
	public String getPayThresh() {
		return payThresh;
	}
	public void setPayThresh(String payThresh) {
		this.payThresh = payThresh;
	}
	public String getCardAddress() {
		return cardAddress;
	}
	public void setCardAddress(String cardAddress) {
		this.cardAddress = cardAddress;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public String getSuffixNo() {
		return suffixNo;
	}
	public void setSuffixNo(String suffixNo) {
		this.suffixNo = suffixNo;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Double getCurrentThresh() {
		return currentThresh;
	}
	public void setCurrentThresh(Double currentThresh) {
		this.currentThresh = currentThresh;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwnerChn() {
		return ownerChn;
	}
	public void setOwnerChn(String ownerChn) {
		this.ownerChn = ownerChn;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getLastPayTime() {
		return lastPayTime;
	}
	public void setLastPayTime(Date lastPayTime) {
		this.lastPayTime = lastPayTime;
	}
	
}
 