package com.continew.uniqbackend.Controller;

import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.entity.User;
import com.continew.uniqbackend.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody

public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UniqBackendApplication.class);

    @Autowired
    UserRepository userRepository;

    @GetMapping("/api/kakao")
    public String kakaoLogin(String code) {
        // authorizedCode: 카카오 서버로부터 받은 인가 코드
        userService.kakaoLogin(code);

        return "redirect:/";
    }
}