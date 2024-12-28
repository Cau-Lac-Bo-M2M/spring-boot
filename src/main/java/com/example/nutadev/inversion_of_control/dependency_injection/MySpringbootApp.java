package com.example.nutadev.inversion_of_control.dependency_injection;

import com.example.nutadev.inversion_of_control.dependency_injection.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringbootApp {
    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(MySpringbootApp.class, args);
        Client client = context.getBean(Client.class);

        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendMessage("You are testing Dependency Injection with IoC");
    }
}
