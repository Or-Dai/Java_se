package com.lyf.basic.object05;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/15 22:42
 * @Modified By:
 */
public class T01_ToStringExample {

    private int number;

    public T01_ToStringExample(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "T01_ToStringExample{" +
                "number=" + number +
                '}';
    }



    public static void main(String[] args) {
        T01_ToStringExample example = new T01_ToStringExample(123);
        System.out.println(example.toString());
        // 没有重写toString方法：ToStringExample@4554617c
        // 重写toString方法：T01_ToStringExample{number=123}

    }


}
