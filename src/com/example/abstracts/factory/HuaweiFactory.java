package com.example.abstracts.factory;

/**
 * 华为工厂
 *
 * @author liushangqing
 * @date 2022/1/5 21:40
 */
public class HuaweiFactory extends AbstractFactory {
    @Override
    Laptop createLabtop() {
        return new HuaweiLaptop().create();
    }

    @Override
    Mobile createMobile() {
        return new HuaweiMobile().create();
    }
}
