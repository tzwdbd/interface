package com.oversea.task.domain;

import java.io.Serializable;

public class ProxyIpIndex  implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8141267659568471284L;

	// 主键id
	private Long id;
	
	// url
	private String url;
	
	// 索引号
	private int index;
	
	// 是否完成
	private String isFinish;
	
	// 是否正在运行
	private String isProcess;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
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

}
