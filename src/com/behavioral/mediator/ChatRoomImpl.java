package com.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/17 23:00
 */
public class ChatRoomImpl implements ChatRoom{
    private Map<String, User> map = new HashMap<>();
    @Override
    public void sendMessage(String msg, String userId) {
        User user = map.get(userId);
        user.receiveMessage(msg);

    }

    @Override
    public void addUser(User user) {
        this.map.put(user.getId(), user);
    }
}
