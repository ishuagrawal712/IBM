package com.example.dao;

import java.util.List;

import com.example.domain.Student;

public interface StudentDao
{
	
	public Student createStudent(Student student);
	public List<Student> getAllStudent();

}
