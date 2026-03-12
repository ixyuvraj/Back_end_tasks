package com.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements InitializingBean, DisposableBean {

    public LifeCycleBean(){
        System.out.println(" 1. bean constructor called");
    }

    @PostConstruct
    public void postContructMethod(){
        System.out.println(" 2. the PostConstruct method is clled");
    }

    public void afterPropertiesSet(){
        System.out.println("3. initializing afterPropertiesSet");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("4. predestroy method is called ");
    }

    public void destroy(){
        System.out.println("5. disposable bean destroyed");
    }

}
