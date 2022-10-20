package com.lyf.thread.falsesharing;

/**
 * @Author: LiangYiFeng
 * @Description 缓存行对齐
 * @Date: Create in 2022/9/7 8:05
 * @Modified By:
 */
public class CacheLingPadding2 {
    private static class Padding{
        public volatile long p1,p2,p3,p4,p5,p6,p7; // long:8*7  =56 个字节
    }

    private static class T extends Padding{
        public volatile long x =0L;     //占8字节, 总的：56+8 = 64个字节，其他数据不可能再同一个缓存行，
        // 一个缓存行只有占64个字节 X 是单独一行，Y也是单独一行
    }

    public static T[] arr = new T[2];

    static{
        arr[0] = new T();
        arr[1] = new T();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (long i = 0; i < 1000000; i++) {
                arr[0].x = i;

            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000000; i++) {
                arr[0].x = i;

            }
        });

        final long start = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println((System.nanoTime()-start)/100000);
    }
}
