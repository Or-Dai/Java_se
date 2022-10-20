package com.lyf.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/6 10:23
 * @Modified By:
 */
public class CAS_ {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println("atomicInteger.get() = " + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,2022)+"\t 当前值为"+atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,2023)+"\t 当前值为"+atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(2022, 5) + "\t 当前值为" + atomicInteger.get());
    }
}
