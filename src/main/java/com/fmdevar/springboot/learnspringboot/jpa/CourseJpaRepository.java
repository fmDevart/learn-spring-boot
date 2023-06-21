package com.fmdevar.springboot.learnspringboot.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext

    private EntityManager entityManager;

    public void insert(CourseEntity course){

        this.entityManager.merge(course);
    }

    public CourseEntity findById(long id){
        return entityManager.find(CourseEntity.class,id);
    }


    public void deleteById(long id){
        CourseEntity targetCourseEntity = entityManager.find(CourseEntity.class,id);
        entityManager.remove(targetCourseEntity);
    }


}
