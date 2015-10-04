package org.laundry.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="laundries")
public class Laundry extends BaseEntity{

	@Column(name="name")
	private String name;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="address")
	private String address;
	
	
	@OneToMany(mappedBy="laundryId")
	private Set<Order> laundryId;
	
	
}
