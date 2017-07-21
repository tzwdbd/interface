package com.oversea.task.domain;

import java.io.Serializable;

public class TransferClearInfo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2517013771074416743L;

    public static final String TABLE_ID = TransferClearInfo.class.getSimpleName();

    private String recipientName;
    private String recipientProvince;
    private String recipientCity;
    private String recipientAddress;
    private String recipientZipCode;
    public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientProvince() {
		return recipientProvince;
	}
	public void setRecipientProvince(String recipientProvince) {
		this.recipientProvince = recipientProvince;
	}
	public String getRecipientCity() {
		return recipientCity;
	}
	public void setRecipientCity(String recipientCity) {
		this.recipientCity = recipientCity;
	}
	public String getRecipientAddress() {
		return recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}
	public String getRecipientZipCode() {
		return recipientZipCode;
	}
	public void setRecipientZipCode(String recipientZipCode) {
		this.recipientZipCode = recipientZipCode;
	}
	public String getRecipientTel() {
		return recipientTel;
	}
	public void setRecipientTel(String recipientTel) {
		this.recipientTel = recipientTel;
	}
	private String recipientTel;

}
