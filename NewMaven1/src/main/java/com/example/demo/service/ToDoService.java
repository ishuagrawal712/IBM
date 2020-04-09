package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ToDo;

public interface ToDoService
{
	public void createTask(ToDo todo);
	public List<ToDo> getAllToDo();

}