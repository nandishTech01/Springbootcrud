package com.apiexample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apiexample.Services.Services;
import com.apiexample.entities.Student;

@RestController
public class StudentController {

	@Autowired
	private Services service;

	// get all books
	@GetMapping("/students")
	public List<Student> getStudents() {
		return service.getAllStudents();
	}

	// get one book

	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return service.getstudent(id);
	}

	// add book
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {
		return service.addStudent(s);
	}

	// delete book by id
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
	
	
	//update student
	
	@PutMapping("/student/{bid}")
	public void updateStudent(@RequestBody Student student ,@PathVariable("bid") int id)
	{
		this.service.updateStudent(student, id);
	}


}
