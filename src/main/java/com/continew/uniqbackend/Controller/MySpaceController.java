package com.continew.uniqbackend.Controller;


import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.entity.My_uniq;
import com.continew.uniqbackend.entity.Myspace;
import com.continew.uniqbackend.repository.My_favoritesRepository;
import com.continew.uniqbackend.repository.My_recentRepository;
import com.continew.uniqbackend.repository.My_uniqRepository;
import com.continew.uniqbackend.repository.MyspaceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api/myspace")
public class MySpaceController {

    private static final Logger log = LoggerFactory.getLogger(UniqBackendApplication.class);

    @Autowired
    My_recentRepository MyRecentRepository;

    @Autowired
    My_uniqRepository MyuniqRepository;

    @Autowired
    My_favoritesRepository MyfavRepository;

    @GetMapping("/my-uniq")
    public List<My_uniq> getmyuniq(@RequestParam("user_id") int user_id){
        log.info(MyuniqRepository.findAll().toString());
                MyuniqRepository.selectSurId(user_id)
        return MyuniqRepository.selectSurId(user_id);
    }


}