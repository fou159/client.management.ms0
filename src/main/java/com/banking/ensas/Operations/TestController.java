package com.banking.ensas.Operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@CrossOrigin("*")
public class TestController {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @GetMapping("/triggernotif")
    public HttpStatus triggerNotif(){

        try {
            Operations op= new Operations("NOTIF"+ (new Random()).nextInt(),"NOTIF TEST");
            simpMessagingTemplate.convertAndSend("/topic/greetings",op);
            return HttpStatus.OK;
        } catch (MessagingException e) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

}
