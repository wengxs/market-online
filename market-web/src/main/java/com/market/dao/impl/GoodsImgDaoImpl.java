package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.GoodsImg;
import com.market.dao.GoodsImgDao;

public class GoodsImgDaoImpl extends DAOSupport implements GoodsImgDao {

	public GoodsImgDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(GoodsImg goodsImg) {
		template.save(goodsImg);
	}

	public void delete(GoodsImg goodsImg) {
		template.delete(goodsImg);
	}

	public void update(GoodsImg goodsImg) {
		template.update(goodsImg);
	}

	public List<GoodsImg> findAll() {
		return template.find("from GoodsImg");
	}

	public List<GoodsImg> findByGoodsID(String hql, int goodsID) {
		return template.find(hql, goodsID);
	}

	public GoodsImg findGoodsImg(String hql, Object... params) {
		try{
			return (GoodsImg) template.find(hql, params).get(0);
		}catch(Exception e) {
			return null;
		}
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

}
