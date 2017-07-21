package com.oversea.task.util;

/**
 * @author fengjian
 * @version V1.0
 * @title: oversea
 * @Package com.oversea.task.util
 * @Description:
 * @date 16/5/26
 */
public class HexUtils {

    public static String byte2hex(byte[] b) {
        StringBuilder sb = new StringBuilder();
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1) {
                sb.append("0").append(stmp);
            } else {
                sb.append(stmp);
            }

        }
        return sb.toString();
    }

    public static byte[] hex2byte(String str) {
        if (str == null)
            return null;
        str = str.trim();
        int len = str.length();
        if (len == 0 || len % 2 == 1)
            return null;
        byte[] b = new byte[len / 2];
        try {
            for (int i = 0; i < str.length(); i += 2) {
                b[i / 2] = (byte) Integer.decode("0X" + str.substring(i, i + 2)).intValue();
            }
            return b;
        } catch (Exception e) {
            return null;
        }
    }
}
