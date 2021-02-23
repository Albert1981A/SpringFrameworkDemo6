package com.Albert.SpringFrameworkDemo6.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Data
public class MyComposed {
    @Autowired
    // @Qualifier("myPrototype") ==> bad practice,we can do that but we should call the object by the required name
    private MyPrototype myPrototype;
    @Autowired
    // @Qualifier("proto6") ==> bad practice,we can do that but we should call the object by the required name
    private MyPrototype proto6;
    @Autowired
    // @Qualifier("mySingleton") ==> bad practice,we can do that but we should call the object by the required name
    private MySingleton mySingleton;
    @Autowired
    // @Qualifier("single6") ==> bad practice,we can do that but we should call the object by the required name
    private MySingleton single6;

    public MyComposed() {
        System.out.println("MyComposed - CTOR IN ACTION !");
    }
}
