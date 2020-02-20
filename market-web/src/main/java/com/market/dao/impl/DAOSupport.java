package com.market.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class DAOSupport {
	protected HibernateTemplate template;
	public DAOSupport(HibernateTemplate template){
		this.template = template;
	}
}
