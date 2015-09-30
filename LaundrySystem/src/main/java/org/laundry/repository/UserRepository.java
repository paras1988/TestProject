package org.laundry.repository;

import java.util.Collection;

import org.laundry.model.User;

public interface UserRepository {

	User getUserById();
	
	Collection<User> getUsersList();
	
}
