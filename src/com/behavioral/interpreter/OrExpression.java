package com.behavioral.interpreter;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/21 21:09
 */
public class OrExpression implements Expression{
    Expression expr1;
    Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String condition) {
        return expr1.interpreter(condition)||expr2.interpreter(condition);
    }
}
