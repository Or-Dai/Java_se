package com.lyf.thread.bookcode;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/3/19 15:14
 * @Modified By:
 */
public class WaitNotifyExample  extends Thread{

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {

        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();
        waitNotifyExample.start();

        waitNotifyExample.after();
        waitNotifyExample.before();

        System.out.println(waitNotifyExample.getState());

    }
}
