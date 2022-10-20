package com.lyf.thread.bookcode;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/3/18 22:43
 * @Modified By:
 */
public class ThreadExample extends Thread{

    public static void main(String[] args) {

        //创建线程
        ThreadExample threadExample = new ThreadExample();

        //启动线程
        threadExample.start();


        //输出 当前线程  的线程名称
        System.out.printf("1.当前线程：%s.%n\n",Thread.currentThread().getName());

    }


    //在该方法中实现线程的任务

    public void run(){
        System.out.printf("2.我是ThreadExample线程:%s.%n\n",Thread.currentThread().getName());
    }



}
