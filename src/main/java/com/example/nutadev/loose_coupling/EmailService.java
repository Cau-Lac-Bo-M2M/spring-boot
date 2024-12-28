package com.example.nutadev.loose_coupling;

public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
