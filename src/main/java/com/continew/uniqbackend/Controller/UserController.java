package com.continew.uniqbackend.Controller;

import com.continew.uniqbackend.model.OauthToken;
import com.continew.uniqbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController //(1)
@RequestMapping("/oauth")
public class UserController {

    @Autowired
    private UserService userService; //(2)

    // 프론트에서 인가코드 받아오는 url
    @GetMapping("/callback/kakao") // (3)
    public OauthToken getLogin(@RequestParam("code") String code) { //(4)
        System.out.println(code);
        // 넘어온 인가 코드를 통해 access_token 발급 //(5)
        OauthToken oauthToken = userService.getAccessToken(code);

        return oauthToken;
    }

}