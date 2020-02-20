package com.market.dao;

import java.util.List;

import com.market.bean.OrderStatus;

public interface OrderStatusDao {
	// 持久化对象
	public void save(OrderStatus orderStatus);

	// 删除
	public void delete(OrderStatus orderStatus);

	// 更新
	public void update(OrderStatus orderStatus);

	// 查询
	public List<OrderStatus> find(String hql, Object...params);

	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
