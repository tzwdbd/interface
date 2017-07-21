package com.oversea.task.enums;

public enum SiteName {
	AMAZON("amazon"),
	AMAZON_JP("amazon.jp"),
	_6PM("6pm"),
	DRUGSTORE("drugstore"),
	ASOS("asos"),
	NORDSTROM("nordstrom"),
	NINEWEST("ninewest"),
	ASHFORD("ashford"),
	AMAZON_TEST("amazon_test"),
	AMAZON_JP_TEST("amazon.jp_test"),
	;

	protected String name;
	

	SiteName( String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
