package com.spring.restapi.restapi.controller;

import com.spring.restapi.restapi.entity.Courses;
import com.spring.restapi.restapi.service.CourseService;
import com.spring.restapi.restapi.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CourseController {
    @Autowired
 public CourseServiceImpl courseService;

    @GetMapping("/courses")
    public List<Courses> getCourses(){
         return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourses(@PathVariable String courseId) {
        return  this.courseService.getCourses(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses){

        return  this.courseService.addCourse(courses);
    }

    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses courses){

        return  this.courseService.updateCourse(courses);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse( @PathVariable String courseId){

       try{
           this.courseService.deleteCourse(Long.parseLong(courseId));
           return new ResponseEntity<>(HttpStatus.OK);
       }catch(Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
