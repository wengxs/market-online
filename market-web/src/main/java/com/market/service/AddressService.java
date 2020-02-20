package com.market.service;

import java.util.List;

import com.market.bean.Address;
import com.market.bean.User;

public interface AddressService {
	// add
	public void addAddress(Address address, User user) throws Exception;

	// remove
	public void removeAddress(Address address);

	// update
	public void updateAddress(Address address);

	// getOne
	public Address getAddress(Object... params);

	// listAllByObject
	public List<Address> listAddressByUser(User user);
}
