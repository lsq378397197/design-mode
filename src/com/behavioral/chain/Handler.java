package com.behavioral.chain;

/**
 * 责任链模式
 *
 * @author liushangqing
 * @date 2022/1/13 22:32
 */
public interface Handler {
    void setNext(Handler handler);

    void handle(Request request);
}
