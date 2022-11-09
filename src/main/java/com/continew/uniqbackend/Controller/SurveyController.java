package com.continew.uniqbackend.Controller;
import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.dto.Surveydata;
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
@RequestMapping("/api")
public class SurveyController {

    private static final Logger log = LoggerFactory.getLogger(UniqBackendApplication.class);

    @Autowired
    private SurveyRepository surveyRepository;


    //최신 템플릿
    @GetMapping("/template/recent")
    public List<Survey> getRecent(){
        List<Survey> surveys = surveyRepository.findAll(Sort.by(Sort.Direction.DESC, "timestamp"));
        log.info(surveys.toString());
        return surveys;
    }

    //인기 템플릿
    @GetMapping("/template/popular")
    public List<Survey> getPopular(){
        List<Survey> surveys = surveyRepository.findAll(Sort.by(Sort.Direction.DESC, "like"));
        log.info(surveys.toString());

        return surveys;
    }

    @PostMapping("/create/survey")
    public String createSurvey (Surveydata data){
        // 1.DTO->Entity변환
        Survey survey = data.toEntity();
        log.info(survey.toString());
        System.out.println(data);

        // 2.Repository에 entity를 db로 저장하게 함
        Survey save = surveyRepository.save(survey);

        return "good";
    }
}
