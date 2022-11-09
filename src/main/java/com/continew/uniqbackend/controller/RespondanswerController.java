package com.continew.uniqbackend.controller;

import com.continew.uniqbackend.entity.RespondE;
import com.continew.uniqbackend.dto.Respond;
import com.continew.uniqbackend.repository.RespondERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/api")
public class RespondanswerController {

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
}
