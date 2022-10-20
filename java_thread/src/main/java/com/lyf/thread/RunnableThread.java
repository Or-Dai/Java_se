package com.lyf.thread;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/3/13 17:25
 * @Modified By:
 */
public class RunnableThread implements Runnable {

    private String message;

    public RunnableThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        new Thread(new RunnableThread("Good!")).start(); //创建Thread实例，构造函数传入Runnable类的实例，调用start方法
        new Thread(new RunnableThread("Nice!")).start();
    }
}
