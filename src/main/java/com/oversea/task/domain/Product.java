package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * *
 * 类名：Product
 * 功能：商品属性类
 * 详细：基本属性
 * 日期：2016年1月29日
 * 作者：andy
 * email: baoyp@qichuang.com
 * 说明：equals() 方法 spider 使用和维护
 */
public class Product implements Serializable {

    public static final Integer NEED_TRANSLATE = 0;


    private static final long serialVersionUID = -3965366410933371437L;
    /**
     * 老的调用删除
     * 修改时间 2016年1月29日
     */
//	public static final String TABLE_ID = Product.class.getSimpleName();


    private Long id;
    private String name; //商品名
    private Long categoryId;//三级类目
    private String categoryName;//三级类目名
    private String weight;// 商品重量
    private Long defaultEntityId;//默认实体id
    private String externalProductId;//外部商品id
    private String url;//第三方商品地址
    private Long mallId;//渠道id
    private String partnerId;//合作客户id
    private Integer status;//产品状态
    private String version;//产品版本信息
    private Date gmtCreate;//商品创建时间
    private Date gmtModified;//商品修改时间
    //	private String recommend;//商品详情描述
    private String brand;//品牌信息 spider 调用
    private Integer homeFreight;//境内运费 暂时不废弃
    private String unit; // 货币单位
    private Date startTime; //开始时间
    private Date endTime; //结束时间
    //	private Integer useLimit; //每日限制用户数 已废弃
//	private Integer dayLimit; //产品每天限制数 已废弃
//	private Integer orderLimit; //订单每日限制数 已废弃
    private String source; // 合作方
    private String taxRate; //税率
    private String birdCid; // 笨鸟
    private String rootCategoryId;//一级类目
    private String rootCategoryName;//一级类目名
    private String secondCategoryId;//二级类目
    private String secondCategoryName;//二级类目名
    private String mallProductCode; //外部商城产品码
    private String keyWords; //商品关键字
    private Integer attrType;//'商品属性类型 1-new 2-hot 3-特卖'
    //	private String detailImagesList;//产品详情图片描述 已废弃
    private Long topNum; //置顶
    private int sortNum; //排序字段
    private String shortTitle;//短标题
    /**
     * 新增字段
     **/
    private long brandId;//品牌id 外健
    private Long standardPrice;

    private transient String urlVersion;//url version

    private String titleCn; //翻译后标题

    private Integer needTranslate; //是否需要翻译

    private long operatorId;//操作人
    
    private Date hotEndTime; // 热门截止时间

    private Integer expressType;//物流类型
    
    private Integer storeType=0;//库存类型
    
    private Integer outOfStockReason ;//下架原因
    
    public Integer getOutOfStockReason() {
		return outOfStockReason;
	}

	public void setOutOfStockReason(Integer outOfStockReason) {
		this.outOfStockReason = outOfStockReason;
	}

	public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn;
    }

    public Integer getNeedTranslate() {
        return needTranslate;
    }

    public void setNeedTranslate(Integer needTranslate) {
        this.needTranslate = needTranslate;
    }

    /**
     * add by kevan @2016.4.22 15:33
     * 商品展示图片
     */
    private String imageUrl;

    //限购
    private Integer limitBuy;

    public Long getTopNum() {
        return topNum;
    }

    public void setTopNum(Long topNum) {
        this.topNum = topNum;
    }

    public Integer getAttrType() {
        return attrType;
    }

    public void setAttrType(Integer attrType) {
        this.attrType = attrType;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getRootCategoryId() {
        return rootCategoryId;
    }

    public void setRootCategoryId(String rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    public String getSecondCategoryId() {
        return secondCategoryId;
    }

    public void setSecondCategoryId(String secondCategoryId) {
        this.secondCategoryId = secondCategoryId;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getBirdCid() {
        return birdCid;
    }

    public void setBirdCid(String birdCid) {
        this.birdCid = birdCid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Long getDefaultEntityId() {
        return defaultEntityId;
    }

    public void setDefaultEntityId(Long defaultEntityId) {
        this.defaultEntityId = defaultEntityId;
    }

    public String getExternalProductId() {
        return externalProductId;
    }

    public void setExternalProductId(String externalProductId) {
        this.externalProductId = externalProductId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getMallId() {
        return mallId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    //	public String getRecommend() {
//		return recommend;
//	}
//	public void setRecommend(String recommend) {
//		this.recommend = recommend;
//	}
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getMallProductCode() {
        return mallProductCode;
    }

    public void setMallProductCode(String mallProductCode) {
        this.mallProductCode = mallProductCode;
    }

    public long getBrandId() {
        return brandId;
    }

    public void setBrandId(long brandId) {
        this.brandId = brandId;
    }

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (defaultEntityId != null ? !defaultEntityId.equals(product.defaultEntityId) : product.defaultEntityId != null)
            return false;
        if (externalProductId != null ? !externalProductId.equals(product.externalProductId) : product.externalProductId != null)
            return false;
        if (url != null ? !url.equals(product.url) : product.url != null) return false;
        if (mallId != null ? !mallId.equals(product.mallId) : product.mallId != null) return false;
        if (partnerId != null ? !partnerId.equals(product.partnerId) : product.partnerId != null) return false;
        if (status != null ? !status.equals(product.status) : product.status != null) return false;
//        if (homeFreight != null ? !homeFreight.equals(product.homeFreight) : product.homeFreight != null) return false;
        if (unit != null ? !unit.equals(product.unit) : product.unit != null) return false;
        if (version != null ? !version.equals(product.version) : product.version != null) return false;
        if (mallProductCode != null ? !mallProductCode.equals(product.mallProductCode) : product.mallProductCode != null)
            return false;
        return !(keyWords != null ? !keyWords.equals(product.keyWords) : product.keyWords != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (defaultEntityId != null ? defaultEntityId.hashCode() : 0);
        result = 31 * result + (externalProductId != null ? externalProductId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (mallId != null ? mallId.hashCode() : 0);
        result = 31 * result + (partnerId != null ? partnerId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
//        result = 31 * result + (homeFreight != null ? homeFreight.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (mallProductCode != null ? mallProductCode.hashCode() : 0);
        result = 31 * result + (keyWords != null ? keyWords.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryId=" + categoryId +
                ", weight='" + weight + '\'' +
                ", defaultEntityId=" + defaultEntityId +
                ", externalProductId='" + externalProductId + '\'' +
                ", url='" + url + '\'' +
                ", mallId=" + mallId +
                ", partnerId='" + partnerId + '\'' +
                ", status=" + status +
                ", version='" + version + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
//                ", recommend='" + recommend + '\'' +
                ", brand='" + brand + '\'' +
//                ", homeFreight=" + homeFreight +
                ", unit='" + unit + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
//                ", useLimit=" + useLimit +
//                ", dayLimit=" + dayLimit +
//                ", orderLimit=" + orderLimit +
                ", source='" + source + '\'' +
                ", taxRate='" + taxRate + '\'' +
                ", birdCid='" + birdCid + '\'' +
                ", rootCategoryId='" + rootCategoryId + '\'' +
                ", secondCategoryId='" + secondCategoryId + '\'' +
                ", mallProductCode='" + mallProductCode + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public int getSortNum() {
        return sortNum;
    }

    public void setSortNum(int sortNum) {
        this.sortNum = sortNum;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public Integer getHomeFreight() {
        return homeFreight;
    }

    public void setHomeFreight(Integer homeFreight) {
        this.homeFreight = homeFreight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrlVersion() {
        return urlVersion;
    }

    public void setUrlVersion(String urlVersion) {
        this.urlVersion = urlVersion;
    }

    public Integer getLimitBuy() {
        return limitBuy;
    }

    public void setLimitBuy(Integer limitBuy) {
        this.limitBuy = limitBuy;
    }

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }

    public Long getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Long standardPrice) {
        this.standardPrice = standardPrice;
    }


	public Integer getExpressType() {
		return expressType;
	}

	public void setExpressType(Integer expressType) {
		this.expressType = expressType;
	}


	public Date getHotEndTime() {
		return hotEndTime;
	}

	public void setHotEndTime(Date hotEndTime) {
		this.hotEndTime = hotEndTime;
	}

	public Integer getStoreType() {
		return storeType;
	}

	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}
}