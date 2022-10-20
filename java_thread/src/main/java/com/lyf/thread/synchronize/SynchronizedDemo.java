package com.lyf.thread.synchronize;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/8/16 10:12
 * @Modified By:
 */
public class SynchronizedDemo {
    public void method() {
        synchronized (this) {
            System.out.println("synchronized 代码块");
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        synchronizedDemo.method();
    }
}
