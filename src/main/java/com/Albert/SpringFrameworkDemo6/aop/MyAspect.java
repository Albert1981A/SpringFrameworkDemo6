package com.Albert.SpringFrameworkDemo6.aop;

import com.Albert.SpringFrameworkDemo6.services.SmsService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Autowired
    private SmsService smsService;

    // @Before() ==> Execute the notation before the method
    // @After("execution(public int getX() && within(com.Albert.SpringFrameworkDemo6.beans.MyPrototype)") ==> too long
    @After("@annotation(SendSMS)")
    public void sendSmsAdvice() {
        smsService.sendSMS("Kaboom!...");
    }
}
