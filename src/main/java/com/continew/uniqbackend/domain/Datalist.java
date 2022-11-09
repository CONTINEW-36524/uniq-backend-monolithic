package com.continew.uniqbackend.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "datalist")
public class Datalist {
    @Id
    @Column(name = "Did", nullable = false)
    private String Did;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name="surveyid", insertable = false, updatable = false)
    private Createsurvey surveyid;



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Createsurvey getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Createsurvey surveyid) {
        this.surveyid = surveyid;
    }

    public String getDId() {
        return Did;
    }

    public void setDId(String id) {
        this.Did = id;
    }

    @Override
    public String toString() {
        return "Datalist{" +
                "id='" + Did + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", surveyid=" +surveyid  +
                '}';
    }

    public Datalist( String Did, String type, String title){
        this.Did=Did;
        this.type=type;
        this.title=title;
    }
}