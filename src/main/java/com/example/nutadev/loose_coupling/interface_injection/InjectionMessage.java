package com.example.nutadev.loose_coupling.interface_injection;

import com.example.nutadev.loose_coupling.MessageService;

public interface InjectionMessage {
    void setService(MessageService messageService);
}
