package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.model.InstructorDetails;

@Service
public class InstructorServiceImpl implements InstructorService
{

	@Autowired
	private InstructorDao dao;
	
	@Override
	public void addInstructor(InstructorDetails instructor)
	{
		dao.addInstructor(instructor);
	}

	@Override
	public InstructorDetails getInstructor(int id)
	{
		return dao.getInstructor(id);
	}

	@Override
	public List<InstructorDetails> getAllInstructor()
	{
		return dao.getAllInstructor();
	}

	@Override
	public void deleteInstructor(int id)
	{
		dao.deleteInstructor(id);
	}

	@Override
	public void updateInstructor(InstructorDetails instructor)
	{
		dao.updateInstructor(instructor);
	}

}
