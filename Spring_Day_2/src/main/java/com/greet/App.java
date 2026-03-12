package com.greet;

import com.greet.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingClient client = (GreetingClient) context.getBean(GreetingClient.class);

        client.sendGreeting();

        String name = context.getBean("appName", String.class);
        System.out.println(name);


    }
}
