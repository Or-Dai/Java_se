package com.lyf.thread.referencetype;

import java.lang.ref.SoftReference;

/**
 * @Author: LiangYiFeng
 * @Description: 软引用
 * @Date: Create in 2022/9/7 17:14
 * @Modified By:
 */
public class SoftReference02 {

    public static void main(String[] args) {
        // 1024 * 1024*10 =10m
        SoftReference<byte[]> m = new SoftReference<>(new byte[1024 * 1024*10]);

        // m = null;
        System.out.println(m.get());
        System.gc();
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m.get());

        // 在分配一个数组，heap将装不下，报OOM错。这时候系统会垃圾回收，先回收一次，如果不够，会把软引用干掉
        byte[] bytes = new byte[1024 * 1024 * 10];
        System.out.println(m.get());

        // 软引用非常适合缓存使用
    }
}
