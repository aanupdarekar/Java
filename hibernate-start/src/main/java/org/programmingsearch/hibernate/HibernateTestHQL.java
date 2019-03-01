package org.programmingsearch.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.programmingsearch.hibernate.dto.UserDetailsHQL;

public class HibernateTestHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String minUserId ="5";
		Query query= session.createQuery("from UserDetailsHQL where userId > ?");
	//	query.setFirstResult(5);
	//	query.setMaxResults(10);
		query.setParameter(0, 8);
		
		List<UserDetailsHQL> users= (List<UserDetailsHQL>)query.getResultList();
		session.getTransaction().commit();
		session.close();
		for (UserDetailsHQL userDetailsHQL : users) {
			System.out.println(userDetailsHQL.getUserName());	
		}
		

	}

}
