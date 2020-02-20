package com.market.service.impl;

import java.util.List;

import com.market.bean.OrderStatus;
import com.market.dao.OrderStatusDao;
import com.market.service.OrderStatusService;

public class OrderStatusServiceImpl implements OrderStatusService {

	private OrderStatusDao orderStatusDao;

	public OrderStatusServiceImpl(OrderStatusDao orderStatusDao) {
		this.orderStatusDao = orderStatusDao;
	}

	public void addOrderStatus(OrderStatus orderStatus) throws Exception {
		orderStatusDao.save(orderStatus);
	}

	public void removeOrderStatus(OrderStatus orderStatus) {
		orderStatusDao.delete(orderStatus);
	}

	public void updateOrderStatus(OrderStatus orderStatus) {
		orderStatusDao.update(orderStatus);
	}

	public OrderStatus getOrderStatus(int orderstatusID) {
		String hql = "from OrderStatus where id = ?";
		List<OrderStatus> list =  orderStatusDao.find(hql, orderstatusID);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

	public List<OrderStatus> listOrderStatus() {
		return orderStatusDao.find("from OrderStatus");
	}

}
