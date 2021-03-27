package com.example.demo.Repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {
	Student save(Student student);
	ArrayList<Student> findAll();
}
