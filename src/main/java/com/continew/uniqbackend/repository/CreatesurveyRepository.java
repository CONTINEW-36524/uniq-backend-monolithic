package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.domain.Createsurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CreatesurveyRepository extends JpaRepository<Createsurvey, String> {

    @Query(value = "select * from cs where url= :url", nativeQuery = true)
    public List<Createsurvey> selectAllSQL(@Param(value = "url") String url);
}