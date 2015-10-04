package org.laundry.model;

import javax.persistence.Column;

public class Item extends BaseEntity{
	
	@Column(name="name")
	private String name;
	
	@Column(name="washIronPrice")
	private String washIronPrice;
	
	@Column(name="drycleanPrice")
	private String dryCleanPrice;
	
	@Column(name="ironPrice")
	private String ironPrice;
	
	
}
