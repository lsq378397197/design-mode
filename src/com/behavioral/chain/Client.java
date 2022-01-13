package com.behavioral.chain;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/10 22:16
 */
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        handlerA.setNext(handlerB);
        handlerB.setNext(null);
        Request request = new Request("[init]");
        handlerA.handle(request);
    }
}
