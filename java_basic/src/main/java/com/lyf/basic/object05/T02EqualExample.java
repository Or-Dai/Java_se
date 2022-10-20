package com.lyf.basic.object05;

import java.util.Objects;

/**
 * @Author: Liang YiFeng
 * @Date: Created in 2022/9/30 15:24
 * @Description:
 */
public class T02EqualExample {


    private int x;
    private int y;
    private int z;

    public T02EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        T02EqualExample that = (T02EqualExample) o;
        return x == that.x &&
                y == that.y &&
                z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }


}
