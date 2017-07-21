package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;
public class BrushInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1610542842259148226L;
	private Long id;
	private Long brushUserId;
	private String haitaoItemId;
	private String status;
	private Date startTime;
	private Date endTime;
	private String keyWord;
	private String productLocate;
	private Long daySaleNum;
	private Long totalSaleNum;
	private Long brushNum;
	private Long feedbackNum;
	private Long reviewNum;
	private Long totalReviewNum;
	private String returnAddress;
	private String totalPrice;
	private Date gmtCreate;
	private Date gmtModified;
	private Long operatorId;
	private String productName;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public Long getBrushUserId() {
		return brushUserId;
	}

	public void setBrushUserId(Long brushUserId) {
		this.brushUserId=brushUserId;
	}
	public String getHaitaoItemId() {
		return haitaoItemId;
	}

	public void setHaitaoItemId(String haitaoItemId) {
		this.haitaoItemId=haitaoItemId;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status=status;
	}
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime=startTime;
	}
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime=endTime;
	}
	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord=keyWord;
	}
	public String getProductLocate() {
		return productLocate;
	}

	public void setProductLocate(String productLocate) {
		this.productLocate=productLocate;
	}
	public Long getDaySaleNum() {
		return daySaleNum;
	}

	public void setDaySaleNum(Long daySaleNum) {
		this.daySaleNum=daySaleNum;
	}
	public Long getTotalSaleNum() {
		return totalSaleNum;
	}

	public void setTotalSaleNum(Long totalSaleNum) {
		this.totalSaleNum=totalSaleNum;
	}
	public Long getBrushNum() {
		return brushNum;
	}

	public void setBrushNum(Long brushNum) {
		this.brushNum=brushNum;
	}
	public Long getFeedbackNum() {
		return feedbackNum;
	}

	public void setFeedbackNum(Long feedbackNum) {
		this.feedbackNum=feedbackNum;
	}
	public Long getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Long reviewNum) {
		this.reviewNum=reviewNum;
	}
	public Long getTotalReviewNum() {
		return totalReviewNum;
	}

	public void setTotalReviewNum(Long totalReviewNum) {
		this.totalReviewNum=totalReviewNum;
	}
	public String getReturnAddress() {
		return returnAddress;
	}

	public void setReturnAddress(String returnAddress) {
		this.returnAddress=returnAddress;
	}
	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice=totalPrice;
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
	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId=operatorId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}