package org.laundry.service;

import org.laundry.model.User;
import org.laundry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public void saveUser(User user) {
		userRepository.save(user);

	}

	@Override
	@Transactional(readOnly = true)
	public User getUserDetails(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
