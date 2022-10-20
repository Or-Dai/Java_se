package com.lyf.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/17 12:30
 * @Modified By:
 */
public class ReadWriteLockDemo {

    private static int sequence = 1;

    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock readLock = rwLock.readLock();
    private final Lock writeLock = rwLock.writeLock();


    // 读线程执行方法
    public void reader(){
        readLock.lock(); //申请读锁
        try {
            //读取共享变量
            System.out.println(sequence);
        } finally {
            readLock.unlock();
        }
    }

    // 读线程执行方法
    public void writeLock(){
        writeLock.lock(); //申请读锁
        try {
            //读取共享变量
            sequence = 2;
            System.out.println(sequence);
        } finally {
            writeLock.unlock();
        }
    }

}
