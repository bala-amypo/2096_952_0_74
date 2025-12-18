package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public Student postStudent(Student st) {
        return repo.save(st);
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Optional<Student> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public String updateData(Long id, Student st) {

        Optional<Student> existing = repo.findById(id);

        if (existing.isPresent()) {
            Student s = existing.get();
            s.setName(st.getName());
            s.setDept(st.getDept());
            s.setDob(st.getDob());
            s.setCgpa(st.getCgpa());
            repo.save(s);

            return "Updated Successfully";
        }

        return "Student Not Found";
    }
}
