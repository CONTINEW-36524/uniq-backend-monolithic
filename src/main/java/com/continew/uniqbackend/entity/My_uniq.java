package com.continew.uniqbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "my_uniq")
public class My_uniq {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "user_id", nullable = false)
    private int user_id;

    @Column(name = "survey_id", nullable = false)
    private int survey_id;



}