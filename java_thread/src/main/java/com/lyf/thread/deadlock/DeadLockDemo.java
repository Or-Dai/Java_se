package com.lyf.thread.deadlock;



/**
 * @Author: LiangYiFeng
 * @Description:死锁案例
 * @Date: Create in 2022/8/18 14:06
 * @Modified By:
 */
public class DeadLockDemo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (resource1){
                System.out.println(Thread.currentThread()+"Thread1: get resource1");
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"Thread1:  wait get resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread()+"Thread1: get resource2");
                }
            }
        },"线程 1").start();


        new Thread(()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread()+"Thread2:get resource2");
                try{
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"Thread2: waiting get resource1");

                synchronized (resource1){
                    System.out.println(Thread.currentThread()+"Thread2: get resource1");
                }
            }
        },"线程 2").start();
    }
}
