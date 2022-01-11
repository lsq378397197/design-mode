package com.behavioral.strategy;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/11 19:10
 */
public class StrategyA implements Strategy{
    @Override
    public void operation() {
        System.out.println("执行策略A");
    }
}
