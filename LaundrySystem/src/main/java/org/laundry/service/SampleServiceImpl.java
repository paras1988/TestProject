package org.laundry.service;

import java.util.List;

import org.laundry.model.Address;
import org.laundry.model.User;
import org.laundry.repository.AddressRepository;
import org.laundry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{
	
	@Autowired
	UserRepository user;
	
	@Autowired
	AddressRepository add;

	public User getUserById(int id) {
		user.getUserById();
		return null;
	}

	public List<Address> getAddressesByUser(User user) {
		
		return null;
	}

}
