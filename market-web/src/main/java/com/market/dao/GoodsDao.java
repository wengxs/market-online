package com.market.dao;

import java.util.List;

import com.market.bean.Goods;

public interface GoodsDao {
	// 持久化“Goods”对象
	public void save(Goods goods);
	// 删除
	public void delete(Goods goods);
	// 更新
	public void update(Goods goods);
	// 查询所有
	public List<Goods> findAll();
	// 查询
	public List<Goods> find(String hql, Object... params);
	// 根据外键ID查询
	public List<Goods> findByCategoryID(String hql, int categoryID);
	// 获取一个
	public Goods findGoods(String hql, Object...params);
	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
