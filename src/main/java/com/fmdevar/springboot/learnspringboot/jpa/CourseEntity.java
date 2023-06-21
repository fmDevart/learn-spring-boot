package com.fmdevar.springboot.learnspringboot.jpa;

//import jakarta.persistence.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseEntity {

    @Id
    @GeneratedValue
    long id;

    String name;

    String author;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CourseEntity() {
    }


    public CourseEntity(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
