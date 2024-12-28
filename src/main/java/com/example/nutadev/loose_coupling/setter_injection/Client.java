package com.example.nutadev.loose_coupling.setter_injection;

import com.example.nutadev.loose_coupling.MessageService;

public class Client {
    private MessageService messageService;

    public void setMessageService(MessageService msgServiceParam) {
        this.messageService = msgServiceParam;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
