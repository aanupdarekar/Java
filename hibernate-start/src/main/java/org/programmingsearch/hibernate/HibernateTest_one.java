package org.programmingsearch.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.programmingsearch.hibernate.dto.Address;
import org.programmingsearch.hibernate.dto.UserDetails_one;

public class HibernateTest_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails_one user = new UserDetails_one();
		user.setUserName("Anup");
		user.setAddress("First user address");
		user.setDate(new Date());
		user.setDescription("Description of user one");
		
		Address address1 = new Address();
		address1.setCity("SatinPaul");
		address1.setState("MN");
		//user.setHomeaddress(address1);
		
		Address address2= new Address();
		/*UserDetails user1 = new UserDetails();
		user1.setUserName("Prerana");
		user1.setAddress("Second user address");
		user1.setDate(new Date());
		user1.setDescription("Description of user two");*/
		address2.setCity("Minnehhaha");
		address2.setState("MN");
	//	user1.setHomeaddress(address2);
		
		user.getListofAddress().add(address1);
		user.getListofAddress().add(address2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		//session.save(user1);
		session.getTransaction().commit();
		session.close();
		
	/*	Session sessionGet = sessionFactory.openSession();
		
		UserDetails_one userget = (UserDetails_one)sessionGet.get(UserDetails_one.class, 1);
		System.out.println(" "+userget.getListofAddress().size());*/
		
	

	}

}
