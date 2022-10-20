package com.lyf.jvm.classobject;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/2 15:12
 * @Description::
 */
public class ClassInstanceSort2 {

    public static void main(String[] args) {
        new ClassTest();
    }
}
class SuperClass {
    // 父类静态构造代码块
    static {
        System.out.println("superClass static block");
    }

    // 父类构造函数
    public SuperClass() {
        System.out.println("SuperClass constructor");
    }

    // 父类构造代码块
    {
        System.out.println("superClass block");
    }

    // 父类静态变量
    private static SuperStaticVariable staticVariable = new SuperStaticVariable();

    // 父类实列变量
    private SuperVariable variable = new SuperVariable();

}

class SuperStaticVariable {
    public SuperStaticVariable() {
        System.out.println("SuperStaticVariable init");
    }
}

class SuperVariable {
    public SuperVariable() {
        System.out.println("SuperVariable init");
    }
}


class MyClassStaticVariable {
    public MyClassStaticVariable() {
        System.out.println("MyClassStaticVariable init");
    }
}

class MyClassVariable {
    public MyClassVariable() {
        System.out.println("MyClassVariable init");
    }
}
