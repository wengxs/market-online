package com.market.service;

import java.util.List;

import com.market.bean.GoodsCategory;

public interface GoodsCategoryService {
	// add
	public void addGoodsCategory(GoodsCategory goodsCategory);

	// remove
	public void removeGoodsCategory(GoodsCategory goodsCategory);

	// update
	public void updateGoodsCategory(GoodsCategory goodsCategory);

	// getOne
	public GoodsCategory getGoodsCategory(int id);

	// listAll
	public List<GoodsCategory> listCategoryes();
}
