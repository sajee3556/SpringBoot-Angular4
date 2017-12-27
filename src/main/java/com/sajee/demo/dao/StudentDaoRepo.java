package com.sajee.demo.dao;


import com.sajee.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDaoRepo extends CrudRepository<Student, Long> {

}
