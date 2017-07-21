package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductAttributeEntity implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -8644897829097671697L;

	public static final String TABLE_ID = ProductAttributeEntity.class.getSimpleName();
    
	private Long id;
	private Long productId;
	private Long productAttributeId;
	private String name;
	private String value;
	private String chineseValue;
	private Integer status;
	private Date gmtCreate;
	private Date gmtModified;
	private String externalValue;
	private Integer index;
	private Integer skuStatus;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	
	public Long getProductAttributeId() {
		return productAttributeId;
	}

	public void setProductAttributeId(Long productAttributeId) {
		this.productAttributeId=productAttributeId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value=value;
	}
	public String getChineseValue() {
		return chineseValue;
	}

	public void setChineseValue(String chineseValue) {
		this.chineseValue=chineseValue;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status=status;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getExternalValue() {
        return externalValue;
    }

    public void setExternalValue(String externalValue) {
        this.externalValue = externalValue;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

	public Integer getSkuStatus() {
		return skuStatus;
	}

	public void setSkuStatus(Integer skuStatus) {
		this.skuStatus = skuStatus;
	}

	@Override
	public String toString() {
		return "ProductAttributeEntity{" +
				"id=" + id +
				", productId=" + productId +
				", productAttributeId=" + productAttributeId +
				", name='" + name + '\'' +
				", value='" + value + '\'' +
				", chineseValue='" + chineseValue + '\'' +
				", status=" + status +
				", gmtCreate=" + gmtCreate +
				", gmtModified=" + gmtModified +
				", externalValue='" + externalValue + '\'' +
				", index=" + index +
				'}';
	}
}