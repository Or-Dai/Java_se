package com.lyf.thread.falsesharing;

/**
 * @Author: LiangYiFeng
 * @Description 缓存行没有对齐
 * @Date: Create in 2022/9/6 23:19
 * @Modified By:
 */
public class CacheLinePadding {
    private static class T{
        public volatile long x = 0L;
    }

    public static T[] arr = new T[2];

    static{
        arr[0] = new T();
        arr[1] = new T();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000000; i++) {
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
