package com.lyf.basic.string02;

/**
 * @Author: LiangYiFeng
 * @Description: StringPool 字符串常量池
 * @Date: Create in 2022/9/15 10:52
 * @Modified By:
 */
public class T01_StringPool {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");

        // false
        System.out.println(s1 == s2);
        String s3 = s1.intern();

        // intern 方法会从字符串常量池中查询当前字符串是否存在，若不存在就会将当前字符串放入常量池中
        String s4 = s2.intern();

        // true
        System.out.println(s3 == s4);

        String s5 = "bbb";
        String s6 = "bbb";

        // true
        System.out.println(s5 == s6);
    }
}
