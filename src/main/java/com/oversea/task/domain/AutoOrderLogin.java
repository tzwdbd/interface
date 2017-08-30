package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class AutoOrderLogin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8850400688977189797L;
	private Long id;
	private String mallName;
	private String loginUrl;
	private String usernameCode;
	private String passwordCode;
	private String submitCode;
	private String confirmCode;
	private Date gmtCreate;
	private Date gmtModified;
	private String operator;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName=mallName;
	}
	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl=loginUrl;
	}
	public String getUsernameCode() {
		return usernameCode;
	}

	public void setUsernameCode(String usernameCode) {
		this.usernameCode=usernameCode;
	}
	public String getPasswordCode() {
		return passwordCode;
	}

	public void setPasswordCode(String passwordCode) {
		this.passwordCode=passwordCode;
	}
	public String getSubmitCode() {
		return submitCode;
	}

	public void setSubmitCode(String submitCode) {
		this.submitCode=submitCode;
	}
	public String getConfirmCode() {
		return confirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		this.confirmCode=confirmCode;
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