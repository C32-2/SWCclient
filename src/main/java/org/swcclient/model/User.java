package org.swcclient.model;

import jdk.jfr.Unsigned;
import lombok.Getter;
import lombok.Setter;

public class User{
    @Getter @Setter
    private String username;

    @Getter @Setter
    private Long id;

    public User(String username, Long id){
        this.username = username;
        this.id = id;
    }
}
