package com.greet;


import org.springframework.stereotype.Service;

@Service //it is a spring manageb bean belongin to the service layer
public class GreetingService {
    public void greet(){
        System.out.println("helloo , this is spring core");
    }

}
