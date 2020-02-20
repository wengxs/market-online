package com.market.bean;

import java.util.Date;

public class GoodsComment {
	private int id;			// 编号
	private Goods goods;	// 商品对象实例
	private User user;		// 用户对象实例
	private String content;	// 评价内容
	private Date postTime;	// 评价时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
}
