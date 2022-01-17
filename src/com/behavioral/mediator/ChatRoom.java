package com.behavioral.mediator;

/**
 * 聊天室(中介者抽象类)
 *
 * @author liushangqing
 * @date 2022/1/17 22:51
 */
public interface ChatRoom {
    void sendMessage(String msg, String userId);

    void addUser(User user);
}
