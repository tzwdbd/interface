package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class OrderPayDetail implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8481694587615459815L;
    private Long id;
    private String orderNo;
    private Long productEntityId;
    private String siteName;
    private Integer num;
    private String skuPrice;
    private String solePrice;
    private String price;
    private String rmbPrice;
    private Integer statusType;
    private Integer accountId;
    private String payAccount;
    private String deviceIp;
    private Integer deviceId;
    private Long creditCardId;
    private String cardNo;
    private String bankName;
    private String payType;
    private String isManual;
    private Date gmtCreate;
    private Date orderTime;
    private Date payTime;
    private String totalPrice;
    private String isDirect;
    private String units;
    private String operator;
    private String startBalance;
    private String endBalance;
    private Long company;
    private Integer groupNumber;
    private Integer orderStatus;
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
	public Long getProductEntityId() {
		return productEntityId;
	}
	public void setProductEntityId(Long productEntityId) {
		this.productEntityId = productEntityId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getSkuPrice() {
		return skuPrice;
	}
	public void setSkuPrice(String skuPrice) {
		this.skuPrice = skuPrice;
	}
	public String getSolePrice() {
		return solePrice;
	}
	public void setSolePrice(String solePrice) {
		this.solePrice = solePrice;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRmbPrice() {
		return rmbPrice;
	}
	public void setRmbPrice(String rmbPrice) {
		this.rmbPrice = rmbPrice;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	public Long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(Long creditCardId) {
		this.creditCardId = creditCardId;
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
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getIsManual() {
		return isManual;
	}
	public void setIsManual(String isManual) {
		this.isManual = isManual;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getIsDirect() {
		return isDirect;
	}
	public void setIsDirect(String isDirect) {
		this.isDirect = isDirect;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getStartBalance() {
		return startBalance;
	}
	public void setStartBalance(String startBalance) {
		this.startBalance = startBalance;
	}
	public String getEndBalance() {
		return endBalance;
	}
	public void setEndBalance(String endBalance) {
		this.endBalance = endBalance;
	}
	public Long getCompany() {
		return company;
	}
	public void setCompany(Long company) {
		this.company = company;
	}
	public Integer getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}
	public Integer getStatusType() {
		return statusType;
	}
	public void setStatusType(Integer statusType) {
		this.statusType = statusType;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public String getDeviceIp() {
		return deviceIp;
	}
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
    

}