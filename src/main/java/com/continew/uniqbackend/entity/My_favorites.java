package com.continew.uniqbackend.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "fav_survey")
public class My_favorites {
    @Id
    @Column(name = "id_fav_survey", nullable = false)
    private Integer id;

    @Column(name = "user_code", nullable = false)
    private Integer uid;

    @Column(name = "id_survey", nullable = false)
    private Integer sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}