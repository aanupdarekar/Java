package org.programmingsearch.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "USER_DETAILS_ONE_TO_ONE")
public class UserDetailsOneToOne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;

	@Column(name = "user_name")
	private String userName;

	@OneToOne
	@JoinColumn(name="vehicle_id")
	private VehicleOneToOne vehicle;

	public VehicleOneToOne getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleOneToOne vehicle1) {
		this.vehicle = vehicle1;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName + "getter";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
