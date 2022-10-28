package com.continew.uniqbackend.controller;

import com.continew.uniqbackend.dto.Surveydata;
import com.continew.uniqbackend.repository.CreatesurveyRepository;
import com.continew.uniqbackend.domain.Createsurvey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ResponseBody
@RequestMapping("/api")
public class Createsurvrycontroller {

	@Autowired
	private CreatesurveyRepository createsurveyRepository;
	
	 @PostMapping("/create/survey")
	    public void boardinsert( @RequestBody Surveydata data) {
		 System.out.println(data);

			 Createsurvey data2 = data.toEntity();
			 System.out.println(data2.toString());

			 Createsurvey saved = createsurveyRepository.save(data2);
			 System.out.println(saved.toString());
	 }
	    }

