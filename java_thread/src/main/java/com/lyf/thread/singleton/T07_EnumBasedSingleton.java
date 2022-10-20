package com.lyf.thread.singleton;

/**
 * @Author: LiangYiFeng
 * @Description: 基于枚举类型的单例模式实现
 * @Date: Create in 2022/8/21 19:28
 * @Modified By: Modified in 2022/9/16 23:17
 */
public class T07_EnumBasedSingleton {

    public static enum Singleton{
        INSTANCE;
        Singleton(){

        }
    }

    public static void main(String[] args){
        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println(Singleton.INSTANCE);
                System.out.println(Singleton.class.getName());
            };
        };
        t.start();
    }
}
