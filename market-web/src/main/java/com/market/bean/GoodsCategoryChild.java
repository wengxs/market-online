package com.market.bean;

import java.util.*;

//商品小类
public class GoodsCategoryChild {
	private int id;					// 编号
	private String name;			// 分类名称
	private GoodsCategory category;	// 大类对象实例
	private Set goods = new HashSet<Goods>(0);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GoodsCategory getCategory() {
		return category;
	}
	public void setCategory(GoodsCategory category) {
		this.category = category;
	}
	public Set getGoods() {
		return goods;
	}
	public void setGoods(Set goods) {
		this.goods = goods;
	}
}
