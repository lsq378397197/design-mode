package com.behavioral.interpreter;

/**
 * 解释器模式
 *
 * @author liushangqing
 * @date 2022/1/19 22:37
 */
public class Client {
    public static void main(String[] args) {
        Expression person1 = new TerminalExpression("mick");
        Expression person2 = new TerminalExpression("mia");
        Expression isSingle = new OrExpression(person1, person2);
        Expression spike = new TerminalExpression("spike");
        Expression mock = new TerminalExpression("mock");
        Expression isCommitted = new AndExpression(spike, mock);
        System.out.println(isSingle.interpreter("mick"));
        System.out.println(isSingle.interpreter("mia"));
        System.out.println(isSingle.interpreter("max"));
        System.out.println(isCommitted.interpreter("mock, spike"));
        System.out.println(isCommitted.interpreter("Single, mock"));
    }
}
