package com.continew.uniqbackend.controller;

import com.continew.uniqbackend.domain.Contents;
import com.continew.uniqbackend.domain.Datalist;
import com.continew.uniqbackend.dto.Data;
import com.continew.uniqbackend.dto.DataDTO;
import com.continew.uniqbackend.dto.DataDTOInterface;
import com.continew.uniqbackend.dto.Surveydata;
import com.continew.uniqbackend.repository.ContentsRepository;
import com.continew.uniqbackend.repository.CreatesurveyRepository;
import com.continew.uniqbackend.domain.Createsurvey;
import com.continew.uniqbackend.repository.DatalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@ResponseBody
@RequestMapping("/api")
public class Createsurvrycontroller {

	@Autowired
	private CreatesurveyRepository createsurveyRepository;
	@Autowired
	private DatalistRepository datalistRepository;

	@Autowired
	private ContentsRepository contentsRepository;
	
	 @PostMapping("/create/survey")
	    public void boardinsert( @RequestBody Surveydata data) {
		 System.out.println(data);

			 Createsurvey data2 = data.toEntity();
			 System.out.println(data2.toString());

			 Createsurvey saved = createsurveyRepository.save(data2);
			 System.out.println(saved.toString());

		 for(int i=0;i<data.getData().size();i++){
			 Datalist data1= new Datalist(data.getData().get(i).getDid(),data.getData().get(i).getType(), data.getData().get(i).getTitle());
			 Datalist saved1 = datalistRepository.save(data1);

			 for(int k=0;k<data.getData().get(i).getContent().size();k++){
				 Contents data3= new Contents(null, data.getData().get(i).getContent().get(k).getCon());
				 Contents saved2 = contentsRepository.save(data3);
			 }
		 }
	 }

	@GetMapping("/respond/survey")
	public List<Contents> respondsurvey(@RequestParam String url) {
		return contentsRepository.findlist(url);
	}
	    }

