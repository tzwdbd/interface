package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * *
 * 类名：ProductEntity
 * 功能：商品sku属性类
 * 详细：基本属性
 * 日期：2016年1月29日
 * 作者：andy
 * email: baoyp@qichuang.com
 * 说明：废弃部分字段
 */
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1984094946053577641L;
    /**
     * 没有SKU的情况，商品没有属性
     */
    public static final String INVALID_SIGN = "#";

    private Long id; //商品sku主键id
    private Long productId; //商品主键id 外健
    private String productName; //商品名称
    private String productEntityCode; //商品sku信息组合id
    private String externalProductEntitytId;//外部商品sku 码
    private Integer storeNumber;// 本地商品库存数量
    private Integer storeOwn;//私有库存
    private Integer price;//单位:第三方货币-分  产品目前价格（来源合作客户）
    private Integer originprice;//单位:第三方货币-分 产品初始价格（来源合作客户）
    private Integer realprice;//单位:人民币-分 换算后人民币价格
    private Integer referenceprice;//国内价(即:参考价) 单位:人民币-分
    private Long mallId; //合作渠道id
    private String upc; //物流相关
    private String ean; //物流相关
    private String partnerId; //合作客户id（冗余） 
    private Long productImageId; //商品图片id
    private Integer status; //商品sku状态
    private Integer skuStatus; //1:隐藏sku, 0:显示sku（人工操作）
    private Date gmtCreate; //商品操作创建时间
    private Date gmtModified; //商品操作修改时间
    private String externalProductEntityCode;//外部商品sku 码

    //压货数量
    private Integer stock; //库存

    private Integer stockIn; //库存买入

    private Integer stockOut;//库存卖出

    private String upperLimit;//商品限购数量
    
    private String stroge; //商品库存数量
    
    private Long categoryId;//三级类目

    private String productWeight;// 商品重量

    private Integer skuLimitBuy;//sku限购


    /**
     * 后台admin显示用
     */
    private String currentRate;
    private String currentPriceRmb;
    private String originalPriceRmb;
    private String expressFeeRmb;
    private String mallFeeRmb;
    private String taxFeeRmb;

    /**
     * 下调到的免税价格
     */
    private Double free_tax_price;

    /**
     * 从商品裸价3%
     */
    private Double sku_add_price;

    /**
     * 走邮关 安全价格
     */
    private String insurancePrice;


    private String attrValue;
    private String attrChineseValue;

    //购买的数量
    private transient Integer buyCount;
    //user_shopping_cart的id
    private transient Long shopping_goods_id;
    //奶粉税率特殊处理
    private String taxWeight;
    private String weight;

    //计算税费的方式
    private String modeType;

    //商城优惠专题id
    private Long themeId;
    //商城一口价
    private String fixedPrice;
    //商城到手价
    private String tagPrice;
    //商品类型
    private String goodType;

    //一口价变动差额
    private String reducePrice;

    //直邮或者转运
    private Integer expressType;
    
    //汇率
    private String rate;
    
    //是否需要国内一口价
    private boolean needFixPrice=true;
    //是否需要国内到手价
    private boolean needOrigPrice=true;
    
    //存在限时优惠
    private boolean exsitLimitPromotion;
    //限时优惠商品裸价
    private String restoreGoodPrice;
    
    public String getModeType() {
        return modeType;
    }

    public void setModeType(String modeType) {
        this.modeType = modeType;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }


    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(String insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Integer getStockIn() {
        return stockIn;
    }

    public void setStockIn(Integer stockIn) {
        this.stockIn = stockIn;
    }

    public Integer getStockOut() {
        return stockOut;
    }

    public void setStockOut(Integer stockOut) {
        this.stockOut = stockOut;
    }

    public String getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(String upperLimit) {
		this.upperLimit = upperLimit;
	}

	public String getStroge() {
		return stroge;
	}

	public void setStroge(String stroge) {
		this.stroge = stroge;
	}

	public String getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(String currentRate) {
        this.currentRate = currentRate;
    }

    public String getCurrentPriceRmb() {
        return currentPriceRmb;
    }

    public void setCurrentPriceRmb(String currentPriceRmb) {
        this.currentPriceRmb = currentPriceRmb;
    }

    public String getOriginalPriceRmb() {
		return originalPriceRmb;
	}

	public void setOriginalPriceRmb(String originalPriceRmb) {
		this.originalPriceRmb = originalPriceRmb;
	}

	public String getExpressFeeRmb() {
        return expressFeeRmb;
    }

    public void setExpressFeeRmb(String expressFeeRmb) {
        this.expressFeeRmb = expressFeeRmb;
    }

    public String getMallFeeRmb() {
		return mallFeeRmb;
	}

	public void setMallFeeRmb(String mallFeeRmb) {
		this.mallFeeRmb = mallFeeRmb;
	}

	public String getTaxFeeRmb() {
        return taxFeeRmb;
    }

    public void setTaxFeeRmb(String taxFeeRmb) {
        this.taxFeeRmb = taxFeeRmb;
    }

    public Integer getReferenceprice() {
        return referenceprice;
    }

    public void setReferenceprice(Integer referenceprice) {
        this.referenceprice = referenceprice;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTaxWeight() {
        return taxWeight;
    }

    public void setTaxWeight(String taxWeight) {
        this.taxWeight = taxWeight;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Long getShopping_goods_id() {
        return shopping_goods_id;
    }

    public void setShopping_goods_id(Long shopping_goods_id) {
        this.shopping_goods_id = shopping_goods_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductEntityCode() {
        return productEntityCode;
    }

    public void setProductEntityCode(String productEntityCode) {
        this.productEntityCode = productEntityCode;
    }

    public String getExternalProductEntitytId() {
        return externalProductEntitytId;
    }

    public void setExternalProductEntitytId(String externalProductEntitytId) {
        this.externalProductEntitytId = externalProductEntitytId;
    }

    public Integer getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(Integer storeNumber) {
        this.storeNumber = storeNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOriginprice() {
        return originprice;
    }

    public void setOriginprice(Integer originprice) {
        this.originprice = originprice;
    }

    public Integer getRealprice() {
        return realprice;
    }

    public void setRealprice(Integer realprice) {
        this.realprice = realprice;
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

    public Long getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(Long productImageId) {
        this.productImageId = productImageId;
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

    public String getExternalProductEntityCode() {
        return externalProductEntityCode;
    }

    public void setExternalProductEntityCode(String externalProductEntityCode) {
        this.externalProductEntityCode = externalProductEntityCode;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getAttrChineseValue() {
        return attrChineseValue;
    }

    public void setAttrChineseValue(String attrChineseValue) {
        this.attrChineseValue = attrChineseValue;
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

    public Integer getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    public Double getFree_tax_price() {
        return free_tax_price;
    }

    public void setFree_tax_price(Double free_tax_price) {
        this.free_tax_price = free_tax_price;
    }

    public Double getSku_add_price() {
        return sku_add_price;
    }

    public void setSku_add_price(Double sku_add_price) {
        this.sku_add_price = sku_add_price;
    }

    public Long getThemeId() {
        return themeId;
    }

    public void setThemeId(Long themeId) {
        this.themeId = themeId;
    }

    public String getFixedPrice() {
        return fixedPrice;
    }
	public void setFixedPrice(String fixedPrice) {
		this.fixedPrice = fixedPrice;
	}
	
	public String getTagPrice() {
		return tagPrice;
	}

	public void setTagPrice(String tagPrice) {
		this.tagPrice = tagPrice;
	}

	public String getGoodType() {
		return goodType;
	}

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public Integer getStoreOwn() {
        return storeOwn;
    }

    public void setStoreOwn(Integer storeOwn) {
        this.storeOwn = storeOwn;
    }


    public String getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(String reducePrice) {
        this.reducePrice = reducePrice;
    }

    public Integer getSkuLimitBuy() {
        return skuLimitBuy;
    }

    public void setSkuLimitBuy(Integer skuLimitBuy) {
        this.skuLimitBuy = skuLimitBuy;
    }

    
	public Integer getExpressType() {
		return expressType;
	}

	public void setExpressType(Integer expressType) {
		this.expressType = expressType;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	
	public boolean isNeedFixPrice() {
		return needFixPrice;
	}

	public void setNeedFixPrice(boolean needFixPrice) {
		this.needFixPrice = needFixPrice;
	}

	public boolean isNeedOrigPrice() {
		return needOrigPrice;
	}

	public void setNeedOrigPrice(boolean needOrigPrice) {
		this.needOrigPrice = needOrigPrice;
	}
	
	public boolean isExsitLimitPromotion() {
		return exsitLimitPromotion;
	}

	public void setExsitLimitPromotion(boolean exsitLimitPromotion) {
		this.exsitLimitPromotion = exsitLimitPromotion;
	}

	public String getRestoreGoodPrice() {
		return restoreGoodPrice;
	}

	public void setRestoreGoodPrice(String restoreGoodPrice) {
		this.restoreGoodPrice = restoreGoodPrice;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductEntity)) return false;

        ProductEntity entity = (ProductEntity) o;

        if (productEntityCode != null ? !productEntityCode.equals(entity.productEntityCode) : entity.productEntityCode != null)
            return false;
        if (externalProductEntitytId != null ? !externalProductEntitytId.equals(entity.externalProductEntitytId) : entity.externalProductEntitytId != null)
            return false;
        if (storeNumber != null ? !storeNumber.equals(entity.storeNumber) : entity.storeNumber != null) return false;
        if (price != null ? !price.equals(entity.price) : entity.price != null) return false;
        if (originprice != null ? !originprice.equals(entity.originprice) : entity.originprice != null) return false;
//        if (desc != null ? !desc.equals(entity.desc) : entity.desc != null) return false;
        if (status != null ? !status.equals(entity.status) : entity.status != null) return false;
        if (upc != null ? !upc.equals(entity.upc) : entity.upc != null) return false;
        if (ean != null ? !ean.equals(entity.ean) : entity.ean != null) return false;
        if (skuLimitBuy != null ? !skuLimitBuy.equals(entity.skuLimitBuy) : entity.skuLimitBuy != null) return false;
        return !(externalProductEntityCode != null ? !externalProductEntityCode.equals(entity.externalProductEntityCode) : entity.externalProductEntityCode != null);

    }

    @Override
    public int hashCode() {
        int result = productEntityCode != null ? productEntityCode.hashCode() : 0;
        result = 31 * result + (externalProductEntitytId != null ? externalProductEntitytId.hashCode() : 0);
        result = 31 * result + (storeNumber != null ? storeNumber.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (originprice != null ? originprice.hashCode() : 0);
//        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (skuLimitBuy != null ? skuLimitBuy.hashCode() : 0);
        result = 31 * result + (externalProductEntityCode != null ? externalProductEntityCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", productId=" + productId +
                ", productEntityCode='" + productEntityCode + '\'' +
                ", externalProductEntitytId='" + externalProductEntitytId + '\'' +
                ", storeNumber=" + storeNumber +
                ", price=" + price +
                ", originprice=" + originprice +
                ", realprice=" + realprice +
                ", referenceprice=" + referenceprice +
//                ", discount=" + discount +
//                ", desc='" + desc + '\'' +
                ", mallId=" + mallId +
//                ", activecode='" + activecode + '\'' +
                ", partnerId='" + partnerId + '\'' +
                ", productImageId=" + productImageId +
                ", status=" + status +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", externalProductEntityCode='" + externalProductEntityCode + '\'' +
                ", currentRate='" + currentRate + '\'' +
                ", currentPriceRmb='" + currentPriceRmb + '\'' +
                ", expressFeeRmb='" + expressFeeRmb + '\'' +
                ", taxFeeRmb='" + taxFeeRmb + '\'' +
                ", attrValue='" + attrValue + '\'' +
                ", attrChineseValue='" + attrChineseValue + '\'' +
                ", buyCount=" + buyCount +
                ", shopping_goods_id=" + shopping_goods_id +
                ", taxWeight='" + taxWeight + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}