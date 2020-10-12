package com.techdenovo.app.firstspringbootproject.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String firstName;

    public Student() {
    }

    public Student(Long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {

        this.id = id;
    }



    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }
}
