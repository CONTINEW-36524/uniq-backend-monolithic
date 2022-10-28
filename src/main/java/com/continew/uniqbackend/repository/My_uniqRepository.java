package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.My_recent;
import com.continew.uniqbackend.entity.My_uniq;
import com.continew.uniqbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface My_uniqRepository extends JpaRepository<My_uniq, Integer> {

    @Override
    List<My_uniq> findAll();

    @Query(value = "select * from my_uniq", nativeQuery = true)
    public List<My_uniq> selectSurId(int user_id);

}