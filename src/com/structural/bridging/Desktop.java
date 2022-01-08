package com.structural.bridging;

/**
 * 台式电脑
 *
 * @author liushangqing
 * @date 2022/1/8 22:34
 */
public class Desktop extends Computer{
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式电脑");
    }
}
