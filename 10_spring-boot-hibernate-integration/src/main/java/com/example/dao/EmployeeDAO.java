package com.example.dao;

import java.util.List;

import com.example.data.Employee;

public interface EmployeeDAO
{
	List<Employee> getEmployees();
	Employee createEmployee(Employee employee);
}
