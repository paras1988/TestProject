package org.laundry.repository;

import java.util.Collection;

import org.laundry.model.User;

public interface UserRepository {

	public void save(User user);

	User getUserById();

	Collection<User> getUsersList();

}
