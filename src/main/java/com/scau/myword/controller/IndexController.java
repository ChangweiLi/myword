package com.scau.myword.controller;

import com.scau.myword.repository.UserRepository;
import com.scau.myword.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired(required = true)
    private UserRepository userRepository;

    @GetMapping("/index")
    public String getIndex(){
        return "hello world";
    }

    @GetMapping("/user")
    public Object getUsers(){
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }
}
