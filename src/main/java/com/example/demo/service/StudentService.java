package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentService {
    Student postStudent(Student st);
    List<Student> getAllStudents();
    Optional<Student>getById(Long id);
}
