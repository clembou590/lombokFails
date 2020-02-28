package com.example.deleg.fail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public <S extends Message> S save(S entity) {
        return messageRepository.save(entity);
    }

}
