package com.crud.crud.service.implement;

import java.util.List;
import com.crud.crud.entity.Student;
import com.crud.crud.repository.StudentRepository;
import com.crud.crud.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    // private static List<Student> list = new ArrayList<>();

    // static {
    // list.add(new Student(1, "mihir", "12th"));
    // list.add(new Student(2, "salu", "12th"));

    // }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {

        return studentRepository.addStudent(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.getAll();
    }

    @Override
    public Student findStudent(int id) {

        return studentRepository.findOne(id);
    }

    @Override
    public void update(Student student, Integer id) {
        studentRepository.update(student, id);

    }

    @Override
    public Student delete(int id) {

        return studentRepository.delete(id);
    }

    // @Override
    // public Student addStudent(Student student) {

    // list.add(student);
    // return student;
    // }

    // @Override
    // public List<Student> findAll() {
    // return list;
    // }

    // @Override
    // public Student findStudent(int id) {

    // return list.stream().filter(e -> e.getEn() == id).findFirst().get();
    // }

    // @Override
    // public void update(Student student, Integer id) {
    // list.stream().map(e -> {
    // if (e.getEn() == id) {
    // e.setName(student.getName());
    // e.setStandard(student.getStandard());
    // }
    // return e;

    // }).collect(Collectors.toList());

    // }

    // @Override
    // public List<Student> delete(int id) {

    // return list.stream().filter(e -> e.getEn() !=
    // id).collect(Collectors.toList());
    // }
}
