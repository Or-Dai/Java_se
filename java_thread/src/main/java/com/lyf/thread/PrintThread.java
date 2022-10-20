package com.lyf.thread;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/3/13 17:18
 * @Modified By:
 */
public class PrintThread  extends Thread{

    private String message;

    public PrintThread(String message) {
        this.message = message;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();

    }
}
