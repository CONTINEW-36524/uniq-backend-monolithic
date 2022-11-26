package com.continew.uniqbackend.controller;

import com.continew.uniqbackend.entity.RespondE;
import com.continew.uniqbackend.dto.Respond;
import com.continew.uniqbackend.repository.RespondERepository;
import com.continew.uniqbackend.UniqBackendApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api")
public class RespondanswerController {

    private static final Logger log = LoggerFactory.getLogger(UniqBackendApplication.class);

    @Autowired
    private RespondERepository respondERepository;

    @PostMapping("/respond/answer")
    public void respondinsert( @RequestBody Respond data) {
        System.out.println(data);

        for(int i=0;i<data.getResponddata().size();i++) {
            RespondE data1 = data.toEntity(i);
            System.out.println(data1.toString());

            RespondE saved = respondERepository.save(data1);
            System.out.println(saved.toString());
        }
    }

    @GetMapping("/respond/read/answer")
    public List<RespondE> getPopular(){
        List<RespondE> responds = respondERepository.findAll();
        log.info(responds.toString());

        return responds;
    }
}
