package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class HaitaoCompetitorRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6263143528153172459L;
	
	// 主键ID
	private Long id;
	
	private String siteName;
	
	private String subSiteName;
	
	private Integer index;
	
	private String isFinish;
	
	private String isProcess;
	
	private Date gmtCreate;

	private Date gmtModified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSubSiteName() {
		return subSiteName;
	}

	public void setSubSiteName(String subSiteName) {
		this.subSiteName = subSiteName;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getIsFinish() {
		return isFinish;
	}

	public void setIsFinish(String isFinish) {
		this.isFinish = isFinish;
	}

	public String getIsProcess() {
		return isProcess;
	}

	public void setIsProcess(String isProcess) {
		this.isProcess = isProcess;
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
}
