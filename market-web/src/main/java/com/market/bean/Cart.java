package com.market.bean;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private HashMap<Integer, Goods> mapCart = new HashMap<Integer, Goods>();
	private double subtotal = 0.00;
	private double total;

	public Map<Integer, Goods> getMapCart(){
		return this.mapCart;
	}

	public void addToCart(Goods goods){
		//添加一个商品到购物车
		if(mapCart.get(goods.getId()) == null) {
			this.mapCart.put(goods.getId(), goods);
		}
		else{
			// 否，修改数量
			Goods temp = mapCart.get(goods.getId());
			temp.setNumber(temp.getNumber()+goods.getNumber());
			this.mapCart.put(temp.getId(), temp);
		}
	}
	
	public void delFormCart(int goodsID){
		mapCart.remove(goodsID);
	}
	
	public void upSetCart(Goods goods, int number){
		goods.setNumber(number);
		this.mapCart.put(goods.getId(), goods);
	}
//	public void setSubtotal() {
//		for(Goods goods : mapCart.values()) {
//			subtotal = goods.getPrice() * goods.getNumber();
//		}
//	}
	public double getSubtotal() {
		subtotal = 0.0;
		for(Goods goods : mapCart.values()) {
			subtotal += goods.getPrice() * goods.getNumber();
		}
		return subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
