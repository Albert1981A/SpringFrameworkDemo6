package com.Albert.SpringFrameworkDemo6.config;

import com.Albert.SpringFrameworkDemo6.beans.MyPrototype;
import com.Albert.SpringFrameworkDemo6.beans.MySingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
    @Bean
    @Lazy
    public MySingleton single6() {
        MySingleton single6 = new MySingleton();
        single6.setX(6);
        return single6;
    }

    @Bean
    @Scope("prototype")
    public MyPrototype proto6() {
        MyPrototype proto6 = new MyPrototype();
        proto6.setX(6);
        return proto6;
    }
}
