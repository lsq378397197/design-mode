package com.behavioral.chain;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/13 22:35
 */
public class HandlerA implements Handler{
    private Handler next;
    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerA 处理请求");
        request.setRequestMsg("[A]");
        if (next != null) {
            next.handle(request);
        }
    }
}
