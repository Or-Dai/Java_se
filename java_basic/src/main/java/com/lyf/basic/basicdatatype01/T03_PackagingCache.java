package com.lyf.basic.basicdatatype01;

/**
 * @Author: LiangYiFeng
 * @Description：缓存池
 * @Date: Create in 2022/9/15 10:39
 * @Modified By:
 */
public class T03_PackagingCache {
    public static void main(String[] args) {
        // 缓存池的范围：-128——127
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        // false
        System.out.println(x == y);
        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);
        // true
        System.out.println(z == k);

        // 超过127,返回新的Integer对象
        Integer a = Integer.valueOf(128);
        Integer b = Integer.valueOf(128);
        // false
        System.out.println(a == b);
        // true,没有重写equals方法，则比较内容. 重写，则内部使用 == 比较
        System.out.println(a.equals(b));
    }
}
