package com.lyf.basic.basicdatatype01;

/**
 * @Author: LiangYiFeng
 * @Description: 基本数据类型和对应的包装类
 * @Date: Create in 2022/9/15 9:17
 * @Modified By:
 */
public class T01_Packaging {


    public static void main(String[] args) {

        int i =1;
        Integer j =2;

        System.out.println("i = " + getType(i));
        System.out.println("j = " + getType(j));

    }

    /**
     * 对于简单类型变量，是无法直接获得变量类型的；//要想获取，必须自定义函数进行返回
     * 对于包装类型变量，是可以直接获得的，变量名称.getClass().getName();
     * @param o
     * @return
     */
    public static String getType(Object o){
        return o.getClass().toString();
    }




}
