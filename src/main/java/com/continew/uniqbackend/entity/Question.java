package com.continew.uniqbackend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_question", nullable = false)
    private Integer id;

    @Column(name = "content", nullable = false)
    private String content;


    @OneToMany(mappedBy = "question",  cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Content> contents = new ArrayList<>();

    @ManyToOne(fetch =  FetchType.LAZY, optional=false)
    @JoinColumn(name="idSurvey", referencedColumnName="id_survey",insertable=false, updatable=false)
    private Survey survey;
}