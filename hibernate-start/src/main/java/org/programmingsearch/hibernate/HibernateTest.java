package org.programmingsearch.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.programmingsearch.hibernate.dto.Address;
import org.programmingsearch.hibernate.dto.UserDetails;
import org.programmingsearch.hibernate.dto.UserDetails_one;
import org.programmingsearch.hibernate.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		user.setUserName("Anup");
		user.setAddress("First user address");
		user.setDate(new Date());
		user.setDescription("Description of user one");
		
		/*Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Jaguar");
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Toyota");
		
		user.setVehicle(vehicle1);*/
		/*user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle1);
		*/
		/*vehicle.getUser().add(user);
		vehicle1.getUser().add(user);
		*/
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
	//	session.save(vehicle);
	//	session.save(vehicle1);
		session.getTransaction().commit();
		session.close();
		
		
		
		
	

	}

}
