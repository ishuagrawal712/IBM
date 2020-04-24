package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.example.data.Employee;

@Repository(value = "employeeDAO")
@EnableTransactionManagement
public class EmployeeDAOImpl implements EmployeeDAO
{

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager)
	{
		super();
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Employee> getEmployees()
	{
		Session session = entityManager.unwrap(Session.class);

		Query query = session.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee employee)
	{
		Session session = entityManager.unwrap(Session.class);
		session.save(employee);
		return employee;
	}

}
