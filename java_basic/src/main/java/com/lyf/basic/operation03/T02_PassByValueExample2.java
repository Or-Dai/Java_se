package com.lyf.basic.operation03;

/**
 * @Author: LiangYiFeng
 * @Description:在方法中改变对象的字段值会改变原对象该字段值，因为引用的是同一个对象。
 * @Date: Create in 2022/9/15 21:42
 * @Modified By:
 */
public class T02_PassByValueExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog("A");
        func(dog);
        System.out.println(dog.getName());          // B

    }

    private static void func(Dog dog) { // dog是一个指针，存储的是对象的地址
        dog.setName("B");

    }
}
