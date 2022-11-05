package com.continew.uniqbackend.repository;

import com.continew.uniqbackend.domain.Createsurvey;
import com.continew.uniqbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // JPA findBy 규칙
    // select * from user_master where kakao_email = ?
    User findByKakaoEmail(String kakaoEmail);

    User findByUserCode(Long userCode);
}