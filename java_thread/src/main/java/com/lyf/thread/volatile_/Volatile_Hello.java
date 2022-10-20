package com.lyf.thread.volatile_;

import java.util.concurrent.TimeUnit;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/7 14:30
 * @Modified By:
 */
public class Volatile_Hello {

//     boolean running = true;
    volatile boolean running = true; // 对比一下有无volatile的情况下，整个程序运行结果的区别
    void m(){
        System.out.println("m start");
        while (running) {

        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        Volatile_Hello t = new Volatile_Hello();
        new Thread(t::m, "t1").start();

        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.running=false;
    }
}
