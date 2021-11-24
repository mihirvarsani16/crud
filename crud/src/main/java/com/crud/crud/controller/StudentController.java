package com.crud.crud.controller;

import java.util.List;

import com.crud.crud.entity.Student;
import com.crud.crud.service.implement.StudentServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImp studentServiceImp;

    // add student
    @PostMapping("/")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {

        if (student == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } else {

            String student1 = studentServiceImp.addStudent(student);
            return ResponseEntity.status(HttpStatus.OK).body(student1.toString());
        }

    }

    // get all student
    @GetMapping("/all")
    public ResponseEntity<?> getAll() {

        List<Student> students = this.studentServiceImp.findAll();

        if (students.size() < 0) {

            return ResponseEntity.status(HttpStatus.OK).body("there is not student in data base");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(students);
        }

    }

    // get one student

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable int id) {
        Student student = this.studentServiceImp.findStudent(id);

        if (student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.FOUND).body(student);
        }
    }

    // update

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Student student, @PathVariable int id) {

        if (student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            this.studentServiceImp.update(student, id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        Student status = this.studentServiceImp.delete(id);

        if (status == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("successfully deleted");
        }
    }

}
