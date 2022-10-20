package com.lyf.basic.basicdatatype01;

/**
 * @Author: LiangYiFeng
 * @Description 包装类源码分析：自动拆箱——intValue
 * @Date: Create in 2022/9/15 9:52
 * @Modified By:
 */
public class T02_PackagingSource2 {

    public static void main(String[] args) {
        Integer b = new Integer(3);
        // 1. Integer调用构造方法
        // 2. Integer调用intValue方法，返回一个常量value值
        int a = b;
        System.out.println(a);
    }
}
