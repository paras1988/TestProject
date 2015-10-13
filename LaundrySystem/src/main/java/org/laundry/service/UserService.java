package org.laundry.service;

import org.laundry.model.Order;
import org.laundry.model.User;

public interface UserService {

	void saveUser(User user);
	
	User getUserDetails(int userId);
}
