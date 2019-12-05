package com.banking.ensas.Operations;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowedHeaders = "*")
public class NotifcationController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Operations greeting(Operations operations) throws Exception {
        Thread.sleep(1000); // simulated delay
        System.out.println("EXEC SOKECT");
        operations.setDescription(operations.getDescription()+"FROM NOTIFICATIONCONTROLLER");
        Thread.sleep(5000);
        return operations;
    }
}
