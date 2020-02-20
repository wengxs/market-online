package com.market.service;

import java.util.List;

import com.market.bean.Goods;
import com.market.bean.GoodsComment;

public interface GoodsCommentService {
	// add
	public void addGoodsComment(GoodsComment goodsComment, Goods goods) throws Exception;

	// remove
	public void removeGoodsComment(GoodsComment goodsComment);

	// update
	public void updateGoodsComment(GoodsComment goodsComment);

	// getOne
	public GoodsComment getGoodsComment(int goodsCommentID);

	// listAllByObject
	public List<GoodsComment> listGoodsCommentByGoods(Goods goods);
}
