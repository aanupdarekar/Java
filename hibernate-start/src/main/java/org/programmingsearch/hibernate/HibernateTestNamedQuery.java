package org.programmingsearch.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.programmingsearch.hibernate.dto.UserDetailsHQL;
import org.programmingsearch.hibernate.dto.UserDetailsNamedQuery;

public class HibernateTestNamedQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.getNamedQuery("UserDetailsNamedQuery.byId");
		List<UserDetailsNamedQuery> users = (List<UserDetailsNamedQuery>) query.getResultList();

		Query query1 = session.getNamedQuery("UserDetailsNamedQuery.findAll");
		query1.setParameter(0, "User 1");

		List<UserDetailsNamedQuery> users1 = (List<UserDetailsNamedQuery>) query1.getResultList();

		session.getTransaction().commit();
		session.close();
		for (UserDetailsNamedQuery userDetailsHQL : users) {
			System.out.println(userDetailsHQL.getUserName());
		}

		for (UserDetailsNamedQuery userDetailsHQL : users1) {
			System.out.println(userDetailsHQL.getUserName());
		}

	}

}
