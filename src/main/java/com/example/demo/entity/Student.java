package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Student name cannot be empty")
    @Size(min = 3, max = 50, message = "Student name must be between 3 and 50 characters")
    private String name;

    @NotBlank(message = "Department cannot be blank")
    private String dept;

    @Past(message = "Date of birth must be a past date")
    @NotNull(message = "Date of birth is mandatory")
    private LocalDate dob;

    @DecimalMin(value = "0.0", message = "CGPA must be equal or greater than 0.0")
    @DecimalMax(value = "10.0", message = "CGPA must be equal or less than 10.0")
    private float cgpa;

    public Student() {}

    public Student(Long id, String name, String dept, LocalDate dob, float cgpa) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.cgpa = cgpa;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public float getCgpa() { return cgpa; }
    public void setCgpa(float cgpa) { this.cgpa = cgpa; }
}
