package com.example.demo.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;
	
	public ArrayList<Student> save(Student student) {
		repo.save(student);
		ArrayList<Student> list=repo.findAll();
		return list;
	}
	
	public ArrayList<Student> display() {
		ArrayList<Student> list=repo.findAll();
		return list;
	}
}
