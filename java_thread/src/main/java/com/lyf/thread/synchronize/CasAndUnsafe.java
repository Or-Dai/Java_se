package com.lyf.thread.synchronize;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: LiangYiFeng
 * @Description: 模拟线程不安全导致结果不一致
 * @Date: Create in 2022/9/6 20:04
 * @Modified By:
 */
public class CasAndUnsafe {

    private static  int m=0;

    public static void main(String[] args) throws Exception {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                for (int j = 0; j < 10000; j++) {
                    m++;

                }
                latch.countDown();
            });

        }
        Arrays.stream(threads).forEach((t)->t.start());
        latch.await();
        System.out.println(m);
    }
}
