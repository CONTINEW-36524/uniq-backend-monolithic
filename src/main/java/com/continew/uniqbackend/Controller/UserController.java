package com.continew.uniqbackend.Controller;

import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.entity.User;
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

    @GetMapping("/user")
    public List<User> getAllUser(){
        log.info("user");
        return userRepository.findAll();
    }
}