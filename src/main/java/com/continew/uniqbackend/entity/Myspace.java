package com.continew.uniqbackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "myspace")
public class Myspace {
    @Id
    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "my_uniq")
    private String my_uniq;

    @Column(name = "uniq_favorites")
    private String uniq_favorites;

    @Column(name = "uniq_recent")
    private String uniq_recent;


    public String getId() {
        return user_id;
    }

    public void setId(String id) {
        this.user_id = id;
    }

}