package com.lyf.jvm.runmemory;

/**
 * @Author: LiangYiFeng
 * @Description: JVM是如何来确定局部变量表的大小呢？
 * @Date: Create in 2022/9/13 8:46
 * @Modified By:
 */
public class T03_StackLocalVariableTable {

    public static void main(String[] args) {

        {   //代码块1
            int a=100;
            System.out.println(a);
        }
        {   //2
            long b=200L;
            System.out.println(b);
        }
        {  //3
            int c=300;
            System.out.println(c);
        }
        double d = 3.f;
    }
}
