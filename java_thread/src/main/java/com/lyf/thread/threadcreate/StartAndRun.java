package com.lyf.thread.threadcreate;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/1 9:05
 * @Description: Start方法和Run方法的区别
 */
public class StartAndRun extends Thread{



    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + "运行了run方法");
    }

    public static void main(String[] args) {
        StartAndRun thread = new StartAndRun();
        System.out.println(Thread.currentThread().getName() + "调用了thread.run()");

        thread.run();

        System.out.println(Thread.currentThread().getName() + "调用了thread.start()");
        thread.start();


    }
}
