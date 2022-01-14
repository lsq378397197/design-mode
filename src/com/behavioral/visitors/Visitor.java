package com.behavioral.visitors;

/**
 * 访问者抽象类
 */
public interface Visitor {
    void visitA(ElementA elementA);

    void visitB(ElementB elementB);
}
