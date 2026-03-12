package com.springcore;

import com.springcore.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService service = context.getBean("userService", UserService.class);
        service.processUser();

        System.out.println("Spring container has started");

        context.getBean("lifeCycleBean");

        context.close();   // needed for @PreDestroy
    }

}