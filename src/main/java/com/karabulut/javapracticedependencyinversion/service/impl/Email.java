package com.karabulut.javapracticedependencyinversion.service.impl;

import com.karabulut.javapracticedependencyinversion.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class Email implements MessageService {
    @Override
    public String sendMessage() {
        return sendEmail();
    }

    private String sendEmail() {
        String result = "Mail gönderildi";
        System.out.println(result);
        return result;
    }
}
