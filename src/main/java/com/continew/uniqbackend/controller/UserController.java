package com.continew.uniqbackend.controller;

import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.domain.User;
import com.continew.uniqbackend.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody

public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UniqBackendApplication.class);

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String user() {
        return "user";
    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        log.info("user");
        return userRepository.findAll();
    }
}