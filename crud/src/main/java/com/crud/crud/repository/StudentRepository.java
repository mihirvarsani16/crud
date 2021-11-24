package com.crud.crud.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.crud.crud.entity.Student;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public List<Student> students = new ArrayList<>();

    public List<Student> getAll() {
        return students;
    }

    public String addStudent(Student student) {
        students.add(student);
        return "successfully added";
    }

    public Student findOne(int id) {
        return students.stream().filter(e -> e.getEn() == id).findFirst().get();
    }

    public void update(Student student, Integer id) {

        students.stream().map(e -> {
            if (e.getEn() == id) {
                e.setName(student.getName());
                e.setStandard(student.getStandard());
            }
            return e;

        }).collect(Collectors.toList());
    }

    public Student delete(int id) {
        return students.remove(id - 1);
        // return students.stream().filter(e -> e.getEn() !=
        // id).collect(Collectors.toList());
    }

}
