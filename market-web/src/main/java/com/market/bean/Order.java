package com.market.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
	private int id;								// 编号
	private User user;							// 用户对象实例
	private double total;					// 订单总价
	private Date orderTime;				// 下单时间
	private OrderStatus orderStatus;	// 订单状态
	private Address address;				// 收货地址
	
	private Set orderContent = new HashSet(0);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set getOrderContent() {
		return orderContent;
	}
	public void setOrderContent(Set orderContent) {
		this.orderContent = orderContent;
	}
}
