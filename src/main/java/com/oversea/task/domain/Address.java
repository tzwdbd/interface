package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class Address implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2517013771074416743L;

    public static final String TABLE_ID = Address.class.getSimpleName();

    private Long id;
    private Long userId;
    private String name;
    private String mobile;
    private String zip;
    private String state;
    private String city;
    private String district;
    private String address;
    private String isthemain;
    private Date gmtCreate;
    private Date gmtModified;
    private String idCard;
    private String idCardFront;
    private String idCardBack;
    private String idCardStatus;
    private String expireDate;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCardFront() {
        return idCardFront;
    }

    public void setIdCardFront(String idCardFront) {
        this.idCardFront = idCardFront;
    }

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
    }

    public String getIdCardStatus() {
        return idCardStatus;
    }

    public void setIdCardStatus(String idCardStatus) {
        this.idCardStatus = idCardStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsthemain() {
        return isthemain;
    }

    public void setIsthemain(String isthemain) {
        this.isthemain = isthemain;
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

    public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	@Override
    public String toString() {
        return "Address [id=" + id + ", userId=" + userId + ", name=" + name + ", mobile=" + mobile + ", zip=" + zip + ", state=" + state + ", city=" + city + ", district=" + district + ", address="
                + address + ", isthemain=" + isthemain + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + ", idCard=" + idCard + ", idCardFront=" + idCardFront + ", idCardBack="
                + idCardBack + ", idCardStatus=" + idCardStatus + "]";
    }
}
