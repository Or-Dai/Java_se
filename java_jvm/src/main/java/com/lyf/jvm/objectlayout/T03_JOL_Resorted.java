package com.lyf.jvm.objectlayout;

import org.openjdk.jol.info.ClassLayout;

/**
 * @Author: LiangYiFeng
 * @Description:对象内存重排序
 * @Date: Create in 2022/9/12 11:28
 * @Modified By:
 */
public class T03_JOL_Resorted extends Parent {

    private  byte aByte;
    private  boolean  b;
    private  char c;
    private  short s;
    private  float f;
    private  int i;
    private  long l;
    private  double d;
    private Boolean b2;
    private Object object;


    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setS(short s) {
        this.s = s;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setL(long l) {
        this.l = l;
    }

    public void setB2(Boolean b2) {
        this.b2 = b2;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        T03_JOL_Resorted jol = new T03_JOL_Resorted();
        jol.setL(128L);
        jol.setD(12.12D);
        jol.setI(11);
        jol.setF(3.3F);
        jol.setS((short) 55);
        jol.setC('c');
        jol.setB(true);
        jol.setaByte((byte)1);
        jol.setB2(false);
        jol.setObject(new Object());
        System.out.println(ClassLayout.parseInstance(jol).toPrintable());

        /**

         如果8个基本变量中定义为包装类型，则变成了引用变量
         以8byte为步长分配空间，mark word占用固定8字节， kalss pointer 占用4字节，共 12 字节。故开始需要对齐的4字节从int和float中选（哪个定义在前选哪个）
         其他成员变量的分配顺序是基本类型变量优先引用类型变量，基本类型优先级double>long>float/int>char>short>byte>boolean，将补齐字节数降到最低
         */
    }


}


class Parent{
    private String name;
    private int age;

}
