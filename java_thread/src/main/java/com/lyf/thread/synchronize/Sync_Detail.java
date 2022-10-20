package com.lyf.thread.synchronize;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.openjdk.jol.info.ClassLayout;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/6 15:50
 * @Modified By:
 */
public class Sync_Detail {
    public static void main(String[] args) {
        Object o = new Object();
        // 输出对象在内存中占用字节大小
//        System.out.println("占用字节数："+ObjectSizeCalculator.getObjectSize(o));
        // 输出对象在内存中的布局
//        o.hashCode();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
        /**
         16个字节：16*4=64位
         0x0000000000000001 (non-biasable; age: 0)
         0x000000000317f178 (thin lock: 0x000000000317f178
         317f178
                          78(0111 1111)

         0     4        (object header)                           01 00 00 00 (00000001 00000000 00000000 00000000) (1)
         4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)

         0     4        (object header)                           98 f4 ec 02 (10011000 11110100 11101100 00000010) (49083544)
         4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
         */


    }
}


