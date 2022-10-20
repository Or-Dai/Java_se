package com.lyf.basic.string02;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/10/6 9:00
 * @Description: String 类型的变量和常量做“+”运算时发生了什么？
 */
public class T04Cal {



    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//false



        final String str6 = "str";
        final String str7 = "ing";
// 下面两个表达式其实是等价的
        String c = "str" + "ing";// 常量池中的对象
        String d = str6 + str7; // 常量池中的对象
        System.out.println(c == d);// true


    }
}
