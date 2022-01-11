package com.behavioral.observer;

/**
 * 观察者模式
 *
 * @author liushangqing
 * @date 2022/1/10 22:16
 */
public class Client {
    public static void main(String[] args) {
        MessageObserver o1 = new SubscriberA();
        MessageObserver o2 = new SubscriberB();
        MessageObserver o3 = new SubscriberC();
        Subject subject = new Publisher();
        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.addObserver(o3);
        Message message = new Message("hello");
        subject.notifyUpdate(message);

    }
}
