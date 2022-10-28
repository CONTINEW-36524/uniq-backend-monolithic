package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.My_favorites;
import com.continew.uniqbackend.entity.My_recent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface My_recentRepository extends JpaRepository<My_recent, Integer> {

    List<My_recent> findByUid(Integer uid);

}