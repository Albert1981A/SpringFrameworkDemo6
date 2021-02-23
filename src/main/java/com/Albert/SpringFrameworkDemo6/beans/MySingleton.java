package com.Albert.SpringFrameworkDemo6.beans;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Data
@Lazy
public class MySingleton {

    private int x = (int)(Math.random() * 101);

    public MySingleton() {
        System.out.println("MySingleton - CTOR IN ACTION !");
    }

    @PostConstruct
    public void created(){
        System.out.println("MySingleton - Post Construct !");
    }

    @PreDestroy
    public void ended(){
        System.out.println("MySingleton - Before Destruction !");
    }
}
