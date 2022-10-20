package com.lyf.basic.oop;

import java.lang.reflect.Method;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/30 9:32
 * @Modified By:
 */
 class Parent {

    Parent(){
        System.out.println("调用父类的构造方法");
    }

    public static void staticParent(){
        System.out.println("调用父类的类方法");
    }

    public final void finalParent(){
        System.out.println("调用父类的final方法");
    }

    public void printParent(){
        System.out.println("调用父类的普通方法");
    }

}

class Child extends  Parent{
     public void printChild(){
         System.out.println("调用子类的普通方法");
     }


}

public class  Test2{

    public static void main(String[] args) throws Exception {
        // 获取子类
        Class cls = Class.forName("com.lyf.basic.oop.Child");

        // 得到父类
        Class superclass = cls.getSuperclass();

        // 得到父类非继承的所有方法
        Method[] declaredMethods = superclass.getDeclaredMethods();
        for (Method method : declaredMethods) {

            System.out.println();
            System.out.println("子类调用方法"+method.getName()+ "的调用结果：");
            method.invoke(new Child());
            
        }


    }
 }
