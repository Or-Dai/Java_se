package com.lyf.thread.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: LiangYiFeng
 * @Description  使用显式锁实现循环递增序列号生成器
 * @Date: Create in 2022/8/17 11:22
 * @Modified By:
 */
public class LockDemo implements Runnable{


    private static int i=0;
    private final Lock lock = new ReentrantLock();  // 创建一个Lock接口实例

    public void run() {
        lock.lock();        // 申请锁
        try{
            for (int j = 0; j < 10000; j++) {
                    i++;
            }
        } finally {
            lock.unlock();  // 解锁
        }

    }

    public static void main(String[] args) throws InterruptedException {
        LockDemo lockDemo = new LockDemo();
        Thread thread1 = new Thread(lockDemo);
        Thread thread2 = new Thread(lockDemo);

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println(i);
    }
}
