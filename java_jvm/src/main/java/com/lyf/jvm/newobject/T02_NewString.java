package com.lyf.jvm.newobject;

/**
 * @Author: LiangYiFeng
 * @Description 对象创建的过程
 * @Date: Create in 2022/9/15 14:35
 * @Modified By:
 */
public class T02_NewString {
    public static void main(String[] args) {
        String sssss = new String();
        // Ljava/lang/String  L :表示是对象 +全限类名
        String abc ="abc";
        System.out.println(sssss==abc);
    }
}
