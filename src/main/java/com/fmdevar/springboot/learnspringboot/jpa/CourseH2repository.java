package com.fmdevar.springboot.learnspringboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseH2repository extends JpaRepository<CourseEntity,Long> {

    public List<CourseEntity> findByAuthor(String author);

}
