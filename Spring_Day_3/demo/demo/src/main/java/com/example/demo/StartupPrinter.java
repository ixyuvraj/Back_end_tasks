package com.example.demo;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StartupPrinter {

    @Value("${app.name}")
    private  String appName;

    @PostConstruct
    public void print(){
        System.out.println("Applicationn name : "+appName);
    }
}
