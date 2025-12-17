package com.example.demo.entity;

import java.time.LocalDate;

public class Student{
    private Long id;
    private String name;
    private Strin dept;
    Private LocalDate dob;
    private float cgpa;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getdept(){
        return dept;
    }
    public void setName(String deptname){
        this.deptname=name;
    }
    
}