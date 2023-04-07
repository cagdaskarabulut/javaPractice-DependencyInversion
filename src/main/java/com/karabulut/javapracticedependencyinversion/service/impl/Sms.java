package com.karabulut.javapracticedependencyinversion.service.impl;

import com.karabulut.javapracticedependencyinversion.service.MessageService;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

@Service
public class Sms implements MessageService {
    @Override
    public void sendMessage(){
        sendSms();
    }

    private void sendSms() {
        System.out.println("Sms gönderildi");
    }
}
