package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class RobotOrderDetail implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4617901619456860004L;
    private Long id;
    private String orderNo;
    private Long productId;
    private Long productEntityId;
    private String productUrl;
    private String productRebateUrl;
    private String productSku;
    private String siteName;
    private Integer num;
    private String myPrice;
    private String rmbPrice;
    private Integer status;
    private String mallOrderNo;
    private String expressCompany;
    private String expressNo;
    private Integer accountId;
    private Integer deviceId;
    private String isManual;
    private String manualMan;
    private Date gmtCreate;
    private Date gmtModified;
    private Date orderTime;
    private String totalPrice;
    private String singlePrice;
    private String isStockpile;
    private String remarks;
    private String units;
    private Integer promotionStatus;
    private Long company;
    private String promotionCodeList;
    private String promotionCodeListStatus;
    private Integer expressStatus;
    private String mallExpressFee;
    private String promotionFee;
    private Integer isAutoExpress;
    private String orderImg;
    private String isDirect;
    private Integer groupNumber;
    private Date dispatchTime;
    private  String totalPromotion;
    private  String totalPay;
    private  Long fromId;
    
    //DB没有
    private String balanceWb;
    

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

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductRebateUrl() {
        return productRebateUrl;
    }

    public void setProductRebateUrl(String productRebateUrl) {
        this.productRebateUrl = productRebateUrl;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
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

    public String getMyPrice() {
        return myPrice;
    }

    public void setMyPrice(String myPrice) {
        this.myPrice = myPrice;
    }

    public String getRmbPrice() {
        return rmbPrice;
    }

    public void setRmbPrice(String rmbPrice) {
        this.rmbPrice = rmbPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMallOrderNo() {
        return mallOrderNo;
    }

    public void setMallOrderNo(String mallOrderNo) {
        this.mallOrderNo = mallOrderNo;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
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

    public String getIsManual() {
        return isManual;
    }

    public void setIsManual(String isManual) {
        this.isManual = isManual;
    }

    public String getManualMan() {
        return manualMan;
    }

    public void setManualMan(String manualMan) {
        this.manualMan = manualMan;
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

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(String singlePrice) {
        this.singlePrice = singlePrice;
    }

    public String getIsStockpile() {
        return isStockpile;
    }

    public void setIsStockpile(String isStockpile) {
        this.isStockpile = isStockpile;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(Integer promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public Long getCompany() {
        return company;
    }

    public void setCompany(Long company) {
        this.company = company;
    }

    public String getPromotionCodeList() {
		return promotionCodeList;
	}

	public void setPromotionCodeList(String promotionCodeList) {
		this.promotionCodeList = promotionCodeList;
	}

	public String getPromotionCodeListStatus() {
		return promotionCodeListStatus;
	}

	public void setPromotionCodeListStatus(String promotionCodeListStatus) {
		this.promotionCodeListStatus = promotionCodeListStatus;
	}
	
	public Integer getExpressStatus() {
		return expressStatus;
	}

	public void setExpressStatus(Integer expressStatus) {
		this.expressStatus = expressStatus;
	}

	public String getMallExpressFee() {
		return mallExpressFee;
	}

	public void setMallExpressFee(String mallExpressFee) {
		this.mallExpressFee = mallExpressFee;
	}

	public String getPromotionFee() {
		return promotionFee;
	}

	public void setPromotionFee(String promotionFee) {
		this.promotionFee = promotionFee;
	}

	public Integer getIsAutoExpress() {
		return isAutoExpress;
	}

	public void setIsAutoExpress(Integer isAutoExpress) {
		this.isAutoExpress = isAutoExpress;
	}

	public String getBalanceWb() {
		return balanceWb;
	}

	public void setBalanceWb(String balanceWb) {
		this.balanceWb = balanceWb;
	}

	public String getOrderImg() {
		return orderImg;
	}

	public void setOrderImg(String orderImg) {
		this.orderImg = orderImg;
	}

	public String getIsDirect() {
		return isDirect;
	}

	public void setIsDirect(String isDirect) {
		this.isDirect = isDirect;
	}

	public Integer getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}

	public Date getDispatchTime() {
		return dispatchTime;
	}

	public void setDispatchTime(Date dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public String getTotalPromotion() {
		return totalPromotion;
	}

	public void setTotalPromotion(String totalPromotion) {
		this.totalPromotion = totalPromotion;
	}

	public String getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(String totalPay) {
		this.totalPay = totalPay;
	}

	public Long getFromId() {
		return fromId;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	@Override
    public String toString() {
        return "RobotOrderDetail{" +
                "units='" + units + '\'' +
                ", id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", productId=" + productId +
                ", productEntityId=" + productEntityId +
                ", productUrl='" + productUrl + '\'' +
                ", productRebateUrl='" + productRebateUrl + '\'' +
                ", productSku='" + productSku + '\'' +
                ", siteName='" + siteName + '\'' +
                ", num=" + num +
                ", myPrice='" + myPrice + '\'' +
                ", rmbPrice='" + rmbPrice + '\'' +
                ", status=" + status +
                ", mallOrderNo='" + mallOrderNo + '\'' +
                ", expressCompany='" + expressCompany + '\'' +
                ", expressNo='" + expressNo + '\'' +
                ", accountId=" + accountId +
                ", deviceId=" + deviceId +
                ", isManual='" + isManual + '\'' +
                ", manualMan='" + manualMan + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", orderTime=" + orderTime +
                ", totalPrice='" + totalPrice + '\'' +
                ", singlePrice='" + singlePrice + '\'' +
                ", isStockpile='" + isStockpile + '\'' +
                ", remarks='" + remarks + '\'' +
                ", company='" + company + '\'' +
                ", promotionCodeListStatus='" + promotionCodeListStatus + '\'' +
                '}';
    }
}