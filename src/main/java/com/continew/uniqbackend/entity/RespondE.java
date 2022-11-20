package com.continew.uniqbackend.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@NoArgsConstructor
@Table(name = "respond")
public class RespondE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long respondid;
    @Column(name = "surveyid")
    private Long surveyid;

    @Column(name = "questionid")
    private Long  questionid;

    @Column(name = "answer")
    private String answer;

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

    public Long getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Long questionid) {
        this.questionid = questionid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }




    @Override
    public String toString() {
        return "RespondE{" +
                "respondid=" + respondid +
                ", surveyid=" + surveyid +
                ", questionid='" + questionid + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public RespondE(Long respondid, Long surveyid, Long questionid, String answer){
        this.surveyid=surveyid;
        this.respondid=respondid;
        this.questionid=questionid;
        this.answer=answer;
    }
}