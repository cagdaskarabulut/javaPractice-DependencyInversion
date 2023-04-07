package com.karabulut.javapracticedependencyinversion.service.impl;

import com.karabulut.javapracticedependencyinversion.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class Email implements MessageService {
    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Mail gönderildi");
    }
}
