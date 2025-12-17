package com.example.demo.service;
import org.springframework.beans.factory.anotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudenRespository;
public interface StudentService{
    @Autowired
    StudentRepository stdrepo;
    @Override
    
    Student poststudent(Student st);
    return 
}