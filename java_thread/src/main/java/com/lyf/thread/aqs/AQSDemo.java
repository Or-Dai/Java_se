package com.lyf.thread.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: LiangYiFeng
 * @Description:数据安全问题
 * @Date: Create in 2022/8/27 21:07
 * @Modified By:
 */


public class AQSDemo {

        // 共享资源
        public static  Integer count = 0;
        // 操作
        public static  void incr(){
            try  {
                Thread.sleep(50);
                count++; //原子性，4个指令
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            AtomicInteger atomicInteger = new AtomicInteger();
            CountDownLatch latch = new CountDownLatch(1000);
            for (int i = 0; i < 1000; i++) {
                new Thread(()->{
                    incr();
                    latch.countDown();
                }).start();
            }
            latch.await();
            System.out.println("count = " + count);
        }
}


