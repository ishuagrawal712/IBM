package com.example;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.example.domain.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;

public class App
{
	private static StudentService service=null;
	private static Scanner scanner=new Scanner(System.in);
	static
	{
		service=new StudentServiceImpl();
	}
	
	public static void main(String[] args)
	{
		String fName,lName,email;
		int choice=-1;
		
		do
		{
			System.out.println("1. Create Student");
			System.out.println("2. Display All Available Student");
			System.out.print("Enter your choice:  ");
			choice=scanner.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.print("Student First Name: ");
				fName=scanner.next();
				System.out.print("Student Last Name: ");
				lName=scanner.next();
				System.out.print("Student Email: ");
				email=scanner.next();
				
				Student student=new Student();
				student.setFirstName(fName);
				student.setLastName(lName);
				student.setEmail(email);
				student.setId(UUID.randomUUID().toString());
				student=service.createStudent(student);
				System.out.println(student);
				break;
				
			case 2:
				List<Student> list=service.getAllStudent();
				for(Student s:list)
				{
					System.out.println(s);
				}
				break;
				
			case 0:
				System.out.println("Bye!!");
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice.");
				break;
			}
			
			
		} while (choice !=0);
	
	}
}
