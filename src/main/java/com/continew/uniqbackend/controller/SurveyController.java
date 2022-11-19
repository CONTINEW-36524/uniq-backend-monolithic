package com.continew.uniqbackend.controller;
import com.continew.uniqbackend.UniqBackendApplication;
import com.continew.uniqbackend.dto.DataDTOInterface;
import com.continew.uniqbackend.dto.Surveydata;
import com.continew.uniqbackend.dto.contentsDTO;
import com.continew.uniqbackend.entity.Contents;
import com.continew.uniqbackend.entity.Question;
import com.continew.uniqbackend.entity.Survey;
import com.continew.uniqbackend.repository.ContentsRepository;
import com.continew.uniqbackend.repository.QuestionRepository;
import com.continew.uniqbackend.repository.SurveyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
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
                maintitle(data123.getMaintitle()).
                subtitle(data123.getSubtitle()).build();

         // surveyRepository.save(data2);
    for(int i=0;i<data123.getData().size();i++) {
        Question question1 = Question.builder().
                title(data123.getData().get(i).getTitle())
                .survey(data2)
                .type(data123.getData().get(i).getType()).build();
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


       // System.out.println(surveyRepository.findtest());

        // 2.Repository에 entity를 db로 저장하게 함
//        Survey save = surveyRepository.save(survey);

        return "good";
    }

    @GetMapping("/create/respond")
    public HashMap<Long,List<DataDTOInterface>> getrespondpage(@RequestParam String url){
        List<DataDTOInterface> aa= surveyRepository.findbyurl(url);
        System.out.println(aa.get(0));
        HashMap<Long,List<DataDTOInterface>> respond = new HashMap<>();
        List<DataDTOInterface> contents =new ArrayList<>();
        long prev_qid=-1;
        for (DataDTOInterface dataDTOInterface : aa) {
            if (prev_qid == -1) {
                prev_qid = dataDTOInterface.getId_question();
                System.out.println(prev_qid);
                contents.add(dataDTOInterface);
            } else if (!(prev_qid==dataDTOInterface.getId_question())) {
                respond.put(prev_qid,contents );
                prev_qid=dataDTOInterface.getId_question();
                System.out.println(prev_qid);
                contents=new ArrayList<>();
                contents.add(dataDTOInterface);
            }
            else{
                contents.add(dataDTOInterface);
            }
        }
        respond.put(prev_qid,contents);
        System.out.println(respond);

        return respond;
    }


}
