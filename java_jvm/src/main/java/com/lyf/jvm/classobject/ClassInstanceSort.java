package com.lyf.jvm.classobject;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/2 14:56
 * @Description: 类的实例化顺序
 */
public class ClassInstanceSort {

    public static void main(String[] args) {
        new MyClass();

    }

}
class Person{
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}

class Test {
    Person person = new Person("Test");
    static{
        System.out.println("test static");
    }

    public Test() {
        System.out.println("test constructor");
    }


}

class MyClass extends Test {
    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }
}

/**
 test static
 myclass static
 person static
 person Test
 test constructor
 person MyClass
 myclass constructor
 */
