package com.lyf.thread.singleton;

/**
 * @Author: LiangYiFeng
 * @Description:2.懒汉式:线程安全
 * @Date: Create in 2022/9/16 22:55
 * @Modified By:
 */
public class T03_LazySingleton2 {

    private  static T03_LazySingleton2 instance;

    private T03_LazySingleton2 (){}

    /**
     * 创建并返回该类的唯一实例
     * 即只有该方法被调用时该类的唯一实例才会被创建
     * @return
     */
    public static T03_LazySingleton2 getInstance(){
        synchronized (T03_LazySingleton2.class){
            if (instance == null){
                try{
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new T03_LazySingleton2();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(T03_LazySingleton2.getInstance().hashCode()); // 多线程环境下：HashCode都相同，保证线程安全
            }).start();

        }
    }
}
