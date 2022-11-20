package com.continew.uniqbackend.Service;

import com.continew.uniqbackend.dto.OauthToken;
import com.continew.uniqbackend.dto.ResultDTO;
import com.continew.uniqbackend.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SurveyService {
    @Autowired
    ResultRepository resultRepository;

    //질문 : 답변
    public List<ResultDTO> getResult(int surid) {

        //join된 모든 리스트
        List<ResultDTO> result = resultRepository.getResultlist(surid);

        return result;
    }
}
