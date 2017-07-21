package com.oversea.task.enums;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.task.enums
 * @Description: 是否状态
 * @date 16/1/27 16:15
 */
public enum BooleanStatus {

    YES(1), NO(0);

    private int val;

    BooleanStatus(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
