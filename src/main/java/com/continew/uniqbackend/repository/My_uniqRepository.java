package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.My_recent;
import com.continew.uniqbackend.entity.My_uniq;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface My_uniqRepository extends JpaRepository<My_uniq, Integer> {

    List<My_uniq> findByUid(Integer uid);

}