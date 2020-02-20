package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.Address;
import com.market.dao.AddressDao;

public class AddressDaoImpl extends DAOSupport implements AddressDao {

	public AddressDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(Address address) {
		template.save(address);
	}

	public void delete(Address address) {
		template.delete(address);
	}

	public void update(Address address) {
		template.update(address);
	}

	public List<Address> findAll() {
		return template.find("form Address");
	}

	public List<Address> findByUserID(String hql, int userID) {
		return template.find(hql, userID);
		//String hql = "from Address where user.id = ?";
	}

	public Address findAddress(String hql, Object... params) {
		try {
			return (Address) template.find(hql, params).get(0);
		}catch(Exception e) {
			return null;
		}
	}
	
	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

}
