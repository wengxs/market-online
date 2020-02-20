package com.market.bean;

import java.util.*;

//商品大类 
public class GoodsCategory {
	private int id;			// 编号
	private String name;	// 分类名称
	private Set submenu = new HashSet(0);
	
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
	public Set<GoodsCategoryChild> getSubmenu() {
		return submenu;
	}
	public void setSubmenu(Set<GoodsCategoryChild> submenu) {
		this.submenu = submenu;
	}
}
