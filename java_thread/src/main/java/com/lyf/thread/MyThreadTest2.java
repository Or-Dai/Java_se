package com.lyf.thread;

import static java.lang.Thread.sleep;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/3/12 18:48
 * @Modified By:
 */
public class MyThreadTest2  extends Thread{
    private String name;

    public MyThreadTest2(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    public static void main(String[] args) {
        MyThreadTest2 mTh1=new MyThreadTest2("A");
        MyThreadTest2 mTh2=new MyThreadTest2("B");
        mTh1.start();
        mTh2.start();

    }


}
