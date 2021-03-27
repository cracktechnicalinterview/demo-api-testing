package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Student")
public class Student {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String rollNo;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, String rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

}
