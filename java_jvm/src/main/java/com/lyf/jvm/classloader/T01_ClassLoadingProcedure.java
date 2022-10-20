package com.lyf.jvm.classloader;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/10 9:33
 * @Modified By:
 */
public class T01_ClassLoadingProcedure {

    public static void main(String[] args) {
        System.out.println(T.count);

    }


}

class T{
//    public static int  count = 2; //0
//    public static T t = new T(); // null

    public static T t = new T(); // null
    public static int  count = 2; //0

    // private int m = 8;

    private T(){
        count ++;
        System.out.println("count = " + count);
    }
}
