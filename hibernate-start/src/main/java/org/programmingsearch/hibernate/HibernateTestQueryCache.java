package org.programmingsearch.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.programmingsearch.hibernate.dto.UserDetailsCaching;
import org.programmingsearch.hibernate.dto.UserDetailsCachingQueryCache;
import org.programmingsearch.hibernate.dto.UserDetailsHQL;

public class HibernateTestQueryCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		 Query query= session.createQuery("from  UserDetailsCachingQueryCache where userId=1").setHint("org.hibernate.cacheable", true);
		List<UserDetailsCachingQueryCache> users= (List<UserDetailsCachingQueryCache>)query.getResultList();
		
		
		session.getTransaction().commit();
		session.close();
		
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction();
		
		Query query1= session1.createQuery("from  UserDetailsCachingQueryCache where userId=1").setHint("org.hibernate.cacheable", true);
		users= (List<UserDetailsCachingQueryCache>)query1.getResultList();
		
		
		session1.getTransaction().commit();
		session1.close();
	}

}
