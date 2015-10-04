package org.laundry.service;

import java.util.Collection;

import org.laundry.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderServiceImpl OrderServiceImpl;
	
	@Override
	public Collection<Order> getOrdersList() {
		return OrderServiceImpl.getOrdersList();
	}

	@Override
	public void saveOrder(Order order) {
		OrderServiceImpl.saveOrder(order);
	}

	@Override
	public void updateOrder(Order orer) {
		
	}

	@Override
	public void deleteOrder(int orderID) {
		
	}

	@Override
	public Order getOrderDetails(int orderID) {
		return OrderServiceImpl.getOrderDetails(orderID);
	}

	@Override
	public Order getOrderByUserID(int userID) {
		return OrderServiceImpl.getOrderByUserID(userID);
	}

	@Override
	public Order getOrderByLaundryID(int laundryID) {
		return null;
	}
}
