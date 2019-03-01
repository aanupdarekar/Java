package org.programmingsearch.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.programmingsearch.hibernate.dto.UserDetails;
import org.programmingsearch.hibernate.dto.UserDetailsOneToOne;
import org.programmingsearch.hibernate.dto.Vehicle;
import org.programmingsearch.hibernate.dto.VehicleOneToOne;

public class HibernateTestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetailsOneToOne user = new UserDetailsOneToOne();
		user.setUserName("Anup");
		
		VehicleOneToOne vehicle = new VehicleOneToOne();
		vehicle.setVehicleName("Jaguar");
		
		VehicleOneToOne vehicle1 = new VehicleOneToOne();
		vehicle1.setVehicleName("Toyota");
		
		user.setVehicle(vehicle1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle1);
		session.getTransaction().commit();
		session.close();
		
		
		
		
	

	}

}
