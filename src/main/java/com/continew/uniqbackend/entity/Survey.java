package com.continew.uniqbackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "survey")
public class Survey {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "category")
    private String category;

    @Column(name = "title")
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "tag")
    private String tag;

    @Column(name = "like_cnt")
    private String like;

    @Column(name = "create_time")
    private String timestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}