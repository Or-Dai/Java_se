package com.lyf.thread.referencetype;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: LiangYiFeng
 * @Description:虚引用
 * @Date: Create in 2022/9/7 20:42
 * @Modified By:
 */
public class PhantomReference04 {

    private static final List<Object> LIST = new LinkedList<>();
    private static final ReferenceQueue<M> QUEUE= new ReferenceQueue<>();

    public static void main(String[] args) {
        PhantomReference<M> mPhantomReference = new PhantomReference<>(new M(), QUEUE);

        new Thread(() ->{
            while (true){
                LIST.add(new byte[1024* 1024]);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(mPhantomReference.get());
            }
        }).start();

        new Thread(()->{
            while (true){
                Reference<? extends M> poll  = QUEUE.poll();
                if (poll != null){
                    System.out.println("----虚引用对象被JVM回收了-----"+poll);
                }
            }
        }).start();
    }
}
