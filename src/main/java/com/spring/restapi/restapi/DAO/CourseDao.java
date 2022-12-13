package com.spring.restapi.restapi.DAO;

import com.spring.restapi.restapi.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Courses,Long> {

}
