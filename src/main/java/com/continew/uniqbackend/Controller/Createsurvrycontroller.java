package com.continew.uniqbackend.controller;

import com.continew.uniqbackend.dto.Surveydata;
import com.continew.uniqbackend.repository.CreatesurveyRepository;
import com.continew.uniqbackend.domain.Createsurvey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

	@GetMapping("/respond/survey")
	public List<Createsurvey> respondsurvey(@RequestParam String url) {
		return createsurveyRepository.selectAllSQL(url);
	}
	    }
