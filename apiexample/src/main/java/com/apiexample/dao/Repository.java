package com.apiexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.apiexample.entities.Student;

public interface Repository extends CrudRepository<Student, Integer> {

	public Student findById(int sid);

}
