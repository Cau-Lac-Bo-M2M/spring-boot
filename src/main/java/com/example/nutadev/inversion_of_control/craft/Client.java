package com.example.nutadev.inversion_of_control.craft;

import com.example.nutadev.inversion_of_control.craft.MessageService;

public class Client {
    private final MessageService messageService;

    public Client(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
