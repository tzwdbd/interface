package com.oversea.task.domain;

import java.util.Date;
public class JobSequence{
	private Long id;
	private String name;
	private Long start;
	private Integer step;
	private String remark;
	private Date gmtSync;
	private Date gmtCreate;
	private Date gmtModified;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start=start;
	}
	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step=step;
	}
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark=remark;
	}
	public Date getGmtSync() {
		return gmtSync;
	}

	public void setGmtSync(Date gmtSync) {
		this.gmtSync=gmtSync;
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
}