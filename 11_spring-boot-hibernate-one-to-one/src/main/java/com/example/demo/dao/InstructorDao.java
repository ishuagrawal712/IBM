package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.InstructorDetails;

public interface InstructorDao {

	public void addInstructor(InstructorDetails instructor);
	public InstructorDetails getInstructor(int id);
	public List<InstructorDetails> getAllInstructor();
	public void deleteInstructor(int id);
	public void updateInstructor(InstructorDetails instructor);
 }
