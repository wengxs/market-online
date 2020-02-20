package com.market.service.impl;

import java.util.List;

import com.market.bean.GoodsCategory;
import com.market.bean.GoodsCategoryChild;
import com.market.dao.GoodsCategoryChildDao;
import com.market.service.GoodsCategoryChildService;

public class GoodsCategoryChildServiceImpl implements GoodsCategoryChildService {

	private GoodsCategoryChildDao goodsCategoryChildDao;
	
	public GoodsCategoryChildServiceImpl(GoodsCategoryChildDao goodsCategoryChildDao) {
		this.goodsCategoryChildDao = goodsCategoryChildDao;
	}

	public void addGoodsCategoryChild(GoodsCategoryChild goodsCategoryChild) {
		goodsCategoryChildDao.save(goodsCategoryChild);
	}

	public void removeGoodsCategoryChild(GoodsCategoryChild goodsCategoryChild) {
		goodsCategoryChildDao.delete(goodsCategoryChild);
	}

	public void updateGoodsCategoryChild(GoodsCategoryChild goodsCategoryChild) {
		goodsCategoryChildDao.update(goodsCategoryChild);
	}

	public GoodsCategoryChild getGoodsCategoryChild(int id) {
		String hql = "from GoodsCategoryChild where id = ?";
		return goodsCategoryChildDao.find(hql, id);
	}

	public List<GoodsCategoryChild> listCategoryes(GoodsCategory goodsCategory) {
		String hql = "from GoodsCategoryChild where category_id = ?";
		return goodsCategoryChildDao.findByCategoryID(hql, goodsCategory.getId());
	}

}
