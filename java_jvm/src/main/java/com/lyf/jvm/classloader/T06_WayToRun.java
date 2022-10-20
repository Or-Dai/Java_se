package com.lyf.jvm.classloader;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/10 11:53
 * @Modified By:
 */
public class T06_WayToRun {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            m();

        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            m();

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void m(){
        for (int i = 0; i < 1000000; i++) {
            long j =  i%3;

        }
    }


}
