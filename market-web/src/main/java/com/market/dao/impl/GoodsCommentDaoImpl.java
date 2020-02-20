package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.GoodsComment;
import com.market.dao.GoodsCommentDao;

public class GoodsCommentDaoImpl extends DAOSupport implements GoodsCommentDao {

	public GoodsCommentDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(GoodsComment goodsComment) {
		template.save(goodsComment);
	}

	public void delete(GoodsComment goodsComment) {
		template.delete(goodsComment);
	}

	public void update(GoodsComment goodsComment) {
		template.update(goodsComment);
	}

	public List<GoodsComment> findAll() {
		return template.find("from GoodsComment");
	}

	public List<GoodsComment> findByGoodsID(String hql, int goodsID) {
		return template.find(hql, goodsID);
	}

	public GoodsComment findGoodsComment(String hql, Object... params) {
		try {
			return (GoodsComment) template.find(hql, params).get(0);
		}catch(Exception e) {
			return null;
		}
	}

	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

}
