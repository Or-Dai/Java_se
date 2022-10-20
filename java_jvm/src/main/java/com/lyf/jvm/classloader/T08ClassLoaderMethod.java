package com.lyf.jvm.classloader;


/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/2 9:28
 * @Description:类加载的三种方式
 */
public class T08ClassLoaderMethod {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object o = new Object();

        Class cls = Class.forName("com.lyf.jvm.classloader.T08ClassLoaderMethod");
        Object instance = cls.newInstance();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class cla = classLoader.loadClass("com.lyf.jvm.classloader.T08ClassLoaderMethod");
        Object instance2 = cla.newInstance();



    }
}
