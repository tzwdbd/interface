package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class AutoOrderCleanCart implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8289426698495908600L;
	private Long id;
	private Integer cleanType;
	private String siteName;
	private String cartUrl;
	private String cartLoadedCode;
	private String removeCode;
	private String confirmCode;
	private String cleanEndCode;
	private Date gmtCreate;
	private Date gmtModified;
	private String operator;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public Integer getCleanType() {
		return cleanType;
	}

	public void setCleanType(Integer cleanType) {
		this.cleanType = cleanType;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName=siteName;
	}
	public String getCartUrl() {
		return cartUrl;
	}

	public void setCartUrl(String cartUrl) {
		this.cartUrl=cartUrl;
	}
	public String getCartLoadedCode() {
		return cartLoadedCode;
	}

	public void setCartLoadedCode(String cartLoadedCode) {
		this.cartLoadedCode=cartLoadedCode;
	}
	public String getRemoveCode() {
		return removeCode;
	}

	public void setRemoveCode(String removeCode) {
		this.removeCode=removeCode;
	}
	public String getConfirmCode() {
		return confirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		this.confirmCode=confirmCode;
	}
	public String getCleanEndCode() {
		return cleanEndCode;
	}

	public void setCleanEndCode(String cleanEndCode) {
		this.cleanEndCode=cleanEndCode;
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