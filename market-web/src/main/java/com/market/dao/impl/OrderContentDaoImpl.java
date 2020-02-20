package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.OrderContent;
import com.market.dao.OrderContentDao;

public class OrderContentDaoImpl extends DAOSupport implements OrderContentDao {

	public OrderContentDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(OrderContent orderContent) {
		template.save(orderContent);
	}

	public void delete(OrderContent orderContent) {
		template.delete(orderContent);
	}

	public void update(OrderContent orderContent) {
		template.update(orderContent);
	}

	public List<OrderContent> find(String hql, Object... params) {
		return template.find(hql, params);
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}
}
