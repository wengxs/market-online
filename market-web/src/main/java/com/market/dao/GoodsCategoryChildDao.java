package com.market.dao;

import java.util.List;

import com.market.bean.GoodsCategoryChild;

public interface GoodsCategoryChildDao {
	// 持久化“GoodsCategoryChild”对象
	public void save(GoodsCategoryChild goodsCategoryChild);
	// 删除
	public void delete(GoodsCategoryChild goodsCategoryChild);
	// 更新
	public void update(GoodsCategoryChild goodsCategoryChild);
	// 返回hql语句查询到的数据
	public List<GoodsCategoryChild> findByCategoryID(String hql, int categoryID);
	// 返回hql语句查询到的数据
	public List<GoodsCategoryChild> findAll();
	// 获取一个
	public GoodsCategoryChild find(String hql, Object...params);
	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
