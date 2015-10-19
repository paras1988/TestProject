package org.laundry.repository.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.laundry.model.Order;
import org.laundry.repository.OrderRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository{


	@PersistenceContext
	private EntityManager em;

	public void save(Order order) {
		if (order.getId() == null) {
			this.em.persist(order);
		}
		else {
			this.em.merge(order);
		}
	}

	public Order getOrder(int orderId) {
		Query query = this.em.createQuery("SELECT * FROM Order WHERE id =:id");
		query.setParameter("id", orderId);
		return (Order) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public Collection<Order> ordersListByUserId(int userId) {
		Query query = this.em.createQuery("SELECT * FROM orderDetails WHERE user_id =:userId");
		query.setParameter("userId", userId);
		return query.getResultList();
	}



}
