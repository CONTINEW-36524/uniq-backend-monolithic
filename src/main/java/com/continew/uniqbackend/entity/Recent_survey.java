package com.continew.uniqbackend.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "recent_survey")
public class Recent_survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRecentSurvey", nullable = false)
    private Integer id;

    @Column(name = "user_code", nullable = false)
    private Integer user_code;

    @Column(name = "idSurvey", nullable = false)
    private Integer idSurvey;



}