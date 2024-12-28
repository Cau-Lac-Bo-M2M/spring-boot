package com.example.nutadev.inversion_of_control.dependency_injection;

import com.example.nutadev.inversion_of_control.MessageService;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
