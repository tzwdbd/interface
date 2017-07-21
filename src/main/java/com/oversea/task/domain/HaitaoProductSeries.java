package com.oversea.task.domain;

import com.oversea.task.enums.Platform;

import java.io.Serializable;

public class HaitaoProductSeries implements Serializable {

    private static final long serialVersionUID = -8779085479187428688L;

    // 主键ID
    private Long id;

    // 商品条码
    @NotNull
    private String asinCode;

    // 商品的父亲条码
    @NotNull
    private String parentAsinCode;

    // 货币类型
    @NotNull
    private String currencyCode;

    // 市场价
    @NotNull
    private Integer listPrice;

    // 当前价
    @NotNull
    private Integer price;

    // 货物情况
    @NotNull
    private String availabilityType;

    // 物品类型： new（新品）, used（二手）, collectible(可回收的), refurbished(翻新货)
    private String condition;

    // 供货商
    private String merchant;

    // 发货者  若该属性有值 则表明该商品是第三方售卖但由amazon发货  否则 售卖和发货均为第三方
    private String shipper;

    // 商品属性
    private String sku;

    private String upc;

    private String ean;

    @NotNull
    private String weight;

    @NotNull
    private boolean limitBuy;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsinCode() {
        return asinCode;
    }

    public void setAsinCode(String asinCode) {
        this.asinCode = asinCode;
    }

    public String getParentAsinCode() {
        return parentAsinCode;
    }

    public void setParentAsinCode(String parentAsinCode) {
        this.parentAsinCode = parentAsinCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAvailabilityType() {
        return availabilityType;
    }

    public void setAvailabilityType(String availabilityType) {
        this.availabilityType = availabilityType;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public boolean isLimitBuy() {
        return limitBuy;
    }

    public void setLimitBuy(boolean limitBuy) {
        this.limitBuy = limitBuy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HaitaoProductSeries)) return false;
        HaitaoProductSeries that = (HaitaoProductSeries) o;
        if (parentAsinCode != null ? !parentAsinCode.equals(that.parentAsinCode) : that.parentAsinCode != null)
            return false;
        return sku != null ? sku.equals(that.sku) : that.sku == null;
    }

    @Override
    public int hashCode() {
        int result = parentAsinCode != null ? parentAsinCode.hashCode() : 0;
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HaitaoProductSeries{" +
                ", asinCode='" + asinCode + '\'' +
                ", parentAsinCode='" + parentAsinCode + '\'' +
                ", sku='" + sku + '\'' +
                ", listPrice=" + listPrice +
                ", price=" + price +
                ", availabilityType='" + availabilityType + '\'' +
                ", merchant='" + merchant + '\'' +
                ", shipper='" + shipper + '\'' +
                ", limitBuy=" + limitBuy +
                "}";
    }
}