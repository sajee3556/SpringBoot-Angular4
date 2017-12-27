package com.sajee.demo.service;


import com.sajee.demo.dao.StudentDaoRepo;
import com.sajee.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212607214
 * @Date 10/31/2017
 */
@Service
public class StudentMapService {

    @Autowired
    private StudentDaoRepo studentDaoRepo;

    public List<Student> getStudents() {
        List<Student> products = new ArrayList<>();
        studentDaoRepo.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    public Student getById(Long id) {
        return studentDaoRepo.findOne(id);
    }

    public Student saveOrUpdate(Student student) {
        studentDaoRepo.save(student);
        return student;
    }

}
