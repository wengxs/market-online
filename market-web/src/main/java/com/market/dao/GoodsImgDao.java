package com.market.dao;

import java.util.List;

import com.market.bean.GoodsImg;

public interface GoodsImgDao {
	// 持久化“GoodsImg”对象
	public void save(GoodsImg goodsImg);
	// 删除
	public void delete(GoodsImg goodsImg);
	// 更新
	public void update(GoodsImg goodsImg);
	// 查询所有
	public List<GoodsImg> findAll();
	// 根据外键ID查询
	public List<GoodsImg> findByGoodsID(String hql, int goodsID);
	// 获取一个
	public GoodsImg findGoodsImg(String hql, Object...params);
	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
