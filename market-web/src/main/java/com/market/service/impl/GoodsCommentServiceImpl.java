package com.market.service.impl;

import java.util.List;

import com.market.bean.Goods;
import com.market.bean.GoodsComment;
import com.market.dao.GoodsCommentDao;
import com.market.service.GoodsCommentService;

public class GoodsCommentServiceImpl implements GoodsCommentService {

	private GoodsCommentDao goodsCommentDao;

	public GoodsCommentServiceImpl(GoodsCommentDao goodsCommentDao) {
		this.goodsCommentDao = goodsCommentDao;
	}

	public void addGoodsComment(GoodsComment goodsComment, Goods goods)
			throws Exception {
		goodsComment.setGoods(goods);
		goodsCommentDao.save(goodsComment);
	}

	public void removeGoodsComment(GoodsComment goodsComment) {
		goodsCommentDao.delete(goodsComment);
	}

	public void updateGoodsComment(GoodsComment goodsComment) {
		goodsCommentDao.update(goodsComment);
	}

	public GoodsComment getGoodsComment(int goodsCommentID) {
		String hql = "from GoodsComment where id=?";
		return goodsCommentDao.findGoodsComment(hql, goodsCommentID);
	}

	public List<GoodsComment> listGoodsCommentByGoods(Goods goods) {
		String hql = "from GoodsComment where goods_id=?";
		return goodsCommentDao.findByGoodsID(hql, goods.getId());
	}

}
