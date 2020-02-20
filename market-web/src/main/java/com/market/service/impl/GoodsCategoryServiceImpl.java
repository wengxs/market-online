package com.market.service.impl;

import java.util.List;

import com.market.bean.GoodsCategory;
import com.market.dao.GoodsCategoryDao;
import com.market.service.GoodsCategoryService;

public class GoodsCategoryServiceImpl implements GoodsCategoryService {

	private GoodsCategoryDao goodsCategoryDao;
	
	public GoodsCategoryServiceImpl(GoodsCategoryDao goodsCategoryDao) {
		this.goodsCategoryDao = goodsCategoryDao;
	}

	public void addGoodsCategory(GoodsCategory goodsCategory) {
		goodsCategoryDao.save(goodsCategory);
	}

	public void removeGoodsCategory(GoodsCategory goodsCategory) {
		goodsCategoryDao.delete(goodsCategory);
	}

	public void updateGoodsCategory(GoodsCategory goodsCategory) {
		goodsCategoryDao.update(goodsCategory);
	}

	public GoodsCategory getGoodsCategory(int id) {
		String hql = "form GoodsCategory where id = ?";
		return goodsCategoryDao.find(hql, id);
	}

	public List<GoodsCategory> listCategoryes() {
		return goodsCategoryDao.findAll();
	}

}
