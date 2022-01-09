package com.structural.decoration;

/**
 * 加鸡蛋
 *
 * @author liushangqing
 * @date 2022/1/9 20:31
 */
public class EggDecorator extends BaseDecorator{
    public EggDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
