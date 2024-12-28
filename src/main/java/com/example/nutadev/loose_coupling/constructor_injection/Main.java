package com.example.nutadev.loose_coupling.constructor_injection;

import com.example.nutadev.loose_coupling.EmailService;
import com.example.nutadev.loose_coupling.SMSService;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();

//        Client client = new Client(emailService );
        Client client = new Client(smsService );

        client.processMessage("You are testing constructor injection");
    }
}
