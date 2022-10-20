package com.lyf.basic.keyword04;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/6 8:46
 * @Description:
 */
public class T02Final2 {


    public static void main(String[] args)  {
            final MyClass2 myClass = new MyClass2();
            System.out.println(++myClass.i);

            // 这段代码可以顺利编译通过并且有输出结果，输出结果为1。这说明引用变量被final修饰之后，虽然不能再指向其他对象，但是它指向的对象的内容是可变的。
        }


}
class MyClass2 {
    public int i = 0;
}
