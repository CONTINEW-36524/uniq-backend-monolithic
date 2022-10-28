package com.continew.uniqbackend.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }
    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }
    public String getsubtitle() {
        return subtitle;
    }

    public void setsubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public String gettag() {
        return tag;
    }

    public void settag(String tag) {
        this.tag = tag;
    }
    public String getlike() {
        return like;
    }

    public void setlike(String like) {
        this.like = like;
    }
    public String gettimestamp() {
        return timestamp;
    }

    public void settimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}