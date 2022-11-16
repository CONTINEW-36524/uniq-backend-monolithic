package com.continew.uniqbackend.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_question", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "type")
    private String type;



    @OneToMany(mappedBy = "question",  cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contents> content = new ArrayList<>();

    @ManyToOne(fetch =  FetchType.LAZY, optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="id_survey", referencedColumnName="id_survey",insertable=false, updatable=false)
    private Survey survey;

    @Builder
    public Question(String title, Survey survey) {


        this.title = title;
        this.survey=survey;


    }
}