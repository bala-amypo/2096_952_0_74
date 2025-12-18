package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.StudentService;
import com.example.demo.entity.Student;

@RestController
public class StudentController {

    @Autowired
    private StudentService stdser;

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student st) {
        return stdser.postStudent(st);
    }

    @GetMapping("/allstudents")
    public List<Student> getAllStudents() {
        return stdser.getAllStudents();
    }

    @GetMapping("/getById/{id}")
    public Optional<Student> getId(@PathVariable Long id) {
        return stdser.getById(id);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Student st) {
        return stdser.updateData(id, st);
    }
}
