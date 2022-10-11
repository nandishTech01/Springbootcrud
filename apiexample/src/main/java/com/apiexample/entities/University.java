package com.apiexample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "apiuniversity")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String Department;

	@OneToOne(mappedBy = "university")
	@JsonBackReference
	private Student student;

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

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", Department=" + Department + ", student=" + student + "]";
	}

	public University(int id, String name, String department, Student student) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		this.student = student;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
