package com.example.demo;

import java.util.List;
import java.util.Scanner;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;
import com.example.demo.service.ToDoServiceImpl;

public class App 
{
	private ToDoService service;
	private static Scanner scanner = new Scanner(System.in);

	{
		service = new ToDoServiceImpl();
	}

	public static void main(String[] args)
	{

		int choice = 0;
		App app=new App();

		do
		{
			System.out.println("1. Create Task.");
			System.out.println("2. Display All Task.");
			System.out.print("choose your choice: ");
			choice=scanner.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.print("Enter ToDo Name: ");
				app.service.createTask(new ToDo(scanner.next()));
				break;
				
			case 2:
				List<ToDo> list=app.service.getAllToDo();
				for(ToDo todo:list)
				{
					System.out.println(todo);
					System.out.println(todo.getTodoName());
				}
				break;
				
			case 0:
				System.out.println("bye.!!!!!");
				System.exit(0);
				break;
				
			default:
				break;
			}

		} while (choice != 0);

	}
}
