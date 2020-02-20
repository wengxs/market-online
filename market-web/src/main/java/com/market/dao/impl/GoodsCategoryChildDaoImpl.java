package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.GoodsCategoryChild;
import com.market.dao.GoodsCategoryChildDao;

public class GoodsCategoryChildDaoImpl extends DAOSupport implements
		GoodsCategoryChildDao {

	public GoodsCategoryChildDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(GoodsCategoryChild goodsCategoryChild) {
		template.save(goodsCategoryChild);
	}

	public void delete(GoodsCategoryChild goodsCategoryChild) {
		template.delete(goodsCategoryChild);
	}

	public void update(GoodsCategoryChild goodsCategoryChild) {
		template.update(goodsCategoryChild);
	}

	public GoodsCategoryChild find(String hql, Object... params) {
		try {
			return (GoodsCategoryChild) template.find(hql, params).get(0);
		}catch(Exception e) {
			return null;
		}
	}

	public List findByCategoryID(String hql, int categoryID) {
		return template.find(hql, categoryID);
	}

	public List findAll() {
		return template.find("from GoodsCategoryChild");
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

}
