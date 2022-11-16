package com.continew.uniqbackend.controller;
import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.dto.Surveydata;
import com.continew.uniqbackend.entity.Question;
import com.continew.uniqbackend.entity.Survey;
import com.continew.uniqbackend.repository.QuestionRepository;
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
    @Autowired
    private QuestionRepository questionRepository;


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
    public String postsurvey (@RequestBody Surveydata data123){
        // 1.DTO->Entity변환
//        Survey survey = data.toEntity();
//        log.info(survey.toString());
        System.out.println(data123);
        Survey data2= Survey.builder().
                title(data123.getMaintitle()).
                subtitle(data123.getSubtitle()).build();

         // surveyRepository.save(data2);

        Question question1 = Question.builder().
                title(data123.getData().get(0).getTitle())
                        .survey(data2).build();
        questionRepository.save(question1);
        data2.getQuestion().add(question1);

        System.out.println(surveyRepository.findtest().get(1).getQuestion().get(0).getTitle());

        // 2.Repository에 entity를 db로 저장하게 함
//        Survey save = surveyRepository.save(survey);

        return "good";
    }
}
