package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.Order;
import com.market.dao.OrderDao;

public class OrderDaoImpl extends DAOSupport implements OrderDao {

	public OrderDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(Order order) {
		template.save(order);
	}

	public void delete(Order order) {
		template.delete(order);
	}

	public void update(Order order) {
		template.update(order);
	}

	public List<Order> find(String hql, Object... params) {
		return template.find(hql, params);
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}
}
