package com.graphqlJava.service;

import com.graphqlJava.entity.Student;
import com.graphqlJava.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(long id) {
        return studentRepository.findById(id).get();
    }
}
