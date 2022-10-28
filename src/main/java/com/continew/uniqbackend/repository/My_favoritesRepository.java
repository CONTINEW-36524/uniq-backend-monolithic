package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.entity.My_favorites;
import com.continew.uniqbackend.entity.Myspace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface My_favoritesRepository extends JpaRepository<My_favorites, Integer> {
    //나의 uniq
    @Override
    List<My_favorites> findAll();

    List<My_favorites> findByUid(Integer uid);



    //uniq찜 목록


    //최근 uniq?

}