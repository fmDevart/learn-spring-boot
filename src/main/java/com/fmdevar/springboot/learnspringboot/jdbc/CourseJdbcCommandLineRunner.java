package com.fmdevar.springboot.learnspringboot.jdbc;

import com.fmdevar.springboot.learnspringboot.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;
    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert( new Course(1,"Angularsss","Francesco") );
        courseJdbcRepository.insert( new Course(2,"Javascritp","Francesco") );
        courseJdbcRepository.insert( new Course(3,"React","Francesco") );


//        courseJdbcRepository.delete(2);

        System.out.println(courseJdbcRepository.findById(3));

    }
}
