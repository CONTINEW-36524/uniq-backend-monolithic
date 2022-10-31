package com.continew.uniqbackend.Controller;
import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.entity.Survey;
import com.continew.uniqbackend.repository.SurveyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api/template")
public class SurveyController {

    private static final Logger log = LoggerFactory.getLogger(UniqBackendApplication.class);

    @Autowired
    private SurveyRepository surveyRepository;


    //최신 템플릿
    @GetMapping("/recent")
    public List<Survey> getRecent(){
        List<Survey> surveys = surveyRepository.findAll(Sort.by(Sort.Direction.DESC, "timestamp"));
        log.info(surveys.toString());
        return surveys;
    }

    //인기 템플릿
    @GetMapping("/popular")
    public List<Survey> getPopular(){
        List<Survey> surveys = surveyRepository.findAll(Sort.by(Sort.Direction.DESC, "like"));
        log.info(surveys.toString());

        return surveys;
    }
}
