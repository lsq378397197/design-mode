package com.behavioral.strategy;

/**
 * 策略模式上下文
 *
 * @author liushangqing
 * @date 2022/1/11 19:09
 */
public class Context {

    public void request(Strategy strategy){
        strategy.operation();
    }
}
