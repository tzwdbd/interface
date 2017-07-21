package com.oversea.task.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;


/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.util
 * @Description: 版本控制
 * @date 15/11/15 12:25
 */
public class Version {


    private Version() {}

    private static final String VERSION = getVersion(Version.class, "2.0.0");

    static {
        // 检查是否存在重复的jar包
        Version.checkDuplicate(Version.class);
    }

    public static String getVersion() {
        return VERSION;
    }

    public static String getMd5JarVersion(Class<?> cls) {
        String realPath = cls.getClassLoader().getResource("").getFile();
        System.out.println(realPath);
        File file = new File(realPath);
        try {
            return MD5Util.calMD5(file);
        } catch (Exception e) {
            return getVersion();
        }
    }

    public static void main(String[] args) {
//        System.out.println(getMd5JarVersion(com.oversea.task.CliMain.class));
    }

    public static String getVersion(Class<?> cls, String defaultVersion) {
        try {
            // 首先查找MANIFEST.MF规范中的版本号
            String version = cls.getPackage().getImplementationVersion();
            if (version == null || version.length() == 0) {
                version = cls.getPackage().getSpecificationVersion();
            }
            if (version == null || version.length() == 0) {
                // 如果规范中没有版本号，基于jar包名获取版本号
                CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                if (codeSource == null) {
//                    log.info("No codeSource for class " + cls.getName() + " when getVersion, use default version " + defaultVersion);
                } else {
                    String file = codeSource.getLocation().getFile();
                    if (file != null && file.length() > 0 && file.endsWith(".jar")) {
                        file = file.substring(0, file.length() - 4);
                        int i = file.lastIndexOf('/');
                        if (i >= 0) {
                            file = file.substring(i + 1);
                        }
                        i = file.indexOf("-");
                        if (i >= 0) {
                            file = file.substring(i + 1);
                        }
                        while (file.length() > 0 && !Character.isDigit(file.charAt(0))) {
                            i = file.indexOf("-");
                            if (i >= 0) {
                                file = file.substring(i + 1);
                            } else {
                                break;
                            }
                        }
                        version = file;
                    }
                }
            }
            // 返回版本号，如果为空返回缺省版本号
            return version == null || version.length() == 0 ? defaultVersion : version;
        } catch (Throwable e) { // 防御性容错
            // 忽略异常，返回缺省版本号
//            log.error("return default version, ignore exception " + e.getMessage(), e);
            return defaultVersion;
        }
    }

    public static void checkDuplicate(Class<?> cls, boolean failOnError) {
        checkDuplicate(cls.getName().replace('.', '/') + ".class", failOnError);
    }

    public static void checkDuplicate(Class<?> cls) {
        checkDuplicate(cls, false);
    }

    public static void checkDuplicate(String path, boolean failOnError) {
        try {
            // 在ClassPath搜文件
            Enumeration<URL> urls = Version.class.getClassLoader().getResources(path);
            Set<String> files = new HashSet<String>();
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                if (url != null) {
                    String file = url.getFile();
                    if (file != null && file.length() > 0) {
                        files.add(file);
                    }
                }
            }
            // 如果有多个，就表示重复
            if (files.size() > 1) {
                String error = "Duplicate class " + path + " in " + files.size() + " jar " + files;
                if (failOnError) {
                    throw new IllegalStateException(error);
                } else {
//                    log.error(error);
                }
            }
        } catch (Throwable e) {
//            log.error(e.getMessage(), e);
        }
    }

    public static String getProjectPath() {
        java.net.URL url = Version.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = null;
        try {
            filePath = java.net.URLDecoder.decode(url.getPath(),"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (filePath.endsWith(".jar"))
            filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
        java.io.File file = new java.io.File(filePath);
        filePath = file.getAbsolutePath();
        return filePath;
    }

    public static String getRealPath() {
        String realPath = Version.class.getClassLoader().getResource("").getFile();
        java.io.File file = new java.io.File(realPath);
        realPath = file.getAbsolutePath();
        try {
            realPath = java.net.URLDecoder.decode(realPath, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return realPath;
    }

    public static String getAppPath(Class<?> cls) {
        //检查用户传入的参数是否为空
        if (cls == null)
            throw new java.lang.IllegalArgumentException("param isn't null");

        ClassLoader loader = cls.getClassLoader();
        //获得类的全名，包括包名
        String clsName = cls.getName();
        //此处简单判定是否是Java基础类库，防止用户传入JDK内置的类库
        if (clsName.startsWith("java.") || clsName.startsWith("javax.")) {
            throw new java.lang.IllegalArgumentException("don't input system class！");
        }
        //将类的class文件全名改为路径形式
        String clsPath = clsName.replace(".", "/") + ".class";

        //调用ClassLoader的getResource方法，传入包含路径信息的类文件名
        java.net.URL url = loader.getResource(clsPath);
        //从URL对象中获取路径信息
        String realPath = url.getPath();
        //去掉路径信息中的协议名"file:"
        int pos = realPath.indexOf("file:");
        if (pos > -1) {
            realPath = realPath.substring(pos + 5);
        }
        //去掉路径信息最后包含类文件信息的部分，得到类所在的路径
        pos = realPath.indexOf(clsPath);
        realPath = realPath.substring(0, pos - 1);
        //如果类文件被打包到JAR等文件中时，去掉对应的JAR等打包文件名
        if (realPath.endsWith("!")) {
            realPath = realPath.substring(0, realPath.lastIndexOf("/"));
        }
        java.io.File file = new java.io.File(realPath);
        realPath = file.getAbsolutePath();

        try {
            realPath = java.net.URLDecoder.decode(realPath, "utf-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return realPath;
    }//getAppPath定义结束
}