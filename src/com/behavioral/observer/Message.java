package com.behavioral.observer;

/**
 * 消息类
 *
 * @author liushangqing
 * @date 2022/1/11 20:17
 */
public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
