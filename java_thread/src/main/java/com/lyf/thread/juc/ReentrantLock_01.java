package com.lyf.thread.juc;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/9 8:29
 * @Modified By:
 */
public class ReentrantLock_01 {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();

        CyclicBarrier cyclicBarrier = new CyclicBarrier(1);
    }
}
