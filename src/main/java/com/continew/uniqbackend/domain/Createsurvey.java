package com.continew.uniqbackend.domain;

import com.continew.uniqbackend.dto.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cs")
@NoArgsConstructor
public class Createsurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long surveyid;
    @Column(name = "maintitle", length = 45)
    private String maintitle;

    @Column(name = "subtitle", length = 45)
    private String subtitle;

    @Column(name = "datalist", length = 10000)
    private String datalist;



    public Createsurvey(Long surveyid, String maintitle, String subtitle, String datalist){
        this.surveyid=surveyid;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.datalist=datalist;
    }

    @Override
    public String toString() {
        return "Createsurvey{" +
                "surveyid=" + surveyid +
                ", maintitle='" + maintitle + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", datalist=" + datalist +
                '}';
    }
}