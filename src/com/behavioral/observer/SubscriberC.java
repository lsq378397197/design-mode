package com.behavioral.observer;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/11 20:23
 */
public class SubscriberC implements MessageObserver{
    @Override
    public void update(Message message) {
        System.out.println("C 收到了消息"+message.getMessage());
    }
}
