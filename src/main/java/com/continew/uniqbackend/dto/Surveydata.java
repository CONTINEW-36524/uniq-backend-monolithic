package com.continew.uniqbackend.dto;



import com.continew.uniqbackend.entity.Survey;
import com.continew.uniqbackend.entity.Question;
import lombok.Data;

import java.util.List;
@Data
public class Surveydata {

    String surveyid;

    public String getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(String surveyid) {
        this.surveyid = surveyid;
    }

    String maintitle;
    String subtitle;

    List<Question> questions;
    String url;

    String tag;

    String category;


    String like;

    String writer;



    public String getUrl() {return url;}

    public void setUrl(String url) {this.url = url;}

    public String getMaintitle() {return maintitle;}

    public void setMaintitle(String maintitle) {this.maintitle = maintitle;}

    public String getSubtitle() {return subtitle;}

    public void setSubtitle(String subtitle) {this.subtitle = subtitle;}

    public List<Question> getQuestion() {return questions;}

    public void setQuestion(List<Question> questions) {this.questions = questions;}

    public String getTag() {return tag;}

    public void setTag(String tag) {this.tag = tag;}

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category = category;}

    public String getLike() {return like;}

    public void setLike(String like) {this.like = like;}

    public String getWiter() {return writer;}

    public void setWriter(String writer) {this.writer = writer;}


    @Override
    public String toString() {
        return "Surveydata{" +
                "maintitle='" + maintitle + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", questions=" + questions + '\'' +
                ", tag="+tag+'\''+
                ", category="+category+'\''+
                ", writer="+writer+'\''+
                '}';
    }


    public Survey toEntity(){
        return new Survey (null,maintitle,subtitle, questions, tag, 0, null, url, category, writer);
    }


}
