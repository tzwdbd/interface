package com.oversea.task.obj;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.entity
 * @date 15/10/19 19:32
 */
public abstract class AbstractTaskResult implements TaskResult {

    private static final long serialVersionUID = 1821669039934000153L;

    private long id;

    private String taskName;

    protected Object value;

    private Map<Object, Object> params = new HashMap<Object, Object>();

    // Service开始时间
    private volatile long serviceStartTime;

    // Service结束时间
    private volatile long serverEndTime;

    private boolean isRetry = false;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Map<Object, Object> getParams() {
        return params;
    }

    public void setParams(Map<Object, Object> params) {
        this.params = params;
    }

    public long getServiceStartTime() {
        return serviceStartTime;
    }

    public void setServiceStartTime(long serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public long getServerEndTime() {
        return serverEndTime;
    }

    public void setServerEndTime(long serverEndTime) {
        this.serverEndTime = serverEndTime;
    }

    public Object getParam(String param) {
        return params.get(param);
    }

    public Object addParam(String key, Object value) {
        params.put(key, value);
        return value;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean isRetry() {
        return isRetry;
    }

    public void setRetry(boolean retry) {
        isRetry = retry;
    }
}
