package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class GroupOrder implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2336585511400793893L;

	private Long id;

    private String orderNo;

    private Long userId;

    private Long groupInstanceId;

    private Long packageId;

    private String amount;

    private String externalNo;

    private String realPrice;

    private String clientPayNo;

    private String clientPayPrice;

    private Date payTime;

    private String payType;

    private String hasPay;

    private Integer status;

    private Date gmtCreate;

    private Date gmtModified;

    private String tax;

    private String isGroup;

    private String logisticsNo;

    private String logisticsName;

    private String postFee;

    private String externalStatus;

    private String cashierPrice;

    private String productName;

    
    
    private String requestUrl;
    
    private String responseData;
    
    public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	private Date SpiderTime;
    
    public Date getSpiderTime() {
		return SpiderTime;
	}

	public void setSpiderTime(Date spiderTime) {
		SpiderTime = spiderTime;
	}

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGroupInstanceId() {
        return groupInstanceId;
    }

    public void setGroupInstanceId(Long groupInstanceId) {
        this.groupInstanceId = groupInstanceId;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getExternalNo() {
        return externalNo;
    }

    public void setExternalNo(String externalNo) {
        this.externalNo = externalNo;
    }

    public String getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public String getClientPayNo() {
        return clientPayNo;
    }

    public void setClientPayNo(String clientPayNo) {
        this.clientPayNo = clientPayNo;
    }

    public String getClientPayPrice() {
        return clientPayPrice;
    }

    public void setClientPayPrice(String clientPayPrice) {
        this.clientPayPrice = clientPayPrice;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getHasPay() {
        return hasPay;
    }

    public void setHasPay(String hasPay) {
        this.hasPay = hasPay;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getExternalStatus() {
        return externalStatus;
    }

    public void setExternalStatus(String externalStatus) {
        this.externalStatus = externalStatus;
    }

    public String getCashierPrice() {
        return cashierPrice;
    }

    public void setCashierPrice(String cashierPrice) {
        this.cashierPrice = cashierPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}