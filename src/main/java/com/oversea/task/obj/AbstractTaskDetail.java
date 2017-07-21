package com.oversea.task.obj;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.entity
 * @date 15/10/19 18:44
 */
public abstract class AbstractTaskDetail implements Task {

    private static final long serialVersionUID = 3527994987270941893L;

    // 该id为自增长由系统产生
    private long id;

    //任务名
    private String taskName;


    // 当前任务的参数
    protected Map<String, Object> params = new HashMap<String, Object>();

    //开始时间
    private Long startTime;

    //客户端返回时间
    private Long endTime;


    AbstractTaskDetail() {
    }

    public Object getParam(String param) {
        return params.get(param);
    }

    public Object addParam(String key, Object value) {
        params.put(key, value);
        return value;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        if (this.startTime == null) {
            this.startTime = startTime;
        }
    }
}
