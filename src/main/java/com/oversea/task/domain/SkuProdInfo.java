package com.oversea.task.domain;

import com.oversea.task.enums.Platform;

import java.io.Serializable;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.task.domain
 * @Description: 价格
 * @date 15/12/29 11:50
 */
public class SkuProdInfo implements Serializable {

    private static final long serialVersionUID = 7965821456455550836L;

    private Long productId;

    private String itemId;

    private Long productEntityId;

    private String url;

    private Platform platform;

    private String asinCode;

    private Integer price;

    private String availabilityType;


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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getAsinCode() {
        return asinCode;
    }

    public void setAsinCode(String asinCode) {
        this.asinCode = asinCode;
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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "SkuProdInfo{" +
                "productId=" + productId +
                ", productEntityId=" + productEntityId +
                ", url='" + url + '\'' +
                ", platform=" + platform +
                ", asinCode='" + asinCode + '\'' +
                ", price=" + price +
                ", availabilityType='" + availabilityType + '\'' +
                '}';
    }
}
