package com.lyf.basic.operationalcharacter;

/**
 * @Author: LiangYiFeng
 * @Description: 运算符面试常问
 * @Date: Create in 2022/9/30 9:55
 * @Modified By:
 */
public class T01OperationalChar {


    public static void main(String[] args) {
        // 1. 3*0.1 == 0.3 将会返回什么? true 还是 false?
        //      结果输出：false
        System.out.println(3*0.1 == 0.3);

        // 2. Math.round(11.5) 等于多少？Math.round(-11.5)等于多少 ?
        // out:12
        System.out.println(Math.round(11.5));
        // out：11
        System.out.println(Math.round(11.4));
        // out:-11
        System.out.println(Math.round(-11.5));


        // 3.float f=3.4;是否正确
        float f = 3.4f;
        double f2  = 3.4d;

        // 4. short s1 = 1; s1 = s1 + 1; ？
        //    short s1 = 1; s1 += 1?
        short s1 = 1;
        // s1 若不手动强制转换类型就编译报错
        // s1 = s1 + 1;
         s1 = (short) (s1 + 1);

        // 不会报错
        short s2 = 1;
        s2 += 1;

    }


}
