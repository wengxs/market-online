package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.OrderStatus;
import com.market.dao.OrderStatusDao;

public class OrderStatusDaoImpl extends DAOSupport implements OrderStatusDao {

	public OrderStatusDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(OrderStatus orderStatus) {
		template.save(orderStatus);
	}

	public void delete(OrderStatus orderStatus) {
		template.delete(orderStatus);
	}

	public void update(OrderStatus orderStatus) {
		template.delete(orderStatus);
	}

	public List<OrderStatus> find(String hql, Object...params) {
		return template.find(hql, params);
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

}
