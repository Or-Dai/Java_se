package com.lyf.jvm.objectlayout;

import org.openjdk.jol.vm.VM;

/**
 * @Author: LiangYiFeng
 * @Description:JVM基本信息
 * @Date: Create in 2022/9/12 11:12
 * @Modified By:
 */
public class T01_JOL {
    public static void main(String[] args) {
        System.out.println(VM.current().details());
    }
}
