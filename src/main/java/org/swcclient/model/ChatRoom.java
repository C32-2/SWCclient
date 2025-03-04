package org.swcclient.model;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom {
    protected final Long id;
    protected Set<Message> messages;

    public ChatRoom(Long id){
        this.id = id;
        messages = new HashSet<>();
    }

    public void addMessage(Message msg){
        messages.add(msg);
    }
}
