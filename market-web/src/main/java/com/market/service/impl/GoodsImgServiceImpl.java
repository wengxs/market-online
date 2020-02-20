package com.market.service.impl;

import java.util.List;

import com.market.bean.Goods;
import com.market.bean.GoodsImg;
import com.market.dao.GoodsImgDao;
import com.market.service.GoodsImgService;

public class GoodsImgServiceImpl implements GoodsImgService {

	private GoodsImgDao goodsImgDao;

	public GoodsImgServiceImpl(GoodsImgDao goodsImgDao) {
		this.goodsImgDao = goodsImgDao;
	}

	public void addGoodsImg(GoodsImg goodsImg, Goods goods) throws Exception {
		goodsImg.setGoods(goods);
		goodsImgDao.save(goodsImg);
	}

	public void removeGoodsImg(GoodsImg goodsImg) {
		goodsImgDao.delete(goodsImg);
	}

	public void updateGoodsImg(GoodsImg goodsImg) {
		goodsImgDao.update(goodsImg);
	}

	public GoodsImg getGoodsImg(int goodsImgID) {
		return goodsImgDao.findGoodsImg("from GoodsImg where id=?", goodsImgID);
	}

	public List<GoodsImg> listGoodsImgByGoods(Goods goods) {
		String hql = "from GoodsImg where goods_id=?";
		return goodsImgDao.findByGoodsID(hql, goods.getId());
	}

}
