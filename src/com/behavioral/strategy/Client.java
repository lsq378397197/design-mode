package com.behavioral.strategy;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/10 22:16
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request(new StrategyA());
    }
}
