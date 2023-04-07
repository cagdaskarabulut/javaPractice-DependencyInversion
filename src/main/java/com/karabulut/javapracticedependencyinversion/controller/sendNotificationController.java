package com.karabulut.javapracticedependencyinversion.controller;

import com.karabulut.javapracticedependencyinversion.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class sendNotificationController {

    private final List<MessageService> services;

    @RequestMapping("/")
    public String sendNotification(){
        for (MessageService service : services){
            service.sendMessage();
        }
        return "Gonderildi Mesaj1";
    }
}
