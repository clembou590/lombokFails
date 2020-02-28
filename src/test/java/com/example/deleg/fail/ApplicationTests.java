package com.example.deleg.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private MessageController partnerProductController;

    @Test
    void contextLoads() {
        Message save = this.partnerProductController.save(Message.builder().message("oi").build());
        System.out.println("this has been saved : " + save);
    }

}
