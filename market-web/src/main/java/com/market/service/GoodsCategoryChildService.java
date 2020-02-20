package com.market.service;

import java.util.List;

import com.market.bean.GoodsCategory;
import com.market.bean.GoodsCategoryChild;

public interface GoodsCategoryChildService {
	// add
	public void addGoodsCategoryChild(GoodsCategoryChild goodsCategoryChild);

	// remove
	public void removeGoodsCategoryChild(GoodsCategoryChild goodsCategoryChild);

	// update
	public void updateGoodsCategoryChild(GoodsCategoryChild goodsCategoryChild);

	// getOne
	public GoodsCategoryChild getGoodsCategoryChild(int id);

	// listAllByObject
	public List<GoodsCategoryChild> listCategoryes(GoodsCategory goodsCategory);
}
