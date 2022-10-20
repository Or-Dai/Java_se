package com.lyf.thread.synchronize;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/6 22:45
 * @Modified By:
 */
public class Sync_Hotspot {

    static volatile  int i =0;
    public static void n(){
        i++;
    }
    public static synchronized void m(){}

    public static void main(String[] args){
        for (int j = 0; j <1000 ; j++) {
            m();
            n();
        }
    }
}
