package com.oversea.task.enums;

public enum MoneyUnits {
    Dollar("$", "美金", "USD"),
    YEN("円", "日元", "JPY"),
    GBP("￡", "英镑", "GBP"),
    EUR("€", "欧元", "EUR"),
    RMB("¥", "人民币", "CNY"),
    KRW("₩", "韩元", "KRW"),
    HKD("HK$", "港币", "HKD"),
    AUD("AU$", "澳元", "AUD");

    private String value;
    private String name;
    private String code;

    MoneyUnits(String value, String name, String code) {
        this.value = value;
        this.name = name;
        this.code = code;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static MoneyUnits getMoneyUnitsByName(String name) {
        if (name == null || name.length() == 0) {
            return null;
        }
        for (MoneyUnits mn : MoneyUnits.values()) {
            if (name.equalsIgnoreCase(mn.getName())) {
                return mn;
            }
        }
        return null;
    }

    public static MoneyUnits getMoneyUnitsByValue(String value) {
        if (value == null) {
            return null;
        }
        for (MoneyUnits mn : MoneyUnits.values()) {
            if (value.equalsIgnoreCase(mn.getValue())) {
                return mn;
            }
        }
        return null;
    }

    public static MoneyUnits getMoneyUnitsByCode(String code) {
        if (code == null) {
            return null;
        }
        for (MoneyUnits mn : MoneyUnits.values()) {
            if (code.equalsIgnoreCase(mn.getCode())) {
                return mn;
            }
        }
        return null;
    }

}
