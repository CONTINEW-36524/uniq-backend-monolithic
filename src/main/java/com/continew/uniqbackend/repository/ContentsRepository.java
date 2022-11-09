package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.domain.Contents;
import com.continew.uniqbackend.domain.Datalist;
import com.continew.uniqbackend.dto.DataDTOInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentsRepository extends JpaRepository<Contents, Long> {

    @Query(value = "select * from contents ct1", nativeQuery = true)
    public List<Contents> findlist(@Param(value = "url") String url);
}