package com.market.service.impl;

import java.util.List;

import com.market.bean.Goods;
import com.market.bean.GoodsCategoryChild;
import com.market.dao.GoodsDao;
import com.market.service.GoodsCommentService;
import com.market.service.GoodsImgService;
import com.market.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	
	private GoodsDao goodsDao;
	private GoodsImgService goodsImgService;
	private GoodsCommentService goodsCommentService;

	public GoodsServiceImpl(GoodsDao goodsDao, GoodsImgService goodsImgService, GoodsCommentService goodsCommentService) {
		this.goodsDao = goodsDao;
		this.goodsImgService = goodsImgService;
		this.goodsCommentService = goodsCommentService;
	}

	public void addGoods(Goods goods, GoodsCategoryChild goodsCategoryChild) throws Exception {
		goods.setCategoryChild(goodsCategoryChild);
		goodsDao.save(goods);
	}

	public void removeGoods(Goods goods) {
		goodsDao.delete(goods);
	}

	public void updateGoods(Goods goods) {
		goodsDao.update(goods);
	}

	public Goods getGoods(int goodsID) {
		Goods goods = goodsDao.findGoods("from Goods where id=?", goodsID);
		goods.setListGoodsImg(goodsImgService.listGoodsImgByGoods(goods));
		goods.setListGoodsComment(goodsCommentService.listGoodsCommentByGoods(goods));
		return goods;
	}
	
	public List<Goods> getHot() {
		String hql = "from Goods order by sale_count desc";
		return goodsDao.find(hql);
	}
	
	public List<Goods> getTop() {
		String hql = "from Goods where is_top='Y' order by sale_count desc";
		return goodsDao.find(hql);
	}

	public List<Goods> listGoodsByCategory(GoodsCategoryChild goodsCategoryChild) {
		String hql = "from Goods where category_id=?";
		List<Goods> listGoods = goodsDao.findByCategoryID(hql, goodsCategoryChild.getId());
		for(Goods goods : listGoods) {
			goods.setListGoodsImg(goodsImgService.listGoodsImgByGoods(goods));
			goods.setListGoodsComment(goodsCommentService.listGoodsCommentByGoods(goods));
		}
		return listGoods;
	}

}
