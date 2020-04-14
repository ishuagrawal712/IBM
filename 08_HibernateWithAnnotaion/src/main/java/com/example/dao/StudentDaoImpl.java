package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.domain.Student;
import com.example.factory.MyHibernateFactory;

public class StudentDaoImpl implements StudentDao
{
	
	private  MyHibernateFactory factory=null;
	private SessionFactory sessionFactory=null;
	private Session session=null;
	
	{
		factory=MyHibernateFactory.getMyHibernateFactory();
		sessionFactory=factory.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Student createStudent(Student student)
	{
		
		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();
		return student;
	}

	public List<Student> getAllStudent()
	{
		List<Student> list=session.createQuery("from Student",Student.class).list();
		
		return list;
	}

}
