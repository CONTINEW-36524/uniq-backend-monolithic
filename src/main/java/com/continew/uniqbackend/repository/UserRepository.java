package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();
}
