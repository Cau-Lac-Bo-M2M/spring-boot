package com.example.nutadev.tight_coupling;

public class Client {
//    private EmailService emailService = new EmailService();
//
//    public void processMessage(String message) {
//        emailService.sendMessage(message);
//    }

//      Giả dụ: Không dùng EmailService nữa mà thay bằng SMSService
//      --> buộc phải thay đổi code phía Client

    private SMSService smsService = new SMSService();

    public void processMessage(String message) {
        smsService.sendMessage(message);
    }
}
