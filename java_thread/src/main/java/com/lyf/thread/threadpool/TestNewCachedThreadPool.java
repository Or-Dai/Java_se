package com.lyf.thread.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/15 10:55
 * @Modified By:
 */
public class TestNewCachedThreadPool {

    public static void main(String[] args) {
        // 创建无限大小的线程池，由jvm自动回收
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            executorService.execute(new Runnable() {
                public void run() {
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+",i=="+temp);
                }
            });
            
        }
    }
}
