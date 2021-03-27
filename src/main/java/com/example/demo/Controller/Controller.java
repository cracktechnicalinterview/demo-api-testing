package com.example.demo.Controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/demoapp")
@RestController
public class Controller {

	@Autowired
	StudentService service;
	
	@GetMapping("")
	public ArrayList<Student> getAllData() {
		return service.display();
	}
	
	@PostMapping("/submit")
	public ArrayList<Student> submitEntry(@RequestBody Student student) {
		ArrayList<Student> list=new ArrayList<Student>();
		list=service.save(student);
		return list;
	}
	
	
}
