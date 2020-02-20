package com.market.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Goods {
	private int id;									// 锟斤拷锟�
	private String name;							// 锟斤拷品锟斤拷锟�
	private GoodsCategoryChild categoryChild;	// 锟斤拷品锟斤拷锟斤拷锟斤拷锟绞碉拷锟�
	private String content;						// 锟斤拷品锟斤拷锟斤拷
	private double price;						// 锟斤拷品锟桔硷拷
	private int stock;								// 锟斤拷品锟斤拷锟�
	private boolean sell;						// 锟较硷拷锟斤拷锟�
	private Date saleTime;						// 锟较硷拷时锟斤拷
	private int saleCount;						// 锟斤拷锟斤拷锟斤拷锟斤拷
	private boolean top;						// 锟斤拷品锟狡硷拷
	
	private List<GoodsImg> listGoodsImg;						// 锟斤拷品图片
	private List<GoodsComment> listGoodsComment;	// 锟斤拷品锟斤拷锟斤拷
	private Set goodsImgs = new HashSet(0);			// 锟斤拷品图片
	private Set goodsComments = new HashSet(0);	// 锟斤拷品锟斤拷锟斤拷
	
	private int number = 1;
	private double subtotal = number * price;
	
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
	public GoodsCategoryChild getCategoryChild() {
		return categoryChild;
	}
	public void setCategoryChild(GoodsCategoryChild categoryChild) {
		this.categoryChild = categoryChild;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isSell() {
		return sell;
	}
	public void setSell(boolean sell) {
		this.sell = sell;
	}
	public Date getSaleTime() {
		return saleTime;
	}
	public void setSaleTime(Date saleTime) {
		this.saleTime = saleTime;
	}
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}
	public boolean isTop() {
		return top;
	}
	public void setTop(boolean top) {
		this.top = top;
	}
	public List<GoodsImg> getListGoodsImg() {
		return listGoodsImg;
	}
	public void setListGoodsImg(List<GoodsImg> listGoodsImg) {
		this.listGoodsImg = listGoodsImg;
	}
	public List<GoodsComment> getListGoodsComment() {
		return listGoodsComment;
	}
	public void setListGoodsComment(List<GoodsComment> listGoodsComment) {
		this.listGoodsComment = listGoodsComment;
	}
	public Set getGoodsImgs() {
		return goodsImgs;
	}
	public void setGoodsImgs(Set goodsImgs) {
		this.goodsImgs = goodsImgs;
	}
	public Set getGoodsComments() {
		return goodsComments;
	}
	public void setGoodsComments(Set goodsComments) {
		this.goodsComments = goodsComments;
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
	public void setSubtotal() {
		this.subtotal = this.number * this.price;
	}
}
