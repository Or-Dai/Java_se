package com.lyf.jvm.runmemory;

/**
 * @Author: LiangYiFeng
 * @Description: Java程序中的堆和栈内存
 * @Date: Create in 2022/9/13 8:05
 * @Modified By:
 */
public class T01_Memory {

    public static void main(String[] args) {   // Line 1
        int i = 1;   // Line 2
        Object  obj = new Object();  // Line 3
        T01_Memory mem = new T01_Memory();  // Line 4
        mem.foo(obj);   // Line 5
    }

    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7
        System.out.println(str);
    } // Line 8

}
