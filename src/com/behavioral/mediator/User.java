package com.behavioral.mediator;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/17 22:52
 */
public abstract class User {
    private String name;
    private String id;
    private ChatRoom meditor;

    public User(String name, String id, ChatRoom meditor) {
        this.name = name;
        this.id = id;
        this.meditor = meditor;
    }

    public abstract void send(String msg, String userId);
    public abstract void receiveMessage(String msg);

    public ChatRoom getMeditor() {
        return meditor;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
