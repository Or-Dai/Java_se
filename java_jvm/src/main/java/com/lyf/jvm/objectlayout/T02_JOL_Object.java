package com.lyf.jvm.objectlayout;

import org.openjdk.jol.info.ClassLayout;

/**
 * @Author: LiangYiFeng
 * @Description: JVM new object ，并打印内存布局
 * @Date: Create in 2022/9/12 11:20
 * @Modified By:
 */
public class T02_JOL_Object {

    public static void main(String[] args) {

        System.out.println(ClassLayout.parseInstance(new Object()).toPrintable());
    }
}
