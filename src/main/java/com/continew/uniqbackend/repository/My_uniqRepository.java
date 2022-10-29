package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.My_uniq;
import com.continew.uniqbackend.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface My_uniqRepository extends JpaRepository<My_uniq, Integer> {

    @Override
    List<My_uniq> findAll();

    @Query(value = "select survey_id from my_uniq where user_id= :user_id", nativeQuery = true)
    public List<Integer> selectSurId(@Param(value = "user_id") int user_id);



}