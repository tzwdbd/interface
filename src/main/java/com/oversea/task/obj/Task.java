package com.oversea.task.obj;

import java.io.Serializable;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.entity
 * @Description: 任务明细
 * @date 15/10/11 23:02
 */
public interface Task extends Serializable{

    public Object getParam(String param);

    public Object addParam(String key,Object value);

    public void setGroup(String group);

    public String getGroup();

    public Long getId();

    public String getTaskName();

    public String getTaskId();
}
