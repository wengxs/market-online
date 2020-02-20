package com.market.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.market.bean.Address;
import com.market.bean.Cart;
import com.market.bean.Goods;
import com.market.bean.Order;
import com.market.bean.OrderContent;
import com.market.bean.User;
import com.market.dao.GoodsDao;
import com.market.dao.OrderContentDao;
import com.market.dao.OrderDao;
import com.market.service.OrderService;

public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao;
	private OrderContentDao orderContentDao;
	private GoodsDao goodsDao;

	public OrderServiceImpl(OrderDao orderDao, OrderContentDao orderContentDao, GoodsDao goodsDao) {
		this.orderDao = orderDao;
		this.orderContentDao = orderContentDao;
		this.goodsDao = goodsDao;
	}

	public void addOrder(Cart cart, User user, Address address) throws Exception {
		Order order = new Order();
		order.setUser(user);
		order.setAddress(address);
		order.setTotal(cart.getSubtotal());
		orderDao.save(order);
		Map<Integer, Goods> cartMap = cart.getMapCart();
		for(Integer key : cartMap.keySet()){
			OrderContent oc = new OrderContent();
			oc.setOrder(order);
			Goods goods = cartMap.get(key);
			oc.setGoods(goods);
			oc.setNumber(goods.getNumber());
			oc.setPrice(goods.getPrice());
			oc.setSubtotal();
			orderContentDao.save(oc);
			goodsDao.execute("update Goods set sale_count=sale_count+?, stock=stock-? where id=?", goods.getNumber(), goods.getNumber(), goods.getId());
		}
		orderDao.execute("update Order set status_id=? where id=?", 1, order.getId());
		System.out.println("下单成功");
	}

	public void removeOrder(Order order) {
		orderDao.delete(order);
	}

	public void updateOrder(Order order) {
		orderDao.execute("update Order set status_id=? where id=?", order.getOrderStatus().getId(),order.getId());
	}

	public Order getOrder(int orderID) {
		String hql = "from Order where id=?";
		List<Order> list = orderDao.find(hql, orderID);
		if(list.size()>0)
			return list.get(0);
		return null;
	}

	public List<Order> listOrderByUser(User user) {
		String hql = "from Order where user_id=? order by orderTime desc";
		return orderDao.find(hql, user.getId());
	}

}
