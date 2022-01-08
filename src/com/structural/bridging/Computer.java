package com.structural.bridging;

/**
 * 电脑实体（抽象实体）
 *
 * @author liushangqing
 * @date 2022/1/8 22:32
 */
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        this.brand.info();
    }
}
