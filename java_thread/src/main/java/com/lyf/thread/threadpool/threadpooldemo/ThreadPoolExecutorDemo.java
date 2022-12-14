package com.lyf.thread.threadpool.threadpooldemo;

import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/15 11:54
 * @Modified By:
 */
public class ThreadPoolExecutorDemo {

    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;


    public static void main(String[] args) {
        // 使用阿里巴巴 推荐的创建线程池的方式

        // 通过ThreadPoolExecutor 构造函数自定义参数创建
        ThreadPoolExecutor executor =  new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 10; i++) {
            Runnable worker = new MyRunnable("" + i);
            executor.execute(worker);

        }

        // 终止线程池
        executor.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println("Finish all Threads");
    }
    

}
