package com.lyf.basic.keyword04;

/**
 * @Author: LiangYiFeng
 * @Description:关键字：final
 * @Date: Create in 2022/9/15 22:06
 * @Modified By:
 */
public class T01_Final {
    public static void main(String[] args)  {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);

    }
}

class MyClass {
    /**
     * final作用保证成员变量不可变
     */
    public final double i = Math.random();

    /**
     * Static作用于成员变量表示只保存一份
     */
    public static double j = Math.random();
}
