package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
    //최근 템플릿
    @Query(value = "select * from survey where id in :sur", nativeQuery = true)
    public List<Survey> selectSurvey(@Param(value = "sur") List<Integer> sur);


}