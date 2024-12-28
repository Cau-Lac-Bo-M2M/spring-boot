package com.example.nutadev.inversion_of_control.component;

import com.example.nutadev.inversion_of_control.MessageService;
import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
