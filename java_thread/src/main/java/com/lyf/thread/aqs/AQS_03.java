package com.lyf.thread.aqs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: LiangYiFeng
 * @Description: 可重入锁
 * @Date: Create in 2022/9/8 14:58
 * @Modified By:
 */
public class AQS_03 {

    // 共享资源
    public static  Integer count = 0;
    private static Lock lock = new ReentrantLock();  // 创建一个Lock接口实例


    // 操作
    public static  void incr(){
        try  {
            Thread.sleep(50);
            lock.lock(); // 加锁
            count++; //原子性，4个指令
            decr();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();  // 释放锁
        }
    }

    public static  void decr(){
        try  {
            Thread.sleep(50);
            lock.lock(); // 加锁
            count--; //原子性，4个指令
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();  // 释放锁
        }
    }

    public static void main(String[] args) throws InterruptedException {
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


