package com.continew.uniqbackend.dto;

public class Responddata {
    private String rid_question;
    private String answer;

    @Override
    public String toString() {
        return "Responddata{" +
                "rid_question='" + rid_question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String getRid_question() {
        return rid_question;
    }

    public void setRid_question(String rid_question) {
        this.rid_question = rid_question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
