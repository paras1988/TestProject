package org.laundry.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderDetails")
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

	@ManyToOne()
	@JoinColumn(name="address_id")
	private Address addressId;

	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;

	@ManyToOne
	@JoinColumn(name="laundry_id")
	private Laundry laundryId;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getWashType() {
		return washType;
	}

	public void setWashType(String washType) {
		this.washType = washType;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public Integer getPickUpSlot() {
		return pickUpSlot;
	}

	public void setPickUpSlot(Integer pickUpSlot) {
		this.pickUpSlot = pickUpSlot;
	}

	public Date getDelieveryDate() {
		return delieveryDate;
	}

	public void setDelieveryDate(Date delieveryDate) {
		this.delieveryDate = delieveryDate;
	}

	public Integer getDelieverySlot() {
		return delieverySlot;
	}

	public void setDelieverySlot(Integer delieverySlot) {
		this.delieverySlot = delieverySlot;
	}

	public Address getAddressId() {
		return addressId;
	}

	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Laundry getLaundryId() {
		return laundryId;
	}

	public void setLaundryId(Laundry laundryId) {
		this.laundryId = laundryId;
	}



}
