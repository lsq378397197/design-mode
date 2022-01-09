package com.structural.decoration;

/**
 * 加生菜
 *
 * @author liushangqing
 * @date 2022/1/9 20:30
 */
public class LettuceDecorator extends BaseDecorator{
    public LettuceDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"+1片生菜";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
