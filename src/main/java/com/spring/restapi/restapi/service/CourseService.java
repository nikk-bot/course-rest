package com.spring.restapi.restapi.service;

import com.spring.restapi.restapi.entity.Courses;

import java.util.List;


public interface CourseService {

    public List<Courses> getCourses();

    public Courses getCourses(long courseId);

    public Courses addCourse(Courses courses);

    public Courses updateCourse(Courses courses);

    public void deleteCourse(long courses);
}
