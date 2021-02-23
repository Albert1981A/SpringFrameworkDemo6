package com.Albert.SpringFrameworkDemo6.intercept;

import com.Albert.SpringFrameworkDemo6.beans.MyPrototype;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInterception implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyPrototype && beanName.equals("myPrototype")) {
            MyPrototype myPrototype = (MyPrototype) bean;
            int value = myPrototype.getX();
            if (value % 2 != 0) {
                System.out.println("Fund an odd number witch is: " + value);
                myPrototype.setX(value + 1);
                System.out.println("Intercepted and changed the number to: " + myPrototype.getX());
                return myPrototype;
            } else {
                System.out.println("Ok... not an odd number!");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
