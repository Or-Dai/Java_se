package com.lyf.basic.interface_;

/**
 * @Author: LiangYiFeng
 * @Description
 * @Date: Create in 2022/9/29 23:25
 * @Modified By:
 */
public interface Interface {


    // 1. 一个子类可以实现多个接口, 只能继承一个抽象类


    // 2. 接口可以定义类变量,但访问范围只能是 public final（默认值） ，抽象类可以定义任何访问范围的类变量

    // 3. 接口不能定义普通变量，抽象类可以任意定义

    // 4. 接口可以定义类方法，但是只能被本接口调用，不能被实现类调用，jdk1.9提供了private访问范围。
    //    抽象类可以定义任何访问范围的类方法
    // 5. 接口不能定义普通方法，抽象类随意
    // 6. 接口可以定义抽象方法，其实接口所有的方法都是默认public abstract 方法 抽象类随意
    // 7. 接口不能定义构造方法，因此不能实例化，抽象类可以定义，也可实例化。




}
