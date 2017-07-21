package com.oversea.task.enums;

public enum ProductSource {

    haihu("haihu","海狐"),
    haitaocheng("haitaocheng","海淘城");
    
    private String value;
    private String name;
    
    ProductSource(String value, String name){
        this.value = value;
        this.name = name;
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
}
