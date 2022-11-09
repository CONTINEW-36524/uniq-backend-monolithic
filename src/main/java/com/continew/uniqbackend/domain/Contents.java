package com.continew.uniqbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "contents")
public class Contents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long conid;
    @ManyToOne
    @JoinColumn(name="con_id", referencedColumnName = "Did")
    @JsonIgnore
    private Datalist Did;

    @Override
    public String toString() {
        return "Contents{" +
                "conid='" + conid + '\'' +
                ", id='" + Did + '\'' +
                ", con='" + con + '\'' +
                '}';
    }

    public Long getConid() {
        return conid;
    }

    public void setConid(Long conid) {
        this.conid = conid;
    }

    public Datalist getDid() {
        return Did;
    }

    public void setDid(Datalist did) {
        Did = did;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    @Column(name = "con")
    private String con;

    public Contents(Long conid, String con){
        this.conid=conid;
        this.con=con;
    }



}