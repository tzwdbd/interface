package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class AutoOrderSelectProduct implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6166829017717073190L;
	private Long id;
	private String siteName;
	private String productLoadedCode;
	private String singlePriceCode;
	private String numCode;
	private String addCartCode;
	private String addedCode;
	private String cartLoadedCode;
	private String numedCode;
	private Date gmtCreate;
	private Date gmtModified;
	private String operator;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName=siteName;
	}
	public String getProductLoadedCode() {
		return productLoadedCode;
	}

	public void setProductLoadedCode(String productLoadedCode) {
		this.productLoadedCode=productLoadedCode;
	}
	public String getSinglePriceCode() {
		return singlePriceCode;
	}

	public void setSinglePriceCode(String singlePriceCode) {
		this.singlePriceCode=singlePriceCode;
	}
	public String getNumCode() {
		return numCode;
	}

	public void setNumCode(String numCode) {
		this.numCode=numCode;
	}
	public String getAddCartCode() {
		return addCartCode;
	}

	public void setAddCartCode(String addCartCode) {
		this.addCartCode=addCartCode;
	}
	public String getAddedCode() {
		return addedCode;
	}

	public void setAddedCode(String addedCode) {
		this.addedCode=addedCode;
	}
	public String getCartLoadedCode() {
		return cartLoadedCode;
	}

	public void setCartLoadedCode(String cartLoadedCode) {
		this.cartLoadedCode=cartLoadedCode;
	}
	public String getNumedCode() {
		return numedCode;
	}

	public void setNumedCode(String numedCode) {
		this.numedCode=numedCode;
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
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator=operator;
	}
}