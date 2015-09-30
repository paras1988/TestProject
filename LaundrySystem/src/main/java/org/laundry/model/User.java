package org.laundry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User extends BaseEntity{
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="emailId")
	private String email;
	
	@Column(name="password")
	private String password;
}
