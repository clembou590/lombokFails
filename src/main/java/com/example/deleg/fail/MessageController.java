package com.example.deleg.fail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    @Autowired
    MessageService messageService;

    public Message save(Message entity) {
        return messageService.save(entity);
    }

}
