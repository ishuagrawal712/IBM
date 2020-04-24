package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.EmployeeDAO;
import com.example.data.Employee;

@SpringBootApplication
public class SpringBootHibernateIntegrationApplication implements CommandLineRunner
{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public SpringBootHibernateIntegrationApplication(EmployeeDAO employeeDAO)
	{
		super();
		this.employeeDAO = employeeDAO;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootHibernateIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Employee employee=new Employee("John","Doe","john@luv2code.com");
		employeeDAO.createEmployee(employee);
		employee=new Employee("Marry", "Joe", "marry@luv2code.com");
		employeeDAO.createEmployee(employee);
		employee=new Employee("Shane", "warne", "shane@luv2code.com");
		employeeDAO.createEmployee(employee);
	}

}
