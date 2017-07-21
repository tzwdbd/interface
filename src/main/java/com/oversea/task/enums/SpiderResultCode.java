package com.oversea.task.enums;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.task.enums
 * @Description: 爬虫返回结果
 * @date 15/12/24 11:22
 */
public enum SpiderResultCode {

    InvalidProduct("InvalidProduct", "无效商品"),
    RequestTimeOut("RequestTimeOut", "请求超时"),
    RequestThrottled("RequestThrottled", "操作太快"),
    NotValidSKU("NotValidSKU", "没有有效sku"),
    NotFound404("NotFound404", "页面无法找到"),
    NotFoundItemEle("NotFoundItemEle", "没有找到元素"),
    UnknownError("UnknownError", "未知错误"),
    TimeOut("TimeOut", "超时"),
    Success("Success", "成功");

    protected String value;
    protected String name;

    SpiderResultCode(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static SpiderResultCode getSpiderResultCodeStatusByValue(String value) {
        for (SpiderResultCode spiderCode : SpiderResultCode.values()) {
            if (spiderCode.getValue().equals(value)) {
                return spiderCode;
            }
        }
        return null;
    }
}
