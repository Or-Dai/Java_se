package com.lyf.thread.bookcode;

import com.lyf.thread.RunnableThread;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/3/18 23:03
 * @Modified By:
 */
public class RunnableExample implements Runnable {

    public void run() {
        System.out.printf("2.RunnableExample:%s.%n\n",Thread.currentThread().getName());

    }


    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread thread = new Thread(new RunnableExample());
        //启动线程
        thread.start();
        thread.sleep(10000);
        System.out.println(thread.getState());

        System.out.printf("1.RunnableMain 主类  :%s.%n\n",Thread.currentThread().getName());

    }
}
