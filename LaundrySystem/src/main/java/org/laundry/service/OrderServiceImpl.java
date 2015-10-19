package org.laundry.service;

import java.util.Collection;
import java.util.List;

import org.laundry.model.Order;
import org.laundry.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;

	public Collection<Order> getOrdersList() {
		return null;
	}

	@Transactional
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}

	public void updateOrder(Order orer) {

	}

	public void deleteOrder(int orderID) {

	}

	public Order getOrderDetails(int orderID) {
		return orderRepository.getOrder(orderID);
	}

	public List<Order> getOrderByUserID(int userID) {
		return (List<Order>) orderRepository.ordersListByUserId(userID);
	}

	public Order getOrderByLaundryID(int laundryID) {
		return null;
	}
}
