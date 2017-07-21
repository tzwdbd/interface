package com.oversea.task.util;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 有关字符串处理的工具类。
 * <p>
 * 这个类中的每个方法都可以“安全”地处理<code>null</code>，而不会抛出<code>NullPointerException</code>。
 * </p>
 *
 * @author caofy
 */
public class StringUtil {
    static String EMPTY_STRING = "";

    /**
     * 取得字符串的长度。
     *
     * @param str 要取长度的字符串
     * @return 如果字符串为<code>null</code>，则返回<code>0</code>。否则返回字符串的长度。
     */
    public static int getLength(String str) {
        return str == null ? 0 : str.length();
    }

    /**
     * 比较两个字符串（大小写不敏感）。
     * <p/>
     * <pre>
     * StringUtil.equalsIgnoreCase(null, null)   = true
     * StringUtil.equalsIgnoreCase(null, "abc")  = false
     * StringUtil.equalsIgnoreCase("abc", null)  = false
     * StringUtil.equalsIgnoreCase("abc", "abc") = true
     * StringUtil.equalsIgnoreCase("abc", "ABC") = true
     * </pre>
     *
     * @param str1 要比较的字符串1
     * @param str2 要比较的字符串2
     * @return 如果两个字符串相同，或者都是<code>null</code>，则返回<code>true</code>
     */
    public static boolean isEqualsIgnoreCase(String str1, String str2) {
        if (str1 == null) {
            return str2 == null;
        }

        return str1.equalsIgnoreCase(str2);
    }

    // ==========================================================================
    // 判空函数。
    //
    // 以下方法用来判定一个字符串是否为：
    // 1. null
    // 2. empty - ""
    // 3. blank - "全部是空白" - 空白由Character.isWhitespace所定义。
    // ==========================================================================

    /**
     * 检查字符串是否为<code>null</code>或空字符串<code>""</code>。
     * <p/>
     * <pre>
     * StringUtil.isEmpty(null)      = true
     * StringUtil.isEmpty("")        = true
     * StringUtil.isEmpty(" ")       = false
     * StringUtil.isEmpty("bob")     = false
     * StringUtil.isEmpty("  bob  ") = false
     * </pre>
     *
     * @param str 要检查的字符串
     * @return 如果为空, 则返回<code>true</code>
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 检查字符串是否是空白：<code>null</code>、空字符串<code>""</code>或只有空白字符。
     * <p/>
     * <pre>
     * StringUtil.isBlank(null)      = true
     * StringUtil.isBlank("")        = true
     * StringUtil.isBlank(" ")       = true
     * StringUtil.isBlank("bob")     = false
     * StringUtil.isBlank("  bob  ") = false
     * </pre>
     *
     * @param str 要检查的字符串
     * @return 如果为空白, 则返回<code>true</code>
     */
    public static boolean isBlank(String str) {
        int length;

        if (str == null || (length = str.length()) == 0) {
            return true;
        }

        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // ==========================================================================
    // 默认值函数。
    //
    // 当字符串为empty或blank时，将字符串转换成指定的默认字符串。
    // 注：判断字符串为null时，可用更通用的ObjectUtil.defaultIfNull。
    // ==========================================================================

    /**
     * 如果字符串是<code>null</code>或空字符串<code>""</code>，则返回指定默认字符串，否则返回字符串本身。
     * <p/>
     * <pre>
     * StringUtil.defaultIfEmpty(null, "default")  = "default"
     * StringUtil.defaultIfEmpty("", "default")    = "default"
     * StringUtil.defaultIfEmpty("  ", "default")  = "  "
     * StringUtil.defaultIfEmpty("bat", "default") = "bat"
     * </pre>
     *
     * @param str        要转换的字符串
     * @param defaultStr 默认字符串
     * @return 字符串本身或指定的默认字符串
     */
    public static String defaultIfEmpty(String str, String defaultStr) {
        return str == null || str.length() == 0 ? defaultStr : str;
    }

    /**
     * 如果字符串是<code>null</code>或空字符串<code>""</code>，则返回指定默认字符串，否则返回字符串本身。
     * <p/>
     * <pre>
     * StringUtil.defaultIfBlank(null, "default")  = "default"
     * StringUtil.defaultIfBlank("", "default")    = "default"
     * StringUtil.defaultIfBlank("  ", "default")  = "default"
     * StringUtil.defaultIfBlank("bat", "default") = "bat"
     * </pre>
     *
     * @param str        要转换的字符串
     * @param defaultStr 默认字符串
     * @return 字符串本身或指定的默认字符串
     */
    public static String defaultIfBlank(String str, String defaultStr) {
        return isBlank(str) ? defaultStr : str;
    }


    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 补齐
     *
     * @param src
     * @return
     */
    public static String getLastNumber(long src) {
        Format LPADDING_FORMAT = new DecimalFormat("00");
        long mod = src % 100;
        return LPADDING_FORMAT.format(mod);
    }

    /**
     * 是否都由数字组成
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    /**
     * 拼接字符串
     *
     * @param args
     * @return
     */
    public static String concatString(Object... args) {
        if (args == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Object str : args) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean isInString(String dest, String... strings) {
        if (dest == null) {
            return false;
        }
        for (String str : strings) {
            if (dest.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String join(Collection<String> coll, String split) {
        if (coll.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (String s : coll) {
            if (isNotEmpty(s)) {
                sb.append(isFirst ? s : split + s);
                isFirst = false;
            }
        }
        return sb.toString();
    }

    public static String toCamel(String columnName) {
        String[] str = columnName.split("_");
        String field = null;
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                field = str[0];
            } else {
                field += toCaptial(str[i]);
            }
        }
        return field;
    }

    public static String toCaptial(String fieldName) {
        return fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }
    
    public static String joinForLong(Collection<Long> coll, String split) {
        if (coll.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (Long s : coll) {
            if (s!=null&&s>0) {
                sb.append(isFirst ? s : split + s);
                isFirst = false;
            }
        }
        return sb.toString();
    }
    
	public static Object getKeyHashLock(String key, Object[] lockArray) {
		int lockArrayIndex = Math.abs(key.hashCode()) % lockArray.length;
		return lockArray[lockArrayIndex];
	}
}
