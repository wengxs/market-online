package com.market.service;

import java.util.List;

import com.market.bean.Goods;
import com.market.bean.GoodsImg;

public interface GoodsImgService {
	// add
	public void addGoodsImg(GoodsImg goodsImg, Goods goods) throws Exception;

	// remove
	public void removeGoodsImg(GoodsImg goodsImg);

	// update
	public void updateGoodsImg(GoodsImg goodsImg);

	// getOne
	public GoodsImg getGoodsImg(int goodsImgID);

	// listAllByObject
	public List<GoodsImg> listGoodsImgByGoods(Goods goods);
}
