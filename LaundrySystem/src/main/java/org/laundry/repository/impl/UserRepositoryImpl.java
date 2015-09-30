package org.laundry.repository.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.laundry.model.User;
import org.laundry.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@PersistenceContext
	private EntityManager em;

	public User getUserById() {
		return null;
	}


	public Collection<User> getUsersList() {
		return null;
	}
}
