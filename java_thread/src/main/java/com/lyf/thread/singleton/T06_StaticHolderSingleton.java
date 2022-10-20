package com.lyf.thread.singleton;



/**
 * @Author: LiangYiFeng
 * @Description: 基于静态内部类的单例模式实现
 * @Date: Create in 2022/8/21 19:23
 * @Modified By: Modified in 2022/9/16 23:15
 */
public class T06_StaticHolderSingleton {

    private static class InstanceHolder{
        private final static T06_StaticHolderSingleton INSTANCE = new T06_StaticHolderSingleton();
    }

    private T06_StaticHolderSingleton(){

    }



    public static T06_StaticHolderSingleton getInstance(){
        return InstanceHolder.INSTANCE;
    }

    public static void main(String[] args){
        System.out.println(T06_StaticHolderSingleton.getInstance());
    }
}

