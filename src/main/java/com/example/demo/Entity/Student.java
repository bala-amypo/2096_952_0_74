package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name should not be empty")
    @Size(min = 3, max = 50, message = "Name must be between 3 to 50 characters")
    private String name;

    @NotBlank(message = "Department cannot be blank")
    private String dept;

    @Past(message = "Date of birth must be in the past")
    @NotNull(message = "Date of birth cannot be null")
    private LocalDate dob;

    @DecimalMin(value = "0.0", message = "CGPA must be at least 0.0")
    @DecimalMax(value = "10.0", message = "CGPA cannot exceed 10.0")
    private float cgpa;

    public Student() {
    }

    public Student(Long id, String name, String dept, LocalDate dob, float cgpa) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.cgpa = cgpa;
    }

    
}
