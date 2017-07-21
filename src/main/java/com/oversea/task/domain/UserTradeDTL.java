package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class UserTradeDTL implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8236480307944093470L;
	public static final String TABLE_ID = UserTradeDTL.class.getSimpleName();
	private Long id;
	private Long userId;
	private String payNo;
	private String orderNo;
	private Long productId;
	private Long productEntityId;
	private String externalProductId;
    private String productRebateUrl;
	private String productUrl;
	private String homeFreight;
	private Long mallId;
	private String amount;
	private Integer num;
	private String discount;
	private String discountDesc;
	private String unitPrice;
	private String weight;
	private Date gmtCreate;
	private Date gmtModified;
	private String tax;
	private String taxRate;
	private Integer pushStatus;
	private String forwardFee;
	private String rate;
	private String fixedPrice;
	private Integer status;
	private Integer stockStatus;
	private String expressDesc;
	private String productTitle;//冗余商品名称
    //备注
	private String remark;
	//下单金额
	private String mallOrderPrice;
	//冻结状态
	private Integer frozenStatus;
	
    /**
     * 下调到的免税价格
     */
    private String freeTaxPrice;
    
    /**
     * 从商品裸价3%
     */
    private String skuAddPrice;
    
    /***
     * 增加一个安全价格
     */
    private String insurancePrice;
    
    /**
     * 走那种方式的税费方式 normal 老的通关方式，custom 海关价格通关
     */
    private  String modeType;
	/**
	 * 售后类型
	 */
	private Integer afterSaleType;
	/**
	 * 售后红包id
	 */
	private Long saleCouponId;
	/**
	 * 售后红包金额
	 */
	private Integer saleCouponPrice;

	/**
	 * 商品拥有的优惠码列表
	 */
	private String promotionCodeList;
	
	private Integer expressType=0;
    
	public String getInsurancePrice() {
		return insurancePrice;
	}
	public void setInsurancePrice(String insurancePrice) {
		this.insurancePrice = insurancePrice;
	}
	public String getModeType() {
		return modeType;
	}
	public void setModeType(String modeType) {
		this.modeType = modeType;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getFixedPrice() {
		return fixedPrice;
	}
	public void setFixedPrice(String fixedPrice) {
		this.fixedPrice = fixedPrice;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getForwardFee() {
		return forwardFee;
	}
	public void setForwardFee(String forwardFee) {
		this.forwardFee = forwardFee;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getProductEntityId() {
		return productEntityId;
	}
	public void setProductEntityId(Long productEntityId) {
		this.productEntityId = productEntityId;
	}
	public String getExternalProductId() {
		return externalProductId;
	}
	public void setExternalProductId(String externalProductId) {
		this.externalProductId = externalProductId;
	}
	public String getProductRebateUrl() {
		return productRebateUrl;
	}
	public void setProductRebateUrl(String productRebateUrl) {
		this.productRebateUrl = productRebateUrl;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public String getHomeFreight() {
		return homeFreight;
	}
	public void setHomeFreight(String homeFreight) {
		this.homeFreight = homeFreight;
	}
	public Long getMallId() {
		return mallId;
	}
	public void setMallId(Long mallId) {
		this.mallId = mallId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDiscountDesc() {
		return discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
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
	public Integer getPushStatus()
	{
		return pushStatus;
	}
	public void setPushStatus(Integer pushStatus)
	{
		this.pushStatus = pushStatus;
	}
    public Integer getStockStatus() {
        return stockStatus;
    }
    public void setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
    }
	public String getExpressDesc() {
		return expressDesc;
	}
	public void setExpressDesc(String expressDesc) {
		this.expressDesc = expressDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMallOrderPrice() {
		return mallOrderPrice;
	}
	public void setMallOrderPrice(String mallOrderPrice) {
		this.mallOrderPrice = mallOrderPrice;
	}
	public Integer getFrozenStatus() {
		return frozenStatus;
	}
	public void setFrozenStatus(Integer frozenStatus) {
		this.frozenStatus = frozenStatus;
	}
	public String getFreeTaxPrice() {
		return freeTaxPrice;
	}
	public void setFreeTaxPrice(String freeTaxPrice) {
		this.freeTaxPrice = freeTaxPrice;
	}
	public String getSkuAddPrice() {
		return skuAddPrice;
	}
	public void setSkuAddPrice(String skuAddPrice) {
		this.skuAddPrice = skuAddPrice;
	}
	public Integer getAfterSaleType() {
		return afterSaleType;
	}
	public void setAfterSaleType(Integer afterSaleType) {
		this.afterSaleType = afterSaleType;
	}
	public Long getSaleCouponId() {
		return saleCouponId;
	}
	public void setSaleCouponId(Long saleCouponId) {
		this.saleCouponId = saleCouponId;
	}
	public Integer getSaleCouponPrice() {
		return saleCouponPrice;
	}
	public void setSaleCouponPrice(Integer saleCouponPrice) {
		this.saleCouponPrice = saleCouponPrice;
	}
	public String getPromotionCodeList() {
		return promotionCodeList;
	}
	public void setPromotionCodeList(String promotionCodeList) {
		this.promotionCodeList = promotionCodeList;
	}
	public Integer getExpressType() {
		return expressType;
	}
	public void setExpressType(Integer expressType) {
		this.expressType = expressType;
	}
}