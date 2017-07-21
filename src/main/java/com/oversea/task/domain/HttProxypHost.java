package com.oversea.task.domain;

import java.io.Serializable;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.task.domain
 * @Description: 代理对象
 * @date 16/3/18 18:02
 */
public class HttProxypHost implements Serializable {

    private static final long serialVersionUID = 3015681719531351218L;

    private String hosts;

    private int port;

    private String type;

    public static final int NORMAL = 1;

    public static final int UNUSED = 0;

    public static final int UNAVAILABLE = 2;

    /**
     * 1:可以正常使用,2:无法使用,0:未使用
     */
    private int status = UNUSED;

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
