package com.lyf.jvm.newobject;

/**
 * @Author: LiangYiFeng
 * @Description: 对象创建的过程：栈空间、方法区、堆空间是怎么存储的。
 * @Date: Create in 2022/9/12 10:13
 * @Modified By:
 */
public class T01_NewObject {
    public static void main(String[] args) { // Line 1
        int i=1; // Line 2
        Object obj = new Object(); // Line 3
        T01_NewObject mem = new T01_NewObject(); // Line 4
        mem.foo(obj); // Line 5
    } // Line 9

    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7
        System.out.println(str);
    } // Line 8



}
