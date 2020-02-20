package com.market.bean;

import java.util.HashSet;
import java.util.Set;

public class OrderStatus {
	private int id;			// 编号
	private String status;	// 订单状态
	private Set orders = new HashSet(0);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set getOrders() {
		return orders;
	}
	public void setOrders(Set orders) {
		this.orders = orders;
	}
}
