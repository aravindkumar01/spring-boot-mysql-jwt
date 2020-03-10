package com.studycool.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_roles")
public class UserRole {
	

	@Id
	private long user_id;
	
	private long role_id;

	

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getRole_id() {
		return role_id;
	}

	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}

	
	
	
}
