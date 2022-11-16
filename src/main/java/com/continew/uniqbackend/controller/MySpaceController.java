package com.continew.uniqbackend.controller;


import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.entity.Recent_survey;
import com.continew.uniqbackend.entity.Survey;
import com.continew.uniqbackend.repository.*;
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
    private My_uniqRepository MyuniqRepository;

    @Autowired
    private My_favoritesRepository MyfavRepository;

    @Autowired
    private SurveyRepository surveyRepository;


    @GetMapping("/my-uniq")
    public List<Survey> getMySurvey(@RequestParam("user_id") int user_id){
        List<Survey> surveys = surveyRepository.findRecentSurvey(user_id);

        return surveys;
    }

    @GetMapping("/my-favorites")
    public List<Survey> getFav(@RequestParam("user_id") int user_id){
        List<Survey> surveys = surveyRepository.findFavSurvey(user_id);
        log.info(surveys.toString());

        return surveys;
    }
}