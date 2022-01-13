package com.behavioral.chain;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/13 22:38
 */
public class HandlerB implements Handler{
    private Handler next;
    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerB 处理请求");
        request.setRequestMsg("[B]");
        if (next != null) {
            next.handle(request);
        }
    }
}
