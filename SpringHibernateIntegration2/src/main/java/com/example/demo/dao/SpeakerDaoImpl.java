package com.example.demo.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Speaker;
@Repository
public class SpeakerDaoImpl implements SpeakerDao{

	@Autowired
	private SessionFactory sessionFactory;
	private EntityManagerFactory factory;
	private EntityManager em;

	@PostConstruct
	public void init()
	{
		factory = sessionFactory.unwrap(SessionFactory.class);
		em = factory.createEntityManager();
	}
	
	public Speaker addSpeaker(Speaker speaker) {
		
		Speaker obj = em.find(Speaker.class,speaker.getSpearkerId());
		if(obj == null)
		{
			em.getTransaction().begin();
			em.persist(speaker);
			em.getTransaction().commit();
			return speaker;
		}
		else
		{em.getTransaction().begin();
			em.merge(speaker);
			em.getTransaction().commit();
			return speaker;
		}
	}

	public Speaker getSpeaker(long id) {
		
		Speaker obj = em.find(Speaker.class,id);
		if(obj == null)
		{
			System.out.println("No data with id: " + id);
			return null;
		}
		else
			return obj;
	}

	public List<Speaker> getAllSpeaker() {

		List<Speaker> list = em.createQuery("from Speaker", Speaker.class).getResultList();
		if(list.isEmpty())
		{
			System.out.println("No data is Available...");
			return null;
		}

		else
			return list;
	}

	public void deleteSpeaker(long id) {
		Speaker obj = em.find(Speaker.class,id);
		if(obj==null)
		{
			System.out.println("No data with id: " +id);
			return;
		}
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();
	}

}
