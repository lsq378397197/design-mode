package com.behavioral.observer;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/11 20:22
 */
public class SubscriberB implements MessageObserver{
    @Override
    public void update(Message message) {
        System.out.println("B 收到了消息"+message.getMessage());
    }
}
