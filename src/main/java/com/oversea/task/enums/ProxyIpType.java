package com.oversea.task.enums;

/**
 * @author yangyan
 * @version V1.0
 * @Package com.oversea.task.enums
 * @Description:
 * @date :2016年4月14日 上午11:19:30
 */
public enum ProxyIpType {
	
	home("home", "国内"), oversea("oversea", "国外");

	private String value;
    private String name;
    
    ProxyIpType(String value, String name){
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
