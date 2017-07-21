package com.oversea.task.enums;

import java.io.IOException;

import com.oversea.task.obj.Task;
import com.oversea.task.obj.TaskStatus;
import com.oversea.task.util.GZIPUtil;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.entity
 * @date 15/10/19 19:46
 */
public class ClientTaskResult extends AbstractTaskResult {

    private static final long serialVersionUID = 1898031744273557701L;

    private boolean gzipOn = false;

    /**
     * 任务状态
     */
    private TaskStatus taskStatus = TaskStatus.UNUSED;

    //错误异常
    private String exception;

    public Object getValue() {
        if (this.gzipOn) {
            try {
                return GZIPUtil.unGzipToObject((byte[]) this.value);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return value;
        }
    }

    public void setValue(Object value) {
        if (this.gzipOn) {
            try {
                this.value = GZIPUtil.gZip(value);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            this.value = value;
        }
    }

   

    @Override
    public void setGzipOn(boolean gzipOn) {
        this.gzipOn = gzipOn;
    }

    @Override
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public boolean isGzipOn() {
        return gzipOn;
    }

    @Override
    public boolean isSuccess() {
        return TaskStatus.SUCCESSED.equals(taskStatus);
    }

    @Override
    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * 新生成taskResult
     *
     * @param detail
     * @return
     */
    public static ClientTaskResult newClientTaskResult(Task detail) {
        ClientTaskResult result = new ClientTaskResult();
        result.setId(detail.getId());
        result.setTaskName(detail.getTaskName());
        result.setServiceStartTime(System.currentTimeMillis());
        result.setTaskStatus(TaskStatus.UNUSED);
        result.setRetry(false);
        return result;
    }

    /**
     * 新生成错误taskResult
     *
     * @param errorMsg
     * @return
     */
    public static ClientTaskResult newErrorTaskResult(TaskStatus taskStatus, String errorMsg) {
        ClientTaskResult result = new ClientTaskResult();
        result.setServiceStartTime(System.currentTimeMillis());
        result.setTaskStatus(taskStatus);
        result.setException(errorMsg);
        return result;
    }

}
