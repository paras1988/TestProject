package org.laundry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address extends BaseEntity{

	@Column(name="loctag")
	private String locationTag;

	@Column(name="flatNumber")
	private String flatNumber;

	@Column(name="landmark")
	private String landmark;

	@Column(name="locality")
	private String locality;

	@Column(name="address")
	private String address;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}