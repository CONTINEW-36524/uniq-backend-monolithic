package com.continew.uniqbackend.dto;

import com.continew.uniqbackend.domain.Createsurvey;

import java.util.List;

public class Surveydata {

    String maintitle;
    String subtitle;
    List<Data> data;

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

    public Createsurvey toEntity(){
        return new Createsurvey(null,maintitle,subtitle,data.toString() );
    }


}
