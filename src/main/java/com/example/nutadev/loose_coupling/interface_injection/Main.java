package com.example.nutadev.loose_coupling.interface_injection;

import com.example.nutadev.loose_coupling.EmailService;
import com.example.nutadev.loose_coupling.SMSService;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();

        Client client = new Client();
        client.setService(emailService);
        client.processMessage("You are testing interface injection");
    }
}
