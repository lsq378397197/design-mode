package com.structural.bridging;

/**
 * 笔记本电脑
 *
 * @author liushangqing
 * @date 2022/1/8 22:35
 */
public class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本电脑");
    }
}
