package com.example.nutadev.inversion_of_control.craft;


public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
