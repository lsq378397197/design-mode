package com.behavioral.observer;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/11 20:20
 */
public interface Subject {
    void addObserver(MessageObserver messageObserver);

    void removeObserver(MessageObserver messageObserver);

    void notifyUpdate(Message m);
}
