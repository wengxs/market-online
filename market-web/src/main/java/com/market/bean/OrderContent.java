package com.market.bean;

public class OrderContent {
	private int id;					// 编号
	private Order order;			// 订单对象实例
	private Goods goods;		// 商品对象实例
	private double price;		// 商品单价
	private int number;			// 购买数量
	private double subtotal;	// 小计
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPrice() {
		this.price = this.goods.getPrice();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public void setSubtotal() {
		this.subtotal = this.price * this.number;
	}
}
