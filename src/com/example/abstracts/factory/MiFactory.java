package com.example.abstracts.factory;

/**
 * 小米工厂
 *
 * @author liushangqing
 * @date 2022/1/5 21:44
 */
public class MiFactory extends AbstractFactory{
    @Override
    Laptop createLabtop() {
        return new MiLaptop().create();
    }

    @Override
    Mobile createMobile() {
        return new MiMobile().create();
    }
}
