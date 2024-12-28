package com.example.nutadev.inversion_of_control.component;

import com.example.nutadev.inversion_of_control.component.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringbootApp {
    public static void main(String[] args) {
        // đối tượng quản lý trong Spring container
        ApplicationContext context = SpringApplication.run(MySpringbootApp.class, args);

        // không cần khởi tạo = new
        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendMessage("You are testing @Component");
    }
}
