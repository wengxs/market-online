package com.market.service.impl;

import com.market.service.*;

public class ServiceManager {
	private UserService userService;
	private AddressService addressService;
	private GoodsCategoryService goodsCategoryService;
	private GoodsCategoryChildService goodsCategoryChildService;
	private GoodsService goodsService;
	private GoodsImgService goodsImgService;
	private GoodsCommentService goodsCommentService;
	private OrderStatusService orderStatusService;
	private OrderService orderService;
	private OrderContentService orderContentService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public AddressService getAddressService() {
		return addressService;
	}
	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}
	public GoodsCategoryService getGoodsCategoryService() {
		return goodsCategoryService;
	}
	public void setGoodsCategoryService(GoodsCategoryService goodsCategoryService) {
		this.goodsCategoryService = goodsCategoryService;
	}
	public GoodsCategoryChildService getGoodsCategoryChildService() {
		return goodsCategoryChildService;
	}
	public void setGoodsCategoryChildService(
			GoodsCategoryChildService goodsCategoryChildService) {
		this.goodsCategoryChildService = goodsCategoryChildService;
	}
	public GoodsService getGoodsService() {
		return goodsService;
	}
	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	public GoodsImgService getGoodsImgService() {
		return goodsImgService;
	}
	public void setGoodsImgService(GoodsImgService goodsImgService) {
		this.goodsImgService = goodsImgService;
	}
	public GoodsCommentService getGoodsCommentService() {
		return goodsCommentService;
	}
	public void setGoodsCommentService(GoodsCommentService goodsCommentService) {
		this.goodsCommentService = goodsCommentService;
	}
	public OrderStatusService getOrderStatusService() {
		return orderStatusService;
	}
	public void setOrderStatusService(OrderStatusService orderStatusService) {
		this.orderStatusService = orderStatusService;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public OrderContentService getOrderContentService() {
		return orderContentService;
	}
	public void setOrderContentService(OrderContentService orderContentService) {
		this.orderContentService = orderContentService;
	}
}
