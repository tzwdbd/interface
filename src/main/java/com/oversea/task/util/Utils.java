package com.oversea.task.util;

/**
 * @author fengjian
 * @version V1.0
 * @title: oversea
 * @Package com.oversea.task.util
 * @Description:
 * @date 16/6/8
 */
public class Utils {

    public static <T> T defaultValue(T object, T defaultVal) {
        if (object == null) {
            return defaultVal;
        }
        return object;
    }
}
