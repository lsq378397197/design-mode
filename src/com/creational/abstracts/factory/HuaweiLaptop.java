package com.creational.abstracts.factory;

/**
 * 华为笔记本电脑
 *
 * @author liushangqing
 * @date 2022/1/5 21:35
 */
public class HuaweiLaptop implements Laptop{
    @Override
    public Laptop create() {
        System.out.println("生产了华为笔记本电脑");
        return new HuaweiLaptop();
    }
}
