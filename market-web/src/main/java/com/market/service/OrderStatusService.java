package com.market.service;

import java.util.List;

import com.market.bean.OrderStatus;

public interface OrderStatusService {
	// add
	public void addOrderStatus(OrderStatus orderStatus) throws Exception;

	// remove
	public void removeOrderStatus(OrderStatus orderStatus);

	// update
	public void updateOrderStatus(OrderStatus orderStatus);

	// getOne
	public OrderStatus getOrderStatus(int orderstatusID);

	// listAll
	public List<OrderStatus> listOrderStatus();
}
