package org.programmingsearch.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleid;

	@Column(name="Vehicle_name")
	private String vehicleName;

/*	
 	@ManyToOne
 	@JoinColumn(name="USER_ID")
 	private UserDetails user;
	
	
	public void setUser(UserDetails user) {
		this.user = user;
	}
*/
/*	@ManyToMany(mappedBy="vehicle")
	private Collection<UserDetails> user = new ArrayList<UserDetails>();

	public Collection<UserDetails> getUser() {
		return user;
		
		public void setUser(Collection<UserDetails> user) {
		this.user = user;
	}
	}*/

	public int getVehicleid() {
		return vehicleid;
	}

	public String getVehicleName() {
		return vehicleName;
	}


	

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}


}
