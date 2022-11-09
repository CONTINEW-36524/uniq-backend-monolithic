package com.continew.uniqbackend.dto;

import java.util.List;

public class DataDTO implements DataDTOInterface {

    String did;
    String type;
    String title;
    int conid;
    int survey_id;
    String con;
    String con_id;
    List<Content> content;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "did='" + did + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", conid=" + conid +
                ", survey_id=" + survey_id +
                ", con='" + con + '\'' +
                ", con_id='" + con_id + '\'' +
                '}';
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

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

    public int getConid() {
        return conid;
    }

    public void setConid(int conid) {
        this.conid = conid;
    }

    public Integer getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(int survey_id) {
        this.survey_id = survey_id;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public String getCon_id() {
        return con_id;
    }

    public void setCon_id(String con_id) {
        this.con_id = con_id;
    }
}
