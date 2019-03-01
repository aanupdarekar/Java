package org.programmingsearch.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.programmingsearch.hibernate.dto.UserDetailsCaching;

public class HibernateTestCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		UserDetailsCaching user = (UserDetailsCaching)session.get(UserDetailsCaching.class, 1);
		System.out.println(user.getUserName());
		
		
		
		session.getTransaction().commit();
		session.close();
		
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction();
		UserDetailsCaching user1 = (UserDetailsCaching)session1.get(UserDetailsCaching.class, 1);
		System.out.println(user1.getUserName());
		
		
		
		session1.getTransaction().commit();
		session1.close();
	}

}
