package com.continew.uniqbackend.dto;


import java.util.List;

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
    List<Data> data;
    String url;

    String tag;

    String category;

    String timestamp;



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMaintitle() {
        return maintitle;
    }



    public void setMaintitle(String maintitle) {
        this.maintitle = maintitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Surveydata{" +
                "maintitle='" + maintitle + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", data=" + data +
                '}';
    }



}
