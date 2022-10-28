package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
    //최근 템플릿

    //인기 템플릿


}