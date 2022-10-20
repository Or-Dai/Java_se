package com.lyf.thread.volatile_;

import org.openjdk.jol.info.ClassLayout;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/7 15:28
 * @Modified By:
 */
public class object_create {

    public static void main(String[] args) {
        T t = new T();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());

    }
}

class T{
    int m =8;
}
