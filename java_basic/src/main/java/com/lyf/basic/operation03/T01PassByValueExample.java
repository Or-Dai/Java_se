package com.lyf.basic.operation03;

/**
 * @Author: LiangYiFeng
 * @Description:
    在其他方法中将指针引用了其它对象，那么此时主方法和其他方法的两个指针指向了不同的对象，
    结果：在一个指针改变其所指向对象的内容对另一个指针所指向的对象没有影响。
 * @Date: Create in 2022/9/15 21:37
 * @Modified By:
 */
public class T01PassByValueExample {

    public static void main(String[] args) {
        Dog dog = new Dog("A");

        // Dog@4554617c
        System.out.println(dog.getObjectAddress());
        func(dog);
        // Dog@4554617c
        System.out.println(dog.getObjectAddress());
        // A
        System.out.println(dog.getName());
    }


    private static void func(Dog dog) {
        // Dog@4554617c
        System.out.println(dog.getObjectAddress());
        dog = new Dog("B");
        // Dog@74a14482
        System.out.println(dog.getObjectAddress());
        // B
        System.out.println(dog.getName());
    }
}

