package com.Albert.SpringFrameworkDemo6;

import com.Albert.SpringFrameworkDemo6.beans.MyComposed;
import com.Albert.SpringFrameworkDemo6.beans.MyPrototype;
import com.Albert.SpringFrameworkDemo6.beans.MySingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication //==> @Configuration + @ComponentScan(basePackages = "com.Albert.SpringFrameworkDemo6")
@EnableAspectJAutoProxy
public class SpringFrameworkDemo6Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringFrameworkDemo6Application.class, args);
		System.out.println("IoC (Inversion of control) container was loaded");

		MySingleton s1 = ctx.getBean("mySingleton", MySingleton.class);
//		MySingleton s2 = ctx.getBean("single6", MySingleton.class);
//
		System.out.println(s1);
//		System.out.println(s2);
//
		MyPrototype p1 =ctx.getBean("myPrototype", MyPrototype.class);
//		MyPrototype p2 =ctx.getBean("proto6", MyPrototype.class);
//
		System.out.println(p1);
//		System.out.println(p2);
//
//		MyComposed c1 = ctx.getBean(MyComposed.class);
//		System.out.println(c1);

		System.out.println(p1.getX());
		System.out.println(p1.getX());
		System.out.println(p1.getX());

		//3:32
	}

}
