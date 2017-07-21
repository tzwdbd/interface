package com.oversea.task.domain;

import java.util.Date;

public class OrderDevice
{
	private Integer deviceId;
	private String deviceIp;
	private Integer priority;
	private Integer status;
	private Integer orderAccountId;
	private String remark;
	private Integer deviceStatus;
	private Date createTime;
	private Date modifyTime;
	private String handle;
	private Date lastRunTime;
	
	public OrderDevice()
	{
	}

	public Integer getDeviceId()
	{
		return deviceId;
	}

	public void setDeviceId(Integer deviceId)
	{
		this.deviceId = deviceId;
	}

	public String getDeviceIp()
	{
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp)
	{
		this.deviceIp = deviceIp;
	}

	public Integer getPriority()
	{
		return priority;
	}

	public void setPriority(Integer priority)
	{
		this.priority = priority;
	}

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public Integer getOrderAccountId()
	{
		return orderAccountId;
	}

	public void setOrderAccountId(Integer orderAccountId)
	{
		this.orderAccountId = orderAccountId;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Integer getDeviceStatus()
	{
		return deviceStatus;
	}

	public void setDeviceStatus(Integer deviceStatus)
	{
		this.deviceStatus = deviceStatus;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public Date getModifyTime()
	{
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime)
	{
		this.modifyTime = modifyTime;
	}

	public String getHandle()
	{
		return handle;
	}

	public void setHandle(String handle)
	{
		this.handle = handle;
	}

	public Date getLastRunTime()
	{
		return lastRunTime;
	}

	public void setLastRunTime(Date lastRunTime)
	{
		this.lastRunTime = lastRunTime;
	}
	
}
