package org.laundry.repository;

import java.util.Collection;

import org.laundry.model.Address;
import org.laundry.model.User;

public interface AddressRepository {
	Collection<Address> getAddressByUser(User user);
}
