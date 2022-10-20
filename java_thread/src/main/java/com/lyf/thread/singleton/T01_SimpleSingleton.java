package com.lyf.thread.singleton;

/**
 * @Author: LiangYiFeng
 * @Description: 简单单例模式:线程
 * @Date: Create in 2022/9/16 22:44
 * @Modified By:
 */
public class T01_SimpleSingleton {

    //创建 SingleObject 的一个对象
    private static T01_SimpleSingleton instance = new T01_SimpleSingleton();

    //让构造函数为 private，这样该类就不会被实例化
    private T01_SimpleSingleton(){}

    public static T01_SimpleSingleton getInstance(){
        return instance;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(T01_SimpleSingleton.getInstance().hashCode());
            }).start();
        }
    }
}
