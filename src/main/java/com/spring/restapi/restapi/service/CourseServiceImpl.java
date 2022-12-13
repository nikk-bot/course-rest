package com.spring.restapi.restapi.service;

import com.spring.restapi.restapi.DAO.CourseDao;
import com.spring.restapi.restapi.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    public CourseDao courseDao;


    @Override
    public List<Courses> getCourses() {
        List<Courses> courses = new ArrayList<>();
        courseDao.findAll().forEach(courses::add);
        return courses;
    }

    @Override
    public  Courses getCourses(long courseId){
       Courses c = null;
        return  courseDao.getOne(courseId);

    }

    public Courses addCourse(Courses courses) {
        courseDao.save(courses);
        return courses;
    }

    public  Courses updateCourse(Courses courses){
        courseDao.save(courses);
        return courses;
    }

    public void deleteCourse(long parseLong){
     Courses entity = courseDao.getOne(parseLong);
     courseDao.delete(entity);
    }

}
