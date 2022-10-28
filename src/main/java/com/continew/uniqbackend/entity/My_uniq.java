package com.continew.uniqbackend.entity;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "my_uniq")
public class My_uniq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer user_id;

    @Column(name = "survey_id", nullable = false)
    private Integer survey_id;


//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getUid() {
//        return user_id;
//    }
//
//    public void setUid(Integer id) {
//        this.user_id = user_id;
//    }
//
//    public Integer getSid() {
//        return survey_id;
//    }
//
//    public void setSid(Integer id) {
//        this.survey_id = survey_id;
//    }


}