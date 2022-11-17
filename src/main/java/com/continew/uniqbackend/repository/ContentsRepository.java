package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.Contents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentsRepository extends JpaRepository<Contents, String> {
}