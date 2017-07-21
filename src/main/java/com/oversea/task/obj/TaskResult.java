package com.oversea.task.obj;

import java.io.Serializable;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.entity
 * @Description: 任务返回结果
 * @date 15/10/11 23:03
 */
public interface TaskResult extends Serializable {

    public Object getValue();

    public void setValue(Object value);


    public Long getId();

    public String getTaskName();

    public Object getParam(String param);

    public Object addParam(String key, Object value);

    public void setGzipOn(boolean gzipOn);

    public boolean isRetry();

    public boolean isSuccess();

    public TaskStatus getTaskStatus();

    public String getException();
}
