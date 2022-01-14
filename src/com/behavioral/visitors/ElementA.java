package com.behavioral.visitors;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/14 22:09
 */
public class ElementA implements Element {
    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("开始访问元素A");
        visitor.visitA(this);
    }
}
