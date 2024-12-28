package com.example.nutadev.inversion_of_control.dependency_injection;

import com.example.nutadev.inversion_of_control.MessageService;

public class Client {

    private MessageService messageService;

    public Client(MessageService msgServiceParam) {
        this.messageService = msgServiceParam;
    }

    public void processMessage(String message){
        messageService.sendMessage(message);
    }
}
