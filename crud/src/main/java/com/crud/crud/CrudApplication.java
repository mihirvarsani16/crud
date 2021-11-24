package com.crud.crud;

import java.util.Arrays;

import com.crud.crud.entity.Student;
import com.crud.crud.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(1, "mihir", "12th");
		Student student2 = new Student(2, "salu", "11th");

		studentRepository.students.addAll(Arrays.asList(student, student2));
	}

}
