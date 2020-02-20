package com.market.service.impl;

import java.util.List;
import java.util.Map;

import com.market.bean.Cart;
import com.market.bean.Goods;
import com.market.bean.Order;
import com.market.bean.OrderContent;
import com.market.dao.OrderContentDao;
import com.market.service.OrderContentService;

public class OrderContentServiceImpl implements OrderContentService {

	private OrderContentDao orderContentDao;

	public OrderContentServiceImpl(OrderContentDao orderContentDao) {
		this.orderContentDao = orderContentDao;
	}

	public void addOrderContent(Cart cart, Order order)
			throws Exception {
		Map cartMap = cart.getMapCart();// orderContent.setOrder(order);
		for(Goods goods : (List<Goods>)cartMap.values()) {
			//orderContentDao.save(cart.getMapCart().get(goods.getId()));
		}
	}

	public void removeOrderContent(OrderContent orderContent) {
		orderContentDao.delete(orderContent);
	}

	public void updateOrderContent(OrderContent orderContent) {
		orderContentDao.update(orderContent);
	}

	public OrderContent getOrderContent(int orderContentID) {
		String hql = "from OrderContent where id=?";
		List<OrderContent> list = orderContentDao.find(hql, orderContentID);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

	public List<OrderContent> listOrderContentByOrder(Order order) {
		String hql = "from OrderContent where order_id=?";
		return orderContentDao.find(hql, order.getId());
	}

}
