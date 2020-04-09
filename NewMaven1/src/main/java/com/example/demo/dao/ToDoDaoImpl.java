package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Task;
import com.example.demo.model.ToDo;

public class ToDoDaoImpl implements ToDoDao
{
	private Task task;
	
	{
		task=new Task();
	}

	public void createTask(ToDo todo)
	{
		task.createToDo(todo);
	}

	public List<ToDo> getAllToDo()
	{
		return task.getAllToDo();
	}

}
