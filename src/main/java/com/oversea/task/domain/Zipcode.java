package com.oversea.task.domain;

import java.io.Serializable;

import java.util.Date;

public class Zipcode implements Serializable {
	
	private static final long serialVersionUID = 8346880060402952879L;
	
	private Long id;
    private String state;
    private String stateCode;
    private String city;
    private String cityCode;
    private String district;
    private String zip;
    private Date gmtCreate;
    private Date gmtModified;
    private String operator;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state=state;
    }
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode=stateCode;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city=city;
    }
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode=cityCode;
    }
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district=district;
    }
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip=zip;
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