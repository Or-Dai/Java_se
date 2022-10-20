package com.lyf.jvm.classloader;

/**
 * @Author: LiangYiFeng
 * @Description:类加载器范围
 * @Date: Create in 2022/9/10 11:26
 * @Modified By:
 */
public class T03_ClassLoaderScope {

    public static void main(String[] args) {
        String pathBoot = System.getProperty("sun.boot.class.path");
        System.out.println(pathBoot.replaceAll(";",System.lineSeparator()));

        System.out.println("----------------");
        String pathExt = System.getProperty("java.ext.dirs");
        System.out.println(pathExt.replaceAll(";",System.lineSeparator()));

        System.out.println("----------------");
        String pathApp = System.getProperty("java.class.path");
        System.out.println(pathApp.replaceAll(";",System.lineSeparator()));


    }
}
