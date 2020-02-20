package com.market.service;

import java.util.List;
import com.market.bean.Cart;
import com.market.bean.Order;
import com.market.bean.OrderContent;

public interface OrderContentService {
	// add
	public void addOrderContent(Cart cart, Order order)	throws Exception;

	// remove
	public void removeOrderContent(OrderContent orderContent);

	// update
	public void updateOrderContent(OrderContent orderContent);

	// getOne
	public OrderContent getOrderContent(int orderContentID);

	// listAllByObject
	public List<OrderContent> listOrderContentByOrder(Order order);
}
