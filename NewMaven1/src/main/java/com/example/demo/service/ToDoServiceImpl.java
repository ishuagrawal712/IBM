package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.ToDoDao;
import com.example.demo.dao.ToDoDaoImpl;
import com.example.demo.model.ToDo;

public class ToDoServiceImpl implements ToDoService
{
	private ToDoDao dao;
	
	{
		dao=new ToDoDaoImpl();
	}

	public void createTask(ToDo todo)
	{
		dao.createTask(todo);
	}

	public List<ToDo> getAllToDo()
	{
		return dao.getAllToDo();
	}
}
