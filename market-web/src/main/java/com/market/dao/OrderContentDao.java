package com.market.dao;

import java.util.List;

import com.market.bean.OrderContent;

public interface OrderContentDao {
	// 持久化对象
	public void save(OrderContent orderContent);

	// 删除
	public void delete(OrderContent orderContent);

	// 更新
	public void update(OrderContent orderContent);

	// 查询
	public List<OrderContent> find(String hql, Object... params);

	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
