package org.swcclient.model;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class Message{
    private final User sender;
    private final User receiver;
    private final String content;
    private final LocalDateTime timestamp;

    private Message(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public Long getSenderID() {
        return sender.getId();
    }

    public String getSenderUsername() {
        return sender.getUsername();
    }

    public Long getReceiverID() {
        return receiver.getId();
    }

    public String getReceiverUsername() {
        return receiver.getUsername();
    }

    public static Message createMessage(User sender, User receiver, String content){
        return new Message(sender, receiver, content);
    }

    @Override
    public String toString(){
        return String.format(
                "content: %s\nsender id: %d\nsender username: %s\n" +
                        "receiver id: %d\nreceiver username: %s\ntimestamp: %s",
                content, getSenderID(), getSenderUsername(),
                getReceiverID(), getReceiverUsername(), timestamp
        );
    }
}