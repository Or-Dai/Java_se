package com.lyf.thread.singleton;

/**
 * @Author: LiangYiFeng
 * @Description:5.DCL：Double Check Lock 双重校验锁——线程安全
 * @Date: Create in 2022/9/16 23:08
 * @Modified By:
 */
public class T05_DCLSingleton {

    private static  volatile T05_DCLSingleton instance;

    private T05_DCLSingleton(){}

    public static T05_DCLSingleton getInstance(){
        if (instance == null) {
            synchronized (T05_DCLSingleton.class){
                if (instance == null) {
                    try{
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new T05_DCLSingleton();
                }
            }
            
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(T05_DCLSingleton.getInstance().hashCode()); // 多线程环境下：HashCode都相同，保证线程安全
            }).start();

        }
    }
}
