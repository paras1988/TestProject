package org.laundry.repository.impl;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.laundry.model.Address;
import org.laundry.model.User;
import org.laundry.repository.AddressRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepositoryImpl implements AddressRepository{

	@PersistenceContext
    private EntityManager em;
	
	public Collection<Address> getAddressByUser(User user) {
		return null;
	}

}
