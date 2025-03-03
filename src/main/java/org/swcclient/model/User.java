package org.swcclient.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User{
    private String username;
    private Long id;

    public User(String username, Long id){
        this.username = username;
        this.id = id;
    }
}
