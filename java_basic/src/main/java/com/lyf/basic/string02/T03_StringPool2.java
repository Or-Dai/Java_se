package com.lyf.basic.string02;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/15 14:25
 * @Modified By:
 */
public class T03_StringPool2 {

    public static void main(String[] args) {
        String s = new String("1");
        // new String("1")
        //  1)会在常量池创建一个字符串空间存储"1"
        //  2)会在堆中创建一个空间存储String，并初始化，s 指向 常量池 "1"
        // 这时 s 指向堆空间s , 堆空间s 指向 常量池 "1"
        s.intern();     //  intern()方法判断如果常量池已经有相同的字符串，则直接指向该字符串，没有则新建。
        String s2 = "1"; // 使用字面量创建一个String对象，会在常量池创建一个"1",但是因为前面已经创建了一个"1", 所以直接引用即可。 s2  指向 常量池"1"
        System.out.println(s == s2);    // false

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);   // true


        String s5 = new String("2") + new String("2");
        String s6 = "22";
        s5.intern();
        System.out.println(s5 == s6);  // false
    }
}
