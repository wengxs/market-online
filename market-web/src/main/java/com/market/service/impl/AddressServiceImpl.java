package com.market.service.impl;

import java.util.List;

import com.market.bean.Address;
import com.market.bean.User;
import com.market.dao.AddressDao;
import com.market.service.AddressService;

public class AddressServiceImpl implements AddressService {

	private AddressDao addressDao;
	
	public AddressServiceImpl(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public void addAddress(Address address, User user) throws Exception {
		address.setUser(user);
		addressDao.save(address);
	}

	public void removeAddress(Address address) {
		addressDao.delete(address);
	}

	public void updateAddress(Address address) {
		addressDao.update(address);
	}

	public Address getAddress(Object... params) {
		String hql = "from Address where id = ?";
		return addressDao.findAddress(hql, params);
	}

	public List<Address> listAddressByUser(User user) {
		String hql = "from Address where user_id = ?";
		return addressDao.findByUserID(hql, user.getId());
	}

}
