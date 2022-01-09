package com.structural.decoration;

/**
 * 装饰器抽象
 *
 * @author liushangqing
 * @date 2022/1/9 20:27
 */
public abstract class BaseDecorator implements Pancake{
    protected Pancake pancake;

    public BaseDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getMsg() {
        return this.pancake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.pancake.getPrice();
    }
}
