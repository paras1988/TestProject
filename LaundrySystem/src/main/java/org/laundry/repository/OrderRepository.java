package org.laundry.repository;

import java.util.Collection;

import org.laundry.model.Order;

public interface OrderRepository {

	public void save(Order order);

	public Order getOrder(int orderId);

	public Collection<Order> ordersListByUserId(int userId);
}
