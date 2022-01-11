package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/11 20:24
 */
public class Publisher implements Subject{
    private List<MessageObserver> observers = new ArrayList<>();
    @Override
    public void addObserver(MessageObserver messageObserver) {
        observers.add(messageObserver);
    }

    @Override
    public void removeObserver(MessageObserver messageObserver) {
        observers.remove(messageObserver);
    }

    @Override
    public void notifyUpdate(Message m) {
        observers.forEach(x->x.update(m));
    }
}
