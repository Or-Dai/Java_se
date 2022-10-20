package com.lyf.thread.synchronize;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

/**
 * @Author: LiangYiFeng
 * @Description: 修饰普通方法
 * @Date: Create in 2022/8/16 11:18
 * @Modified By:
 */
public class SyncTest implements Runnable {

     static int i = 0; //共享资源

    private synchronized void add() {
        i++;
    }



    public  void run() {

            for (int j =0 ; j<10000; j++){
                add();
            }


    }



    public static void main(String[] args) throws InterruptedException {
//        SyncTest syncTest = new SyncTest(); // new
//        Thread t1 = new Thread(syncTest);
//        Thread t2 = new Thread(syncTest);
        Thread t1 = new Thread(new SyncTest());
        Thread t2 = new Thread(new SyncTest());


        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println(i);

    }
}
