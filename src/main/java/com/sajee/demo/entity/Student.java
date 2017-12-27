package com.sajee.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 212607214
 * @Date 10/31/2017
 */
@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private String course;

    public Student(Long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
