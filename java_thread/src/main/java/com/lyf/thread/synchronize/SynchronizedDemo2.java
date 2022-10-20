package com.lyf.thread.synchronize;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/16 10:12
 * @Modified By:
 */
public class SynchronizedDemo2 {
    private int i =0;
    public synchronized void add() {
        i++;
    }

    public static void main(String[] args) {
        SynchronizedDemo2 synchronizedDemo = new SynchronizedDemo2();
        synchronizedDemo.add();
    }
}
