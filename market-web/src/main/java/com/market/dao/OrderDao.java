package com.market.dao;

import java.util.List;

import com.market.bean.Order;

public interface OrderDao {
	// 持久化对象
	public void save(Order order);

	// 删除
	public void delete(Order order);

	// 更新
	public void update(Order order);

	// 查询
	public List<Order> find(String hql, Object... params);

	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
