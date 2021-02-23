package com.Albert.SpringFrameworkDemo6.services;

import org.springframework.stereotype.Service;

@Service
public class SmsService {
    public void sendSMS(String massage) {
        System.out.println("Spam... Spam... Spam... " + massage);
    }
}
