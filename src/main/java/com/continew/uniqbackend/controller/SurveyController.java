package com.continew.uniqbackend.controller;
import com.continew.uniqbackend.Service.SurveyService;
import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.dto.ResultDTO;
import com.continew.uniqbackend.dto.Surveydata;
import com.continew.uniqbackend.entity.Contents;
import com.continew.uniqbackend.entity.Question;
import com.continew.uniqbackend.entity.Survey;
import com.continew.uniqbackend.repository.ContentsRepository;
import com.continew.uniqbackend.repository.QuestionRepository;
import com.continew.uniqbackend.repository.ResultRepository;
import com.continew.uniqbackend.repository.SurveyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
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

    @Autowired
    private ContentsRepository contentsRepository;

    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private SurveyService surveyService;

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
        List<Survey> surveys = surveyRepository.findAll(Sort.by(Sort.Direction.DESC, "likenum"));
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
                maintitle(data123.getMaintitle()).
                subtitle(data123.getSubtitle()).build();

         // surveyRepository.save(data2);
    for(int i=0;i<data123.getData().size();i++) {
        Question question1 = Question.builder().
                title(data123.getData().get(i).getTitle())
                .survey(data2).build();
        data2.getQuestion().add(question1);
        questionRepository.save(question1);
    for(int k=0;k<data123.getData().get(i).getContentdata().size();k++)
        {
            System.out.println("111");
            Contents contents = Contents.builder().
                    con(data123.getData().get(i).getContentdata().get(k).getCon())
                    .question(question1).build();
//            question1.getContent().add(contents);
            contentsRepository.save(contents);
        }
    }
        return "good";
    }

    @GetMapping("/result")
    public List<ResultDTO> getResult(){
        // url로 설문지 찾고 surveyid 찾아오고 그걸로 question이랑 content groupby로 값 가져오기
        // questionid
        // union all select 결과 모두 합치기
        List<ResultDTO> result = surveyService.getResult(100);
        System.out.println(result);
        return result;
    }

}
