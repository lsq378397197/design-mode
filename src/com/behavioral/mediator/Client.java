package com.behavioral.mediator;

/**
 * 中介者模式
 *
 * @author liushangqing
 * @date 2022/1/17 22:50
 */
public class Client {
    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoomImpl();
        User user1 = new ChatUser( "Spike","1",chatroom);
        User user2 = new ChatUser("Mia","2", chatroom);
        User user3 = new ChatUser("Max","3", chatroom);
        User user4 = new ChatUser("Mick","4", chatroom);
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);
        user1.send("Hello man", "2");
        user2.send("Hey", "1");
    }
}
