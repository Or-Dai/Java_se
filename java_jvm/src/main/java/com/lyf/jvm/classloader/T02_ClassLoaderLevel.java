package com.lyf.jvm.classloader;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/10 9:35
 * @Modified By:
 */
public class T02_ClassLoaderLevel {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader()); // Bootstrap加载,是由C++实现的，Java中并没有具体的class返回，因此都是返回null
        System.out.println(sun.awt.HKSCS.class.getClassLoader());
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());//ExtClassLoader
        System.out.println(T02_ClassLoaderLevel.class.getClassLoader()); // AppClassLoader 加载自定义类

        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader());
        System.out.println(T02_ClassLoaderLevel.class.getClassLoader().getClass().getClassLoader());
    }
}
