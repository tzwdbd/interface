package com.oversea.task.enums;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.task.enums
 * @Description: 状态状态
 * @date 15/12/2 19:33
 */
public enum AccountStatus {

    Init(0, "空闲状态"),
    Ready(1, "打款数据分配完成"),
    PayGiftcardIsTakeoff(99, "礼品卡余额不足"),
    loginUnabled(98, "账号暂时无法登陆"),
    Recharging_fail(97, "充值失败"),
    Recharging(90, "充值中"),
    Done(4, "打款完成");

    protected int value;
    protected String name;

    AccountStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
