package com.springcore.service;

import com.springcore.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void processUser(){
        userRepository.getUser();
        System.out.println("processing user");
    }
}
