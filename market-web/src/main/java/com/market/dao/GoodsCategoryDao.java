package com.market.dao;

import java.util.List;

import com.market.bean.GoodsCategory;

public interface GoodsCategoryDao {
	// 持久化“GoodsCategory”对象
	public void save(GoodsCategory goodsCategory);
	// 删除
	public void delete(GoodsCategory goodsCategory);
	// 更新
	public void update(GoodsCategory goodsCategory);
	// 返回hql语句查询到的数据
	public GoodsCategory find(String hql, Object... params);
	// 返回hql语句查询到的数据
	public List<GoodsCategory> findAll();
	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
