package com.fmdevar.springboot.learnspringboot;

import com.fmdevar.springboot.learnspringboot.jpa.CourseEntity;
import com.fmdevar.springboot.learnspringboot.jpa.CourseH2repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;
//
//    @Autowired
//    private CourseJpaRepository jpaRepository;

    @Autowired

    private CourseH2repository coursRepository;

    @Override
    public void run(String... args) throws Exception {
//        courseJdbcRepository.insert( new Course(1,"Angularsss","Francesco") );
//        courseJdbcRepository.insert( new Course(2,"Javascritp","Francesco") );
//        courseJdbcRepository.insert( new Course(3,"React","Francesco") );


//        courseJdbcRepository.delete(2);

//        System.out.println(courseJdbcRepository.findById(3));
//
//        System.out.println("*** test jpa ****");
//
//        jpaRepository.insert( new CourseEntity("primo corso","francesco"));
//
//        jpaRepository.insert( new CourseEntity("secondo corso","francesco"));

        coursRepository.save(new CourseEntity("corso1","Frank nasone"));
        coursRepository.save(new CourseEntity("corso2","Frank nasone"));
        coursRepository.save(new CourseEntity("corso3","Frank nasone"));


        System.out.println("*****************************************");
        System.out.println( coursRepository.findByAuthor( "Frank nasone" ) );




    }
}
