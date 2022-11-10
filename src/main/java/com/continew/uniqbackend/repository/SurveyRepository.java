package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.Survey;
import com.continew.uniqbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
    //내가 최근에 만든 템플릿 = myuniq
    @Query(value = "select * from survey where writer = :user_id", nativeQuery = true)
    public List<Survey> findRecentSurvey(@Param(value = "user_id") int user_id);

    //내가 찜한 템플릿
    @Query(value = "select * from survey left join fav_survey on survey.id_survey = fav_survey.id_survey where fav_survey.user_code = :user_id", nativeQuery = true)
    public List<Survey> findFavSurvey(@Param(value = "user_id") int user_id);


}