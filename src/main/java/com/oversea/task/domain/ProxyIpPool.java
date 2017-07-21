package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class ProxyIpPool implements Serializable {

    private static final long serialVersionUID = -6908335891849705447L;

    // 主键id
    private Long id;

    // ip
    private String ip;

    // 端口
    private String port;

    // 备注
    private String remark;

    /**
     * status 表示哪些网站可以使用:使用二进制
     * 第一位:amazon.jp,第二位:amaon.com
     * 未验证 -1
     */
    private int status;

    // ip归属
    private String location;

    // 国家
    private String country;

    // 是否高匿
    private int hidden;

    // 最后验证时间
    private Date vaildTime;

    // 验证次数
    private Integer vaildCnt;

    // 类型
    private String type;

    // 是否海外账号 0:是,1:否
    private int oversea;

    // 创建时间
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    public Date getVaildTime() {
        return vaildTime;
    }

    public void setVaildTime(Date vaildTime) {
        this.vaildTime = vaildTime;
    }

    public Integer getVaildCnt() {
        return vaildCnt;
    }

    public void setVaildCnt(Integer vaildCnt) {
        this.vaildCnt = vaildCnt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOversea() {
        return oversea;
    }

    public void setOversea(int oversea) {
        this.oversea = oversea;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 中国
     */
    public static final int CHINESE_MAINLAND = 1;

    /**
     * 海外
     */
    public static final int OVERSEA = 0;
}
