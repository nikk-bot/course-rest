package com.spring.restapi.restapi.service;

import com.spring.restapi.restapi.DAO.CourseDao;
import com.spring.restapi.restapi.entity.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    public CourseDao courseDao;
    //List<Courses> list;
    public CourseServiceImpl(){

//        list  = new ArrayList<>();
//        list.add(new Courses(12,"Java","java is hight level programming language" ));
//        list.add(new Courses(13,"Spring","spring freamwork"));
//        list.add(new Courses(14,"React","react is web development course"));
    }

    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public  Courses getCourses(long courseId){
       Courses c = null;
//       for(  Courses courses: list){
//           if (courses.getId() == courseId){
//               c=courses;
//               break;
//           }
//       }
        return  courseDao.getOne(courseId);

    }

    public Courses addCourse(Courses courses) {
       // list.add(courses);
        courseDao.save(courses);
        return courses;
    }

    public  Courses updateCourse(Courses courses){
//        list.forEach(e ->{
//            if (e.getId() == courses.getId()){
//                e.setTitle(courses.getTitle());
//                e.setDescription(courses.getDescription());
//            }
//
//        });
        courseDao.save(courses);
        return courses;
    }

    public void deleteCourse(long parseLong){
       // list= this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
     Courses entity = courseDao.getOne(parseLong);
     courseDao.delete(entity);
    }

}
