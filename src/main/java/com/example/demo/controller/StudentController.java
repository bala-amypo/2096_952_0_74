package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
@RestController
public class StudentController{
    @Autowired
    StudentService stdser;
 @PostMapping("/addstudent")
 public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
 }
}

