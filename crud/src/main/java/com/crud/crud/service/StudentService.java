package com.crud.crud.service;

import java.util.List;

import com.crud.crud.entity.Student;

public interface StudentService {

    public String addStudent(Student student);

    public List<Student> findAll();

    public Student findStudent(int id);

    public void update(Student student, Integer id);

    public Student delete(int id);
}
