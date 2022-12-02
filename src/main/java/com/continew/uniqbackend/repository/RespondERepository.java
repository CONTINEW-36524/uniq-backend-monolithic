package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.RespondE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.HashMap;
import java.util.List;

public interface RespondERepository extends JpaRepository<RespondE, Long> {
    @Query(value = "select * from respond", nativeQuery = true)
    public List<RespondE> selectRes();

    @Query(value = "select respond.answer.* from respond where surveyid = :surveyid", nativeQuery = true)
    public List<RespondE> selectData(@Param(value = "surveyid") int surveyid);
}