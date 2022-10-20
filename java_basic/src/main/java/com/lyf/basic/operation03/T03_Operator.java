package com.lyf.basic.operation03;

/**
 * @Author: LiangYiFeng
 * @Description:隐式转换：++  和 += 运算符
 * @Date: Create in 2022/9/15 21:53
 * @Modified By:
 */
public class T03_Operator {

    public static void main(String[] args) {
        int i =5;
        long j =8;
//        i = i+j;  //编译不通过，即不会向下转型。报错：Incompatible types. Found: 'long', required: 'int'
        i = (int) (i+j); // 捷径：进行强制类型转换
        i += j;     //编译通过，会进行隐式转换

        System.out.println("i = " + i);     // i = 13
    }
}
