package org.swcclient;
import org.swcclient.model.*;

public class App {
    public static void main(String[] args){
        User user1 = new User("Iliya Safonov", Integer.toUnsignedLong(546364));
        User user2 = new User("Iliya Safronov", Integer.toUnsignedLong(554364));
        Message msg = new Message(user1, user2, "Привет, как дела?");

        System.out.println(msg.toString());
    }
}
