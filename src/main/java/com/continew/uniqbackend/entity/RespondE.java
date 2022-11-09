package com.continew.uniqbackend.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "respond")
public class RespondE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long respondid;
    @Column(name = "surveyid")
    private Long surveyid;


    public Long getRespondid() {
        return respondid;
    }

    public void setRespondid(Long respondid) {
        this.respondid = respondid;
    }

    public Long getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(Long surveyid) {
        this.surveyid = surveyid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Column(name = "id")
    private String  id;

    @Column(name = "answer")
    private String answer;


    @Override
    public String toString() {
        return "RespondE{" +
                "respondid=" + respondid +
                ", surveyid=" + surveyid +
                ", id='" + id + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public RespondE(Long respondid, Long surveyid, String id, String answer){
        this.surveyid=surveyid;
        this.respondid=respondid;
        this.id=id;
        this.answer=answer;
    }
}