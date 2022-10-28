package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.My_recent;
import com.continew.uniqbackend.entity.My_uniq;
import com.continew.uniqbackend.entity.Myspace;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyspaceRepository extends JpaRepository<Myspace, String> {



}