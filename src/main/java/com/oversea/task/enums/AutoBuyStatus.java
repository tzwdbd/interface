package com.oversea.task.enums;

import java.io.Serializable;

public enum AutoBuyStatus implements Serializable {
	AUTO_ORDER_REFUNDED(13, "订单已退款"),
	AUTO_ORDER_NEED_REFUND(14, "订单需要退款"),
	
    AUTO_SCRIBE_SUCCESS(100, "爬取物流成功"),
    AUTO_SCRIBE_ORDER_NOT_READY(99, "订单还没发货,还没生成物流单号"),
    AUTO_SCRIBE_FAIL(98, "爬取物流失败"),
    AUTO_SCRIBE_ORDER_CANCELED(97, "订单被砍单了,需重新下单"),
    AUTO_SCRIBE_ORDER_NOT_FIND(96, "订单没找到"),
    AUTO_SCRIBE_MALL_ORDER_EMPTY(95, "商城订单号为空"),
    AUTO_SCRIBE_LOGIN_SUCCESS(94, "爬物流登录成功"),
    AUTO_SCRIBE_LOGIN_FAIL_NEED_AUTH(93, "爬物流登录失败,需要验证"),
    AUTO_SCRIBE_LOGIN_FAIL_TIME_OUT(92, "爬物流登录失败,超时"),
    AUTO_SCRIBE_SETUP_FAIL(91, "初始化失败"),
    AUTO_SCRIBE_CALL_CUSTOMER_SERVICE(90, "订单hold,需要寻找客服处理"),
    AUTO_SCRIBE_NEED_SINGLE(70, "需要单独爬取物流"),

    AUTO_PAY_SUCCESS(1000, "下单成功"),
    AUTO_PAY_FAIL(1401, "下单失败"),
    AUTO_PAY_SELECT_ADDR_FAIL(1402, "选择目标地址失败"),
    AUTO_PAY_SELECT_ADDR_SUCCESS(1403, "选择目标地址成功"),
    AUTO_PAY_SELECT_DElLIVERY_OPTIONS_FAIL(1404, "选择快递选项失败"),
    AUTO_PAY_SELECT_DElLIVERY_OPTIONS_SUCCESS(1405, "选择快递选项成功"),
    AUTO_PAY_SELECT_GIFTCARD_FAIL(1407, "选择礼品卡失败"),
    AUTO_PAY_SELECT_GIFTCARD_SUCCESS(1408, "选择礼品卡成功"),
    AUTO_PAY_SELECT_VISA_CARD_FAIL(1409, "验证支付方式失败"),
    AUTO_PAY_SELECT_VISA_CARD_SUCCESS(1410, "验证支付方式成功"),
    AUTO_PAY_GET_TOTAL_PRICE_FAIL(1011, "获取总价失败"),
    AUTO_PAY_TOTAL_GAP_OVER_APPOINT(1012, "总价差距超过约定"),
    AUTO_PAY_ADDR_INDEX_OVER_MAX(1013, "所选地址超过总地址个数"),
    AUTO_PAY_GIFTCARD_IS_TAKEOFF(1014, "礼品卡金额不足本次支付"),
    AUTO_PAY_SERVER_SIDE_DISALLOW(1015, "服务器端禁止付款"),
    AUTO_PAY_CAN_NOT_FIND_CARDNO(1016, "没有找到可用的信用卡卡号"),
    AUTO_PAY_GET_MALL_ORDER_NO_FAIL(1017,"获取MallOrderNo出错"),
    AUTO_PAY_SELECT_EXPIRE_DATE_OVERDUE(1018,"选择身份证有效期已过期"),
    AUTO_PAY_NOT_SUPPORT_ADDRESS(1411,"不支持的转运地址"),

    AUTO_LOGIN_SETUP_FAIL(1001, "初始化失败"),
    AUTO_CLIENT_NETWORK_TIMEOUT(1002, "网络超时"),
    AUTO_LOGIN_EXP_MEET_VALIDATE_CODE(1005, "需要验证码"),
    AUTO_LOGIN_EXP_MEET_PHONE_NUM(1006, "需要手机号"),
    AUTO_LOGIN_EXP_MEET_ZIPCODE(1007, "需要邮编"),
    AUTO_LOGIN_EXP_MEET_VISA(1008, "需要visa"),
    AUTO_LOGIN_EXP_UNKNOWN(1009, "账号无法登录"),
    AUTO_LOGIN_EXP_ACCOUNT_FORBIDDEN(1010, "账号可能被禁用"),
    AUTO_LOGIN_SUCCESS(1100, "登陆成功"),

    AUTO_CLEAN_CART_FAIL(1101, "清空购物车失败"),
    AUTO_CLEAN_CART_SUCCESS(1200, "清空购物车成功"),
    AUTO_CLICK_CART_SUCCESS(1102, "跳转到购物车成功"),
    AUTO_CLICK_CART_FAIL(1103, "跳转到购物车失败"),
    AUTO_ADD_CART_FAIL(1104, "加入到购物车失败"),

    AUTO_SKU_OPEN_FAIL(1201, "打开商品链接失败"),
    AUTO_SKU_SELECT_EXCEPTION(1202, "选择sku碰到异常"),
    AUTO_SKU_IS_OFFLINE(1203, "商品已经下架"),
    AUTO_SKU_NOT_FIND(1204, "找不到指定的sku"),
    AUTO_SKU_ADD_ON(1205, "商品这个sku是凑单商品,不支持购买"),
    AUTO_SKU_SELECT_NUM_FAIL(1206, "选择商品数量失败"),
    AUTO_SKU_THIRD_PRODUCT(1207, "该商品是第三方商品,不支持购买"),
    AUTO_SKU_CART_NOT_FIND(1208, "找不到加购物车按钮,会员商品,账号不支持购买"),
    AUTO_SKU_SELECT_SUCCESS(1300, "选择sku成功"),
    AUTO_SKU_ADD_SUCCESS(1301, "加入购物车成功"),

    AUTO_ORDER_TASK_TIME_OUT(1500, "服务端超时"),
    AUTO_ORDER_PARAM_IS_NULL(1600, "所需参数为空"),
    AUTO_ORDER_MANUAL__FAIL(1700, "手动下单失败,重新分配账号"),
    AUTO_ORDER_ING(2002, "下单中"),
    AUTO_PAY_PARPARE(0, "准备爬取"),
    CLIENT_ORDER_TASK_STATUS_ERROR(1400, "客户端返回状态异常"), 
    
    AUTO_REDEEM_GIFT_CARD_SUCCESS(1801,"礼品卡充值成功"),
    AUTO_REDEEM_GIFT_CARD_FAKE_FAIL(1803,"礼品卡充值成功,但数额不匹配"),
    AUTO_REDEEM_GIFT_CARD_ALREADY_USE(1804,"该卡号已经被使用"),
	AUTO_REDEEM_GIFT_CARD_FAIL(1802,"礼品卡充值失败"),

	AUTO_CHOOSE_ORDER_FAIL(1900,"选择商城订单失败"),
	AUTO_CHOOSE_ORDER_SUCCESS(1901,"选择商城订单成功"),
	AUTO_CHOOSE_ORDER_MALL_ORDER_EMPTY(1902,"选择商城订单，商城订单号为空"),
	AUTO_CHOOSE_ORDER_ORDER_NOT_FIND(1903,"选择商城订单，找不到订单"),
	AUTO_FEED_BACK_SUCCESS(1904,"feedBackSeller成功"),
	AUTO_FEED_BACK_FAIL(1905,"feedBackSeller失败"),
	AUTO_FEED_BACK_CAN_NOT_FIND_BUTTON(1906,"feedBackSeller找不到按钮"),
	AUTO_REVIEW_SUCCESS(1907,"review成功"),
	AUTO_REVIEW_FAIL(1908,"review失败"),
	AUTO_REVIEW_CAN_NOT_FIND_BUTTON(1909,"review找不到按钮"),
	AUTO_CHECK_REVIEW_FAIL(1910,"检查review，review失败"),
	AUTO_CHECK_REVIEW_SUCCESS(1911,"检查review，review成功"),
	AUTO_CHECK_REVIEW_EXCEPTION(1912,"检查review异常"),
	AUTO_CHECK_REVIEW_NEVER_REVIEW(1913,"检查review,还未review"),
	AUTO_STAR(4000,"点赞初始状态"),
	AUTO_STAR_STATUS(4100,"点赞状态"),
	AUTO_STAR_ING(4200,"点赞中"),
	AUTO_STAR_FAIL(4210,"点赞失败"),
	AUTO_STAR_SUCCESSL(4300,"点赞成功")
	;
	
	
	

    protected int value;
    protected String name;

    AutoBuyStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static AutoBuyStatus getAutoBuyStatusByValue(int value) {
        for (AutoBuyStatus autoBuyStatus : AutoBuyStatus.values()) {
            if (autoBuyStatus.getValue() == value) {
                return autoBuyStatus;
            }
        }
        return null;
    }
}
