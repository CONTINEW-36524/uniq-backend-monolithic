package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.domain.Createsurvey;
import com.continew.uniqbackend.domain.Datalist;
import com.continew.uniqbackend.dto.Data;
import com.continew.uniqbackend.dto.DataDTO;
import com.continew.uniqbackend.dto.DataDTOInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DatalistRepository extends JpaRepository<Datalist, String> {

    @Query(value = "select * from datalist datalist1 inner join contents ct1 on datalist1.Did=ct1.con_id", nativeQuery = true)
    public List<DataDTOInterface> findlist();

}