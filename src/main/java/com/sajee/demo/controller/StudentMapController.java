package com.sajee.demo.controller;


import com.sajee.demo.entity.Student;
import com.sajee.demo.service.StudentMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 212607214
 * @Date 10/31/2017
 */

@RestController
@RequestMapping("/students")
public class StudentMapController {
    @Autowired
    private StudentMapService studentMapService;

    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Student> getStudents() {
        return studentMapService.getStudents();
    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        return "index";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public Student getStudentById(@PathVariable("id") Long id) {
        return studentMapService.getById(id);
    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deleteStudentById(@PathVariable("id")int id) {
//        studentMapService.deleteStudentById(id);
//    }
//
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public void addStudent(@RequestBody Student student) {
        studentMapService.saveOrUpdate(student);
    }

//    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public void updateStudent(@RequestBody Student student) {
//        studentMapService.updateStudent(student);
//    }
}
