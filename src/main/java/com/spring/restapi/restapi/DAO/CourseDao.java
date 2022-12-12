package com.spring.restapi.restapi.DAO;

import com.spring.restapi.restapi.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Courses,Long> {

}
