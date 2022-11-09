package com.continew.uniqbackend.dto;

public class Responddata {
    private String id;
    private String answer;

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

    @Override
    public String toString() {
        return "Responddata{" +
                "id='" + id + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
