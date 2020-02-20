package com.market.service;

import java.util.List;

import com.market.bean.Goods;
import com.market.bean.GoodsCategoryChild;

public interface GoodsService {
	// add
	public void addGoods(Goods goods, GoodsCategoryChild goodsCategoryChild) throws Exception;

	// remove
	public void removeGoods(Goods goods);

	// update
	public void updateGoods(Goods goods);

	// getOne
	public Goods getGoods(int goodsID);
	
	// getHot
	public List<Goods> getHot();
	
	// getTop
	public List<Goods> getTop();

	// listAllByObject
	public List<Goods> listGoodsByCategory(GoodsCategoryChild goodsCategoryChild);
}
