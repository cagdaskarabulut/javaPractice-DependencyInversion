package com.karabulut.javapracticedependencyinversion.service.impl;

import com.karabulut.javapracticedependencyinversion.service.MessageService;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

@Service
public class Sms implements MessageService {
    @Override
    public String sendMessage(){
        return sendSms();
    }

    private String sendSms() {
        String result = "Sms gönderildi";
        System.out.println(result);
        return result;
    }
}
