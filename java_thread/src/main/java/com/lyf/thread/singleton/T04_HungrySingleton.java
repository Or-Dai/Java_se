package com.lyf.thread.singleton;

/**
 * @Author: LiangYiFeng
 * @Description: 4.饿汉式单例模式
 * @Date: Create in 2022/9/16 23:05
 * @Modified By:
 */
public class T04_HungrySingleton {
    private static T04_HungrySingleton instance = new T04_HungrySingleton();

    private T04_HungrySingleton (){}

    public static T04_HungrySingleton getInstance(){
        return  instance;
    }


}
