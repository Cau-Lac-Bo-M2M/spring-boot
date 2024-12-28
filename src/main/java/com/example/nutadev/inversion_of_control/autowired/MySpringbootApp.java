package com.example.nutadev.inversion_of_control.autowired;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringbootApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringbootApp.class, args);
        Client client = context.getBean(Client.class);
        client.processMessage("You are testing @Autowired");
    }
}
