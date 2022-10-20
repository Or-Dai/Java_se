package com.lyf.jvm.objectlayout;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/2 16:50
 * @Description:
 */
public class T04JolObject2 {

    // 4
    private Integer num  = 1;

    // 4
    private float  f = 0.f;

    // 8
    private double d = 0.d;

    // 4
    private int[] arr ={1,2,3};

    // 4
    private String str = "str";


    public static void main(String[] args) {


            // 对象头占8
            // 类型指针占4
            // 数组占4
            // 基本数据和引用：4+4+8+4 = 20
            // 对齐： 8+4+4+20 = 36, 不是8的倍数，需要添加4 字节(0-7) 填充
            // 共：40

        System.out.println(ClassLayout.parseInstance(new T04JolObject2()).toPrintable());
        }

}
