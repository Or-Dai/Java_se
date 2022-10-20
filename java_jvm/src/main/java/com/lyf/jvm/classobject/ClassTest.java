package com.lyf.jvm.classobject;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/2 15:16
 * @Description:
 */
public class ClassTest extends SuperClass{
    // 子类静态变量
    static {
        System.out.println("myclass static");
    }

    // 子类静态变量
    private static MyClassStaticVariable staticVariable = new MyClassStaticVariable();

    // 子类构造函数
    public ClassTest() {
        System.out.println("myclass constructor");
    }

    // 子类构造代码块
    {
        System.out.println("myclass block");
    }
    // 子类实列变量
    private MyClassVariable variable = new MyClassVariable();
}
