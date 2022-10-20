package com.lyf.thread.singleton;

/**
 * @Author: LiangYiFeng
 * @Description:2.懒汉式:线程不安全
 * @Date: Create in 2022/9/16 22:47
 * @Modified By:
 */
public class T02_LazySingleton {

    private static T02_LazySingleton instance;

    private T02_LazySingleton(){}


    public static T02_LazySingleton getInstance(){

        if (instance ==  null){
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance  = new T02_LazySingleton();
        }
        return  instance;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(T02_LazySingleton.getInstance().hashCode()); // 多线程环境下：HashCode各不相同
            }).start();

        }
    }
}
