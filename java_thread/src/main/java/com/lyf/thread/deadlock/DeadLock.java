package com.lyf.thread.deadlock;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/9/30 23:16
 * @Description:
 */
public class DeadLock {
    public static Object resource1 = new Object();
    public static Object resource2 = new Object();


    public static void main(String[] args) {
        new Thread(()->{
            synchronized (resource1){
                System.out.println("get Resources 1:");
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait Resources 2");

                synchronized (resource2){
                    System.out.println("get resources 2");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (resource1){
                System.out.println("get Resources 2:");

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait Resources 1");
                synchronized (resource2){
                    System.out.println(" get  resource 1");
                }
            }
        }).start();
    }
}
