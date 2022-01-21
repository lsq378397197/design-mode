package com.behavioral.interpreter;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/21 21:06
 */
public class TerminalExpression implements Expression{
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String condition) {
        return condition.contains(data);
    }
}
