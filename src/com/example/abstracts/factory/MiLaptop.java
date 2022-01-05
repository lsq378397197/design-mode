package com.example.abstracts.factory;

/**
 * 小米笔记本电脑
 *
 * @author liushangqing
 * @date 2022/1/5 21:36
 */
public class MiLaptop implements Laptop{
    @Override
    public Laptop create() {
        System.out.println("生产了小米电脑");
        return new MiLaptop();
    }
}
