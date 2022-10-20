package com.lyf.basic.operation03;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/15 21:42
 * @Modified By:
 */
public class Dog {


        String name;

        Dog(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        void setName(String name) {
            this.name = name;
        }

        String getObjectAddress() {
            return super.toString();
        }



}
