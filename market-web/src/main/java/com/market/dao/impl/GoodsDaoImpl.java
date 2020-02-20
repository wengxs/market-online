package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.Goods;
import com.market.dao.GoodsDao;

public class GoodsDaoImpl extends DAOSupport implements GoodsDao {

	public GoodsDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(Goods goods) {
		template.save(goods);
	}

	public void delete(Goods goods) {
		template.delete(goods);
	}

	public void update(Goods goods) {
		template.update(goods);
	}

	public List<Goods> findAll() {
		return template.find("from Goods");
	}
	
	public List<Goods> find(String hql, Object... params) {
		return template.find(hql, params);
	}

	public List<Goods> findByCategoryID(String hql, int categoryID) {
		return template.find("from Goods where category_id = ?", categoryID);
	}

	public Goods findGoods(String hql, Object... params) {
		try {
			return (Goods) template.find(hql, params).get(0);
		}catch(Exception e) {
			return null;
		}
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

}
