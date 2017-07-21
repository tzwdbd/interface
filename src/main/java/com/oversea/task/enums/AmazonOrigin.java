package com.oversea.task.enums;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.haitao.task.enums
 * @date 15/9/29 18:57
 */
public enum AmazonOrigin {

    US("us","$"),
    JP("jp","円");

    private String value;

    private String unit;

    AmazonOrigin(String value,String unit){
        this.value = value;
        this.unit = unit;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public static AmazonOrigin getAmazonOrigin(String value){
        if(value==null){
            return null;
        }
        for(AmazonOrigin ao: AmazonOrigin.values()) {
            if(value.equalsIgnoreCase(ao.getValue())) {
                return ao;
            }
        }
        return null;
    }
}
