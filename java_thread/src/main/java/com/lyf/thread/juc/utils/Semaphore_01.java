package com.lyf.thread.juc.utils;


import java.util.concurrent.Semaphore;


/**
 * @Author: LiangYiFeng
 * @Description: Semaphore实例
 * @Date: Create in 2022/9/9 10:40
 * @Modified By:
 */
public class Semaphore_01 {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try{
                    semaphore.acquire(); //获取信号量
                    System.out.println("我是线程"+Thread.currentThread().getName());

                    try{
                        Thread.sleep(2000);
                        System.out.println("间隔----------------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }

            }).start();

        }


    }
}


