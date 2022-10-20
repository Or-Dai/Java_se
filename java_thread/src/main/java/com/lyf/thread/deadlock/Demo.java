package com.lyf.thread.deadlock;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/1 22:51
 * @Description:
 */
public class Demo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();


    public static void main(String[] args) {
        new Thread(()->{
            synchronized (resource1){
                System.out.println("获取resource1");

                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("等待 resource2 ");
                synchronized (resource2){
                    System.out.println("获取resource2");
                }
            }
        }).start();


        new Thread(()->{
            synchronized (resource2){
                System.out.println("获取resource2");

                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("等待 resource1 ");
                synchronized (resource1){
                    System.out.println("获取resource1");
                }
            }
        }).start();
    }
}
