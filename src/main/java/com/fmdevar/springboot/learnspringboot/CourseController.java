package com.fmdevar.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {


    @Autowired private CurrencyServiceConfiguration configuration;

    @RequestMapping("/courses")
    List<Course> retriveCourses(){

        List<Course> courses = Arrays.asList(
                new Course(1,"java","Francesco"),
                new Course(2,"Angular","Psssolo")
        );
        return courses;
    }

    @RequestMapping("/props")
    public CurrencyServiceConfiguration retriveConfig(){
        return configuration;
    }




}
