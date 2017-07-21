package com.oversea.task.obj;


/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.entity
 * @date 15/10/19 19:01
 */
public class TaskDetail extends AbstractTaskDetail {

    private static final long serialVersionUID = 8737496338848537758L;

    private String taskName;

    // 机器Group
    private String group;

    // 任务的执行者机器
    private String exeMachineName;

    //当前任务重试次数
    private int retryTimes = 0;

    // 发送类型 同步/异步
    private int sendType;

    //缓存满后策略

    public TaskDetail() {
        super();
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public void setGroup(String group) {
        this.group = group;
    }

    public int getRetryTimes() {
        return retryTimes;
    }

    public void incRetry() {
        this.retryTimes++;
    }


    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getExeMachineName() {
        return exeMachineName;
    }

    public void setExeMachineName(String exeMachineName) {
        this.exeMachineName = exeMachineName;
    }

    public int getSendType() {
        return sendType;
    }

    public void setSendType(int sendType) {
        this.sendType = sendType;
    }


    @Override
    public String toString() {
        return "ClientTaskDetail{" +
                "id=" + super.getId() + "\'" +
                "taskName='" + taskName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

	@Override
	public String getTaskId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}
