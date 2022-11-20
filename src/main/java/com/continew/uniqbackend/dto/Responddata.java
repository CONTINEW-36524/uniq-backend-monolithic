package com.continew.uniqbackend.dto;

public class Responddata {
    private Long id;
    private String answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
