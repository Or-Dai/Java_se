package com.lyf.thread.referencetype;

import java.io.IOException;

/**
 * @Author: LiangYiFeng
 * @Description: 强引用 == 正常引用
 * @Date: Create in 2022/9/7 17:11
 * @Modified By:
 */
public class NormalReference01 {

    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;
        System.gc(); // DisableExplicitGC

        System.in.read();
    }
}

class  M{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
