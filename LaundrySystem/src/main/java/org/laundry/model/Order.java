package org.laundry.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Order extends BaseEntity{
	
	@Column(name="serviceType")
	private String serviceType;
	
	@Column(name="washType")
	private String washType;
	
	@Column(name="pickUpDate")
	private Date pickUpDate;
	
	@Column(name="pickUpSlot")
	private Integer pickUpSlot;
	
	@Column(name="delieveryDate")
	private Date delieveryDate;
	
	@Column(name="delieverySlot")
	private Integer delieverySlot;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Address addressId;
	
	@ManyToOne
	@JoinColumn(name="id")
	private User userId;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Laundry laundryId;
	
}
