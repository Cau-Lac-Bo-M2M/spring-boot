package com.example.nutadev.loose_coupling.interface_injection;

import com.example.nutadev.loose_coupling.MessageService;

public class Client implements InjectionMessage {
    private MessageService messageService;

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }

    @Override
    public void setService(MessageService messageService) {
        this.messageService = messageService;
    }
}
