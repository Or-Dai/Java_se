package com.lyf.thread.threadcreate;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/1 8:37
 * @Description:
 * 线程创建有四种方式
 * 1. 继承Thread类: 重写run方法
 * 2. 实现Runnable
 * 3. 实现Callable 和Future
 * 4. 使用线程池Executor
 */
public class ThreadCreate extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run()方法正在执行");

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+ "线程启动....");
        ThreadCreate thread = new ThreadCreate();
        System.out.println(Thread.currentThread().getName()+ "创建Thread线程....");

        thread.start();
        thread.run();
        System.out.println(Thread.currentThread().getName()+ "调用thread.start方法....");
        System.out.println(Thread.currentThread().getName()+ "线程结束....");

    }
}
