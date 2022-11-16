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
public class Contents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMult", nullable = false)
    private String id;


    @Column(name = "subQuestion", nullable = false)
    private String con;


    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name="questionid", referencedColumnName="id_question",insertable=false, updatable=false)
    private Question question;
}