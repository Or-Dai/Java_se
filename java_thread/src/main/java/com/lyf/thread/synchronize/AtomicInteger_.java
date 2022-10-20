package com.lyf.thread.synchronize;

import org.openjdk.jol.info.ClassLayout;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Author: LiangYiFeng
 * @Description: 使用原子类保证线程安全
 * @Date: Create in 2022/9/6 20:10
 * @Modified By:
 */
public class AtomicInteger_ {

    /**
     * AtomicInteger：使用CAS实现
     */
    private static AtomicInteger m = new AtomicInteger(0); //轻量级锁 无锁 自旋锁


    public static void main(String[] args) throws Exception {
        Thread[] threads = new Thread[3];
        CountDownLatch latch = new CountDownLatch(threads.length);

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{

                for (int j = 0; j < 10000; j++) {
                    m.incrementAndGet(); //m++
                }
                System.out.println(ClassLayout.parseInstance(threads).toPrintable());


                latch.countDown();
            });

        }
        Arrays.stream(threads).forEach((t)->t.start());
        latch.await();
        System.out.println(m);
    }
}
