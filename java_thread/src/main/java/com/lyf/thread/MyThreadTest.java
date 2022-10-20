package com.lyf.thread;

/**
 * @Author: LiangYiFeng
 * @Description ： 每次多线程的执行顺序都不一致。
 * @Date: Create in 2022/3/12 18:38
 * @Modified By:
 */
public class MyThreadTest extends Thread{

    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("Nice!");
        }
    }

    public static void main(String[] args) {
        MyThreadTest myThreadTest = new MyThreadTest();
        myThreadTest.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("Good!");
        }
    }

}
