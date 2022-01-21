package com.behavioral.interpreter;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/21 21:07
 */
public class AndExpression implements Expression{
    Expression expr1;
    Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String condition) {
        return expr1.interpreter(condition) && expr2.interpreter(condition);
    }
}
