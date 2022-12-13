package com.spring.restapi.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
    @Id
    public long id;
    public String title;
    public String description;
    public String courseName;
    public  String chapterName;

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Courses(long id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Courses(){
        super();
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", courseName='" + courseName + '\'' +
                ", chapterName='" + chapterName + '\'' +
                '}';
    }
}
