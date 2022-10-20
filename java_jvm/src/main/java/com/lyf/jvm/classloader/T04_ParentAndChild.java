package com.lyf.jvm.classloader;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/10 11:22
 * @Modified By:
 */
public class T04_ParentAndChild {
    public static void main(String[] args) {
        System.out.println(T04_ParentAndChild.class.getClassLoader()); // 加载器：AppClassLoader
        System.out.println(T04_ParentAndChild.class.getClassLoader().getClass().getClassLoader()); //null
        System.out.println(T04_ParentAndChild.class.getClassLoader().getParent()); // 加载器：AppClassLoader的 父类加载器：ExtClassLoader
        System.out.println(T04_ParentAndChild.class.getClassLoader().getParent().getParent()); // null

    }
}
