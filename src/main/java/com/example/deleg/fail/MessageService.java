package com.example.deleg.fail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.experimental.Delegate;

@Service
public class MessageService {

    @Autowired
    @Delegate
    private MessageRepository messageRepository;

}
