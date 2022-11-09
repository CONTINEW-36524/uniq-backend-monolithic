package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.domain.Createsurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CreatesurveyRepository extends JpaRepository<Createsurvey, String> {

    @Query(value = "select * from cs where url= :url", nativeQuery = true)
    public List<Createsurvey> selectAllSQL(@Param(value = "url") String url);

    @Query(value = "select * from cs cs1 left join datalist datalist1 on cs1.surveyid=datalist1.surveyid left join contents ct1 on datalist.id=ct1.id", nativeQuery = true)
    public List<Createsurvey> findrespond(@Param(value = "url") String url);
}