package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.GoodsCategory;
import com.market.dao.GoodsCategoryDao;

public class GoodsCategoryDaoImpl extends DAOSupport implements
		GoodsCategoryDao {

	public GoodsCategoryDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(GoodsCategory goodsCategory) {
		template.save(goodsCategory);
	}

	public void delete(GoodsCategory goodsCategory) {
		template.delete(goodsCategory);
	}

	public void update(GoodsCategory goodsCategory) {
		template.update(goodsCategory);
	}

	public GoodsCategory find(String hql, Object... params) {
		try {
			return (GoodsCategory) template.find(hql, params).get(0);
		}catch(Exception e) {
			return null;
		}
	}

	public List<GoodsCategory> findAll() {
		return  template.find("from GoodsCategory");
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

}
