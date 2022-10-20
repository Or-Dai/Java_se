package com.lyf.basic.basicdatatype01;

/**
 * @Author: LiangYiFeng
 * @Description 包装类源码分析：自动装箱——valueOf
 * @Date: Create in 2022/9/15 9:52
 * @Modified By:
 */
public class T02_PackagingSource {

    public static void main(String[] args) {
        int a=3;        // 处于   -128-127
        int c=128;      // 超过缓存数组
        Integer b=a;    // Integer缓存数组大小：-128-127，如果int超过这个范围，则新建Integer，否则存入Integer缓存数组中
        Integer d=c;
        // 这段代码等同于：Integer b=Integer.valueOf ( a ) 。
        System.out.println(b);
        System.out.println(d);
    }
}
