package com.behavioral.visitors;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/14 22:12
 */
public class VisitBehavior implements Visitor{
    private int stateForA = 0;

    public int getStateForA() {
        return stateForA;
    }

    public void setStateForA(int stateForA) {
        System.out.println();
        this.stateForA = stateForA;
    }

    @Override
    public void visitA(ElementA elementA) {
        int stateA = elementA.getState();
        stateA++;
        System.out.println("=== 当前A的state为："+stateA);
        elementA.setState(stateA);
    }

    @Override
    public void visitB(ElementB elementB) {
        int stateB=elementB.getState();
        stateB++;
        System.out.println("=== 当前B的state为："+stateB);
        elementB.setState(stateB);
    }
}
