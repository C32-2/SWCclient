package org.swcclient.model;

import lombok.Getter;
import java.time.LocalDateTime;

public class Message{
    @Getter
    private User sender;

    @Getter
    private String content;

    @Getter
    private Long id;

    @Getter
    private LocalDateTime timestamp;

    public Message(User sender, String content){
        this.sender = sender;
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.id = this.sender.getId();
    }
}
