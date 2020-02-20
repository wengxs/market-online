package com.market.action;

import com.market.bean.Cart;
import com.market.bean.Goods;
import com.market.service.GoodsService;
import com.opensymphony.xwork2.ModelDriven;

public class CartAction extends BaseAction implements ModelDriven<Cart> {

	private Cart cart = new Cart();
	public Cart getModel() {
		return cart;
	}
	
	private GoodsService goodsService;
	//private 
	public GoodsService getGoodsService() {
		return goodsService;
	}

	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	public String addToCart(){
		try {
			Cart tempCart = (Cart) request.getSession().getAttribute("cart");
			if(tempCart==null)
				tempCart = new Cart();
			Integer number = Integer.parseInt(request.getParameter("number"));
			Integer goodsID = Integer.parseInt(request.getParameter("gid"));
			Goods goods = goodsService.getGoods(goodsID);
			goods.setNumber(number);
			goods.setSubtotal();
			tempCart.addToCart(goods);
			tempCart.getSubtotal();
			this.goodsID = goodsID;
			request.getSession().setAttribute("cart", tempCart);
			return SUCCESS;
		} catch(Exception e){
			System.out.println(e.getMessage());
			return ERROR;
		}
	}
	
	public String deleteFromCart() {
		try {
			Cart tempCart = (Cart) request.getSession().getAttribute("cart");
			Integer goodsID = Integer.parseInt(request.getParameter("gid"));
			//Goods goods = goodsService.getGoods(goodsID);
			//goods.setNumber(number);
			tempCart.delFormCart(goodsID);
			tempCart.getSubtotal();
			request.getSession().setAttribute("cart", tempCart);
			return SUCCESS;
		} catch(Exception e){
			System.out.println(e.getMessage());
			return ERROR;
		}
	}
	private int goodsID;
	public int getGoodsID() {
		return goodsID;
	}

	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}
	
}
