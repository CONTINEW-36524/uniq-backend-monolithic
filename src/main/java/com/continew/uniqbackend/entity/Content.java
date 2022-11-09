package com.continew.uniqbackend.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "multipleChoice")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMult", nullable = false)
    private Integer id;

    @Column(name = "idQuestion", nullable = false)
    private Integer question_id;

    @Column(name = "subQuestion", nullable = false)
    private String content;


    @ManyToOne(fetch =  FetchType.LAZY)
    private Question question;
}