package com.behavioral.mediator;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/17 22:57
 */
public class ChatUser extends User{
    public ChatUser(String name, String id, ChatRoom meditor) {
        super(name, id, meditor);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName()+"::sending message:"+msg);
        this.getMeditor().sendMessage(msg,userId);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }
}
