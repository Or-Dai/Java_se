package com.lyf.thread.threadcreate;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/1 8:45
 * @Description:
 */
public class CallableCreate implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "run()方法执行中..");
        return null;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new CallableCreate());
        Thread thread = new Thread(task);
        System.out.println(Thread.currentThread().getName() + "Thread.start..");
        thread.start();
        thread.start();
        System.out.println("返回结果" + task.get());
        System.out.println(Thread.currentThread().getName() + "main()方法执行完成");
    }
}
