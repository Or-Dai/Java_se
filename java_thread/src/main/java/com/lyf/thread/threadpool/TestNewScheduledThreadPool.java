package com.lyf.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/15 11:06
 * @Modified By:
 */
public class TestNewScheduledThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(3);

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
            } );

        }
    }
}
