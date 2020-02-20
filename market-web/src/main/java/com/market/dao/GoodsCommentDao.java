package com.market.dao;

import java.util.List;

import com.market.bean.GoodsComment;

public interface GoodsCommentDao {
	// 持久化“GoodsComment”对象
	public void save(GoodsComment goodsComment);
	// 删除
	public void delete(GoodsComment goodsComment);
	// 更新
	public void update(GoodsComment goodsComment);
	// 查询所有
	public List<GoodsComment> findAll();
	// 根据外键ID查询
	public List<GoodsComment> findByGoodsID(String hql, int goodsID);
	// 获取一个
	public GoodsComment findGoodsComment(String hql, Object...params);
	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
