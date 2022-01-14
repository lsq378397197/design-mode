package com.behavioral.visitors;

/**
 * 被访问抽象角色类
 *
 * @author liushangqing
 * @date 2022/1/14 22:07
 */
public interface Element {
    void accept(Visitor visitor);

}
