package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class BrushOrderDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6626927364959795334L;
	private Long id;
	private Long brushUserId;
	private Long brushInfoId;
	private String reviewTitle;
	private String reviewContent;
	private String feedbackContent;
	private String orderNo;
	private String siteName;
	private Long productId;
	private Long productEntityId;
	private String productUrl;
	private String productRebateUrl;
	private String productSku;
	private String singlePrice;
	private Integer num;
	private String totalPrice;
	private String rmbPrice;
	private String units;
	private Integer status;
	private String mallOrderNo;
	private String expressCompany;
	private String expressNo;
	private Integer expressStatus;
	private String remarks;
	private Integer accountId;
	private Integer deviceId;
	private String payType;
	private Date gmtCreate;
	private Date gmtModified;
	private Date orderTime;
	private Date dispatchTime;
	private Integer company;
	private String isDirect;
	private String isManual;
	private String manualMan;
	private String groupNumber;
	private String modeType;
	
	//DB没有
    private String balanceWb;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public Long getBrushUserId() {
		return brushUserId;
	}

	public void setBrushUserId(Long brushUserId) {
		this.brushUserId=brushUserId;
	}
	public Long getBrushInfoId() {
		return brushInfoId;
	}

	public void setBrushInfoId(Long brushInfoId) {
		this.brushInfoId=brushInfoId;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle=reviewTitle;
	}
	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent=reviewContent;
	}
	public String getFeedbackContent() {
		return feedbackContent;
	}

	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent=feedbackContent;
	}
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo=orderNo;
	}
	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName=siteName;
	}
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId=productId;
	}
	public Long getProductEntityId() {
		return productEntityId;
	}

	public void setProductEntityId(Long productEntityId) {
		this.productEntityId=productEntityId;
	}
	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl=productUrl;
	}
	public String getProductRebateUrl() {
		return productRebateUrl;
	}

	public void setProductRebateUrl(String productRebateUrl) {
		this.productRebateUrl=productRebateUrl;
	}
	public String getProductSku() {
		return productSku;
	}

	public void setProductSku(String productSku) {
		this.productSku=productSku;
	}
	public String getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(String singlePrice) {
		this.singlePrice=singlePrice;
	}
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num=num;
	}
	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice=totalPrice;
	}
	public String getRmbPrice() {
		return rmbPrice;
	}

	public void setRmbPrice(String rmbPrice) {
		this.rmbPrice=rmbPrice;
	}
	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units=units;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status=status;
	}
	public String getMallOrderNo() {
		return mallOrderNo;
	}

	public void setMallOrderNo(String mallOrderNo) {
		this.mallOrderNo=mallOrderNo;
	}
	public String getExpressCompany() {
		return expressCompany;
	}

	public void setExpressCompany(String expressCompany) {
		this.expressCompany=expressCompany;
	}
	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo=expressNo;
	}
	public Integer getExpressStatus() {
		return expressStatus;
	}

	public void setExpressStatus(Integer expressStatus) {
		this.expressStatus=expressStatus;
	}
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks=remarks;
	}
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId=accountId;
	}
	public Integer getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId=deviceId;
	}
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType=payType;
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
	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime=orderTime;
	}
	public Date getDispatchTime() {
		return dispatchTime;
	}

	public void setDispatchTime(Date dispatchTime) {
		this.dispatchTime=dispatchTime;
	}
	public Integer getCompany() {
		return company;
	}

	public void setCompany(Integer company) {
		this.company=company;
	}
	public String getIsDirect() {
		return isDirect;
	}

	public void setIsDirect(String isDirect) {
		this.isDirect=isDirect;
	}
	public String getIsManual() {
		return isManual;
	}

	public void setIsManual(String isManual) {
		this.isManual=isManual;
	}
	public String getManualMan() {
		return manualMan;
	}

	public void setManualMan(String manualMan) {
		this.manualMan=manualMan;
	}
	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber=groupNumber;
	}
	public String getModeType() {
		return modeType;
	}

	public void setModeType(String modeType) {
		this.modeType=modeType;
	}

	public String getBalanceWb() {
		return balanceWb;
	}

	public void setBalanceWb(String balanceWb) {
		this.balanceWb = balanceWb;
	}
}