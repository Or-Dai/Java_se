package com.lyf.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/15 11:11
 * @Modified By:
 */
public class TestNewSingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName()+",i=="+temp);
                    try{
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

        }
    }
}
