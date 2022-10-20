package com.lyf.jvm.classloader;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/10 11:36
 * @Modified By:
 */
public class T05_LoadClassByHand {
    public static void main(String[] args) throws ClassNotFoundException {
        // 自定义加载类
        Class<?> aClass = T05_LoadClassByHand.class.getClassLoader().loadClass("com.lyf.jvm.classloader.T05_LoadClassByHand");
        System.out.println("aClass = " + aClass.getName());
    }
}
