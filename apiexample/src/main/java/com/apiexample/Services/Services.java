package com.apiexample.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apiexample.dao.Repository;
import com.apiexample.entities.Student;

@Component
public class Services {

	@Autowired
	private Repository repository;

	// get all students
	public List<Student> getAllStudents() {
		return (List<Student>) repository.findAll();
	}

	// get student by id
	public Student getstudent(int id) {
		return repository.findById(id);
	}

	// add Student

	public Student addStudent(Student s) {
		Student save = repository.save(s);
		return save;
	}
	
	//delete student
	public void deleteStudent(int id) {
		repository.deleteById(id);
	}
	
	
	//update student
	
	public void updateStudent(Student stu,int id) {
		repository.save(stu);
	}
}
