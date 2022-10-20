package com.lyf.jvm.classloader;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/10 16:31
 * @Modified By:
 */
public class T07_LazyLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        P p; // 不会被加载
        X x = new X(); // 因为X继承了父类，必须初始化父类，再初始化子类
        System.out.println(P.i);
        System.out.println(P.j);
        Class.forName("com.lyf.jvm.classloader.T07_LazyLoading$P");

    }

    public static class P{
        final static  int i = 8;
        static int j =9;
        static{
            System.out.println("P");
        }
    }

    public static class X extends P{
        static{
            System.out.println("X");
        }
    }
}
