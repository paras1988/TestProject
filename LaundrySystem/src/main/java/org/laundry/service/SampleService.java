package org.laundry.service;

import java.util.List;

import org.laundry.model.Address;
import org.laundry.model.User;

public interface SampleService {
	User getUserById(int id);
	List<Address> getAddressesByUser(User user);
}
