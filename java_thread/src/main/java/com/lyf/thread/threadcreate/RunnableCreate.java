package com.lyf.thread.threadcreate;

import com.lyf.thread.RunnableThread;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/1 8:43
 * @Description:
 */
public class RunnableCreate implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "run()方法执行中..");
    }

    public static void main(String[] args) {
        RunnableCreate runnableCreate = new RunnableCreate();
        Thread thread = new Thread(runnableCreate);
        thread.start();
        System.out.println(Thread.currentThread().getName() + "main()方法执行完成");
    }
}
