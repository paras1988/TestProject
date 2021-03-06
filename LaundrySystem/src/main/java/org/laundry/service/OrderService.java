package org.laundry.service;

import java.util.Collection;
import java.util.List;

import org.laundry.model.Order;

public interface OrderService {

	Collection<Order> getOrdersList();

	void saveOrder(Order orer);

	void updateOrder(Order orer);

	void deleteOrder(int orderID);

	Order getOrderDetails(int orderID);

	List<Order> getOrderByUserID(int userID);

	Order getOrderByLaundryID(int laundryID);

}

