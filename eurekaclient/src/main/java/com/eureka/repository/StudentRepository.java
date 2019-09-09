package com.eureka.repository;

import com.eureka.entity.Student;

import java.util.Collection;

/**
 * @author NNShadow
 * @date 2019/9/5 11:49
 */
public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void update(Student student);
    void deleteById(long id);
}
