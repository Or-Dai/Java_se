package com.lyf.thread.threadpool.threadpooldemo;

import java.util.Date;

/**
 * @Author: LiangYiFeng
 * @Description 这是一个简单的Runnable类，需要大约5秒钟来执行其任务。
 * @Date: Create in 2022/8/15 11:54
 * @Modified By:
 */
public class MyRunnable  implements Runnable{


    private  String command;

    public MyRunnable(String command) {
        this.command = command;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start.Time = " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + "End.Time = " + new Date());

    }

    private void processCommand() {
        try{
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "command='" + command + '\'' +
                '}';
    }
}
