package com.behavioral.observer;

/**
 * 抽象类（观察者）
 *
 * @author liushangqing
 * @date 2022/1/11 20:16
 */
public interface MessageObserver {
    void update(Message message);
}
