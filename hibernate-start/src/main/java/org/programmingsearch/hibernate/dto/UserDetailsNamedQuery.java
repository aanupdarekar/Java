package org.programmingsearch.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS_HQL")
@NamedQuery(name="UserDetailsNamedQuery.byId", query="from UserDetailsNamedQuery")
@NamedNativeQuery(name="UserDetailsNamedQuery.findAll" , query="select * from user_details_hql where user_name = ?",resultClass=UserDetailsNamedQuery.class)
public class UserDetailsNamedQuery {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


}
