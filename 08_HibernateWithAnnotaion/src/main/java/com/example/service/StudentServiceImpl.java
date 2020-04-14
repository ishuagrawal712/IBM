package com.example.service;

import java.util.List;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.domain.Student;

public class StudentServiceImpl implements StudentService
{

	private StudentDao dao;
	
	{
		dao=new StudentDaoImpl();
	}
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudent(student);
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}

}
