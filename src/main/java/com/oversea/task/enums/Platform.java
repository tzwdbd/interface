package com.oversea.task.enums;


public enum Platform {

    amazon("amazon"),
    _6pm("_6pm"),
    express("express"),
    vitacost("vitacost"),
    zappos("zappos"),
    drugstore("drugstore"),
    shopbop("shopbop"),
    lookfantastic("lookfantastic"),
    diapers("diapers"),
    asos("asos"),
    nissen("nissen"),
    haitaocheng("haitaocheng"),
    smzdm("smzdm"),
    gymboree("gymboree"),
    nordstrom("nordstrom"),
    iherb("iherb"),
    gilt("gilt"),
    origins("origins"),
    clinique("clinique"),
    ashford("ashford"),
    walgreens("walgreens"),
    bellemaison("bellemaison"),
    woot("woot"),
    sierra("sierra"),
    victoriassecret("victoriassecret"),
    meidebi("meidebi"),
    walatao("walatao"),
    bingfan("bingfan"),
    taobao("taobao"),
    zhefengle("zhefengle"),
    eastbay("eastbay"),
    famousfootwear("famousfootwear"),
    gnc("gnc"),
    ralphlauren("ralphlauren"),
    ninewest("ninewest"),
    esteelauder("esteelauder"),
    katespade("katespade"),
    jomashop("jomashop"),
    dsw("dsw"),
    kipling("kipling"),
    footlocker("footlocker"),
    saks("saks"),
    skinstore("skinstore"),
    carters("carters"),
    oshkosh("oshkosh"),
    shiseido("shiseido"),
    levis("levis"),
    nautica("nautica"),
    bloomingdales("bloomingdales"),
    disneystore("disneystore"),
    bobbibrowncosmetics("bobbibrowncosmetics"),
    shoes("shoes"),
    giorgioarmanibeauty("giorgioarmanibeauty"),
    royyoungchemist("royyoungchemist"),
    lacoste("lacoste"),
    sasa("sasa"),
    brooksbrothers("brooksbrothers"),
    rei("rei"),
    shoebuy("shoebuy"),
    feelunique("feelunique"),
    swarovski("swarovski"),
    backcountry("backcountry"),
    escentual("escentual"),
    mankind("mankind"),
    neimanmarcus("neimanmarcus"),
    cnroyyoungchemist("cnroyyoungchemist"),
    thehut("thehut"),
    pharmacyonline("pharmacyonline"),
    yodobashi("yodobashi"),
    unineed("unineed"),
    toryburch("toryburch"),
    ebags("ebags"),
    thenorthface("thenorthface"),
    josephjoseph("josephjoseph"),
    rebeccaminkoff("rebeccaminkoff"),
    moosejaw("moosejaw"),
    macys("macys"),
    chemistwarehouse("chemistwarehouse"),
    hksasa("hksasa"),
    _11street("_11street"),
    coggles("coggles"),
    worldofwatches("worldofwatches"),
    ssense("ssense"), 
    fwrd("fwrd"),
    jcrew("jcrew"),
    mybag("mybag"),
    otteny("otteny"),
    lastcall("lastcall"),
    hkcosmede("hkcosmede")
    ;

    private String value;

    Platform(String value) {
        this.value = value;
    }

    public static Platform create(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        for (Platform paltform : Platform.values()) {
            if (paltform.getValue().equals(value)) {
                return paltform;
            }
        }
        return null;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    public static Platform getPlatformByProductUrl(String url) {
        if (url.contains(_6pm.getValue().replace("_", ""))) {
            return _6pm;
        }
        for (Platform s : Platform.values()) {
            if (url.contains(s.getValue())) {
                return s;
            }
        }
        return null;
    }

    public static Platform getPlatformBySiteName(String siteName) {
        if ("amazon.jp".equals(siteName)) {
            return amazon;
        }
        for (Platform s : Platform.values()) {
            if (s.getValue().equals(siteName)) {
                return s;
            }
        }
        return null;
    }

}
