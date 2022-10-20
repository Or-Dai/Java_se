package com.lyf.thread.referencetype;

import java.lang.ref.WeakReference;

/**
 * @Author: LiangYiFeng
 * @Description:弱引用
 * @Date: Create in 2022/9/7 17:30
 * @Modified By:
 */
public class WeakReference03 {

    public static void main(String[] args) {
        WeakReference<N> n = new WeakReference<>(new N());
        System.out.println(n.get());
        System.gc();
        System.out.println(n.get());


        ThreadLocal<N> tl = new ThreadLocal<>();
        tl.set(new N());
        tl.remove();

        /**
         1.set()源码分析
          public void set(T value) {
            Thread t = Thread.currentThread();
            ThreadLocalMap map = getMap(t);
            if (map != null)
                map.set(this, value);
            else
                createMap(t, value);=
    }

         map的key 是当前线程的ThreadLocal 对象，
         map的value 是放入的某对象。


         2. getMap()
           ThreadLocalMap getMap(Thread t) {
        return t.threadLocals;
    }

         3. ThreadLocal.ThreadLocalMap threadLocals = null;
         该threadLocals变量 是线程私有的一个存储 threadLocals的变量。

         4.        static class Entry extends WeakReference<ThreadLocal<?>> {
        Object value;
        Entry(ThreadLocal<?> k, Object v) {
            super(k);
            value = v;
        }
         key 是被一个虚引用指向的

    }

         */

    }
}

class N{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}

