package com.market.service;

import java.util.List;

import com.market.bean.Address;
import com.market.bean.Cart;
import com.market.bean.Order;
import com.market.bean.User;

public interface OrderService {
	// add
	public void addOrder(Cart cart, User user, Address address) throws Exception;

	// remove
	public void removeOrder(Order order);

	// update
	public void updateOrder(Order order);

	// getOne
	public Order getOrder(int orderID);

	// listAllByObject
	public List<Order> listOrderByUser(User user);
}
