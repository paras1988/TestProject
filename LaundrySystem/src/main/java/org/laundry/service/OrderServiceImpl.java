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

	@Override
	public Collection<Order> getOrdersList() {
		return null;
	}

	@Override
	@Transactional
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(Order orer) {

	}

	@Override
	public void deleteOrder(int orderID) {

	}

	@Override
	public Order getOrderDetails(int orderID) {
		return orderRepository.getOrder(orderID);
	}

	@Override
	public List<Order> getOrderByUserID(int userID) {
		return (List<Order>) orderRepository.ordersListByUserId(userID);
	}

	@Override
	public Order getOrderByLaundryID(int laundryID) {
		return null;
	}
}
