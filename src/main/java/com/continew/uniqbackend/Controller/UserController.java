package com.continew.uniqbackend.Controller;

import com.continew.uniqbackend.Service.UserService;
import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.entity.OauthToken;
import com.continew.uniqbackend.entity.User;
import com.continew.uniqbackend.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UniqBackendApplication.class);

    @Autowired
    private UserService userService; //(2)

    // 프론트에서 인가코드 받아오는 url
    @GetMapping("/kakao") // (3)
    @CrossOrigin(origins = "http://localhost:3000")
    public OauthToken getLogin(@RequestParam("code") String code) { //(4)
        log.info(code);
        // 넘어온 인가 코드를 통해 access_token 발급 //(5)
        OauthToken oauthToken = userService.getAccessToken(code);

//        //(1)
//        // 발급 받은 accessToken 으로 카카오 회원 정보 DB 저장
//        String User = userService.saveUser(oauthToken.getAccess_token());

        return oauthToken;

    }
}