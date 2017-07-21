package com.oversea.task.obj;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.enums
 * @Description: 任务状态
 * @date 15/10/25 21:25
 */
public enum TaskStatus {

    UNUSED(-1, "未使用"),

    PROCESSING(-2, "使用中"),

    SUCCESSED(0, "成功"),

    TIMEOUT(2, "超时"),

    FAIL(1, "失败"),

    INTERRUPT(3, "中止"),

    NO_MACHINE(4, "没有机器"),

    CANCELED(5,"被取消");

    private int value;

    private String name;

    TaskStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return this.value >= 0;
    }
}
