package com.market.bean;

public class GoodsImg {
	private int id;			// 编号
	private Goods goods;	// 商品对象实例
	private String path;	// 图片路径
	
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
