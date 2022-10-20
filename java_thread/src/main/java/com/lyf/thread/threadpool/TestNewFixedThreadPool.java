package com.lyf.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/15 11:02
 * @Modified By:
 */
public class TestNewFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

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
