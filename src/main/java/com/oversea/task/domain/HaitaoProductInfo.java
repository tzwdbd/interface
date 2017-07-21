package com.oversea.task.domain;

import com.oversea.task.enums.Platform;

import java.io.Serializable;
import java.util.Date;

/**
 * HaitaoProductInfo
 */
public class HaitaoProductInfo implements Serializable {

    private static final long serialVersionUID = 190826373455035030L;

    /**
     * 批量更新
     */
    public static final int NORMAL_UPDATE = 0;

    /**
     * 快速更新
     */
    public static final int FAST_UPDATE = 3;

    /**
     * 运营自己更新
     */
    public static final int REALTIME_UPDATE = 1;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 平台
     */
    @NotNull
    private String platform;

    /**
     * 商品ID
     */
    private String itemId;

    /**
     * url地址
     */
    @NotNull
    private String homeUrl;

    /**
     * 商品的父亲条码
     */
    @NotNull
    private String parentAsinCode;

    /**
     * 标题
     */
    @NotNull
    private String title;

    /**
     * 运营填写的title
     */
    private String manMadeTitle;

    /**
     * 运营填写的品牌ID
     */
    private String manMadeBrandId;

    /**
     * 货币类型
     */
    @NotNull
    private String currencyCode;

    /**
     * 商品品牌
     */
    @NotNull
    private String brand;

    /**
     * 分类ID
     */
    private String category;

    /**
     * 商品尺寸
     */
    private String dimension;

    /**
     * 网站类型
     */
    private String origin;

    /**
     * 商品介绍
     */
    private String introduction;

    /**
     * 商品描述
     */
    @NotNull
    private String description;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 爬取类型:批量更新,快速更新,运营自己更新
     */
    private String type;

    /**
     * 返回code值
     */
    private String resultCode;

    /**
     * 品牌描述
     */
    private String brandDesc;

    /**
     * 品牌图片连接
     */
    private String brandImgUrl;

    /**
     * 爬虫类型
     */
    private Integer priority;

    private String firstCategory;

    private String secondCategory;

    private String thirdCategory;

    /**
     * 运营的标准价
     */
    private Long price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getParentAsinCode() {
        return parentAsinCode;
    }

    public void setParentAsinCode(String parentAsinCode) {
        if (parentAsinCode != null && parentAsinCode.length() > 0) {
            this.parentAsinCode = parentAsinCode;
        }
    }

    public Platform getPlatform() {
        return Platform.getPlatformBySiteName(platform);
    }

    public void setPlatform(Platform platform) {
        if (platform != null) {
            this.platform = platform.getValue();
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getBrandImgUrl() {
        return brandImgUrl;
    }

    public void setBrandImgUrl(String brandImgUrl) {
        this.brandImgUrl = brandImgUrl;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getThirdCategory() {
        return thirdCategory;
    }

    public void setThirdCategory(String thirdCategory) {
        this.thirdCategory = thirdCategory;
    }

    public String getFirstCategory() {
        return firstCategory;
    }

    public void setFirstCategory(String firstCategory) {
        this.firstCategory = firstCategory;
    }

    public String getSecondCategory() {
        return secondCategory;
    }

    public void setSecondCategory(String secondCategory) {
        this.secondCategory = secondCategory;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getManMadeTitle() {
        return manMadeTitle;
    }

    public void setManMadeTitle(String manMadeTitle) {
        this.manMadeTitle = manMadeTitle;
    }

    public String getManMadeBrandId() {
        return manMadeBrandId;
    }

    public void setManMadeBrandId(String manMadeBrandId) {
        this.manMadeBrandId = manMadeBrandId;
    }

    @Override
    public String toString() {
        return "HaitaoProductInfo{" +
                "id=" + id +
                ", platform=" + platform +
                ", itemId='" + itemId + '\'' +
                ", homeUrl='" + homeUrl + '\'' +
                ", parentAsinCode='" + parentAsinCode + '\'' +
                ", title='" + title + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", dimension='" + dimension + '\'' +
                ", origin='" + origin + '\'' +
                ", introduction='" + introduction + '\'' +
                ", description='" + description + '\'' +
                ", detail='" + detail + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", type='" + type + '\'' +
                '}';
    }
}