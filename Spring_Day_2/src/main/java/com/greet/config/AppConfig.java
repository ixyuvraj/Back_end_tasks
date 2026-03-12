package com.greet.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.greet")
public class AppConfig {

    @Bean
    public String appName(){
        return "spring core demo";
    }


}
