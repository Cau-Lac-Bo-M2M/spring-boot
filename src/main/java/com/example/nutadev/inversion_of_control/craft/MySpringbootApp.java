package com.example.nutadev.inversion_of_control.craft;

import com.example.nutadev.inversion_of_control.craft.EmailService;
import com.example.nutadev.inversion_of_control.craft.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringbootApp {
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApp.class, args);

        MessageService emailService = new EmailService();
        Client client = new Client(emailService);

        client.processMessage("You are testing Dependency Injection by hand");
    }
}
