package com.Albert.SpringFrameworkDemo6.beans;

import com.Albert.SpringFrameworkDemo6.aop.SendSMS;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
@Data
public class MyPrototype {

    private int x = (int)(Math.random() * 101);

    public MyPrototype() {
        System.out.println("MyPrototype - CTOR IN ACTION !");
    }

    @SendSMS
    public int getX() {
        return x;
    }

    @PostConstruct
    public void created(){
        System.out.println("MyPrototype - Post Construct !");
    }

    @PreDestroy
    public void ended(){
        System.out.println("MyPrototype - Before Destruction !");
    }

}
