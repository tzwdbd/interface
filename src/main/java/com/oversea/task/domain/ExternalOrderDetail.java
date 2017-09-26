package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class ExternalOrderDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5123276129925279557L;
	private Long id;
	private String partnerId;
	private String saleOrderCode;
	private Date date;
	private String orderAmount;
	private String skuId;
	private String productUrl;
	private String itemName;
	private String itemAttr;
	private Integer itemCount;
	private String itemValue;
	private String itemPrice;
	private String discountCode;
	private String realPriceOrg;
	private String exchangeRate;
	private String unit;
	private String remark;
	private String productRebateUrl;
	private String mallProductCode;
	private Long productId;
	private String siteName;
	private String mallOrderNo;
	private String expressCompany;
	private String expressNo;
	private Integer company;
	private String modeType;
	private String payType;
	private Integer accountId;
	private Integer deviceId;
	private Date gmtCreate;
	private Date gmtModified;
	private Date orderTime;
	private Date dispatchTime;
	private String totalPrice;
	private String rmbPrice;
	private Integer status;
	private String orderRemark;
	private String singlePrice;
	private String orderImg;
	private String promotionCodeListStatus;
	
	//DB没有
    private String balanceWb;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId=partnerId;
	}
	public String getSaleOrderCode() {
		return saleOrderCode;
	}

	public void setSaleOrderCode(String saleOrderCode) {
		this.saleOrderCode=saleOrderCode;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date=date;
	}
	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount=orderAmount;
	}
	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId=skuId;
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
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName=itemName;
	}
	public String getItemAttr() {
		return itemAttr;
	}

	public void setItemAttr(String itemAttr) {
		this.itemAttr=itemAttr;
	}
	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount=itemCount;
	}
	public String getItemValue() {
		return itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue=itemValue;
	}
	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice=itemPrice;
	}
	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode=discountCode;
	}
	public String getRealPriceOrg() {
		return realPriceOrg;
	}

	public void setRealPriceOrg(String realPriceOrg) {
		this.realPriceOrg=realPriceOrg;
	}
	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate=exchangeRate;
	}
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit=unit;
	}
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark=remark;
	}
	public String getMallProductCode() {
		return mallProductCode;
	}

	public void setMallProductCode(String mallProductCode) {
		this.mallProductCode=mallProductCode;
	}
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId=productId;
	}
	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName=siteName;
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
	public Integer getCompany() {
		return company;
	}

	public void setCompany(Integer company) {
		this.company=company;
	}
	public String getModeType() {
		return modeType;
	}

	public void setModeType(String modeType) {
		this.modeType=modeType;
	}
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType=payType;
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
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status=status;
	}
	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark=orderRemark;
	}

	public String getBalanceWb() {
		return balanceWb;
	}

	public void setBalanceWb(String balanceWb) {
		this.balanceWb = balanceWb;
	}

	public String getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(String singlePrice) {
		this.singlePrice = singlePrice;
	}

	public String getOrderImg() {
		return orderImg;
	}

	public void setOrderImg(String orderImg) {
		this.orderImg = orderImg;
	}

	public String getPromotionCodeListStatus() {
		return promotionCodeListStatus;
	}

	public void setPromotionCodeListStatus(String promotionCodeListStatus) {
		this.promotionCodeListStatus = promotionCodeListStatus;
	}

}