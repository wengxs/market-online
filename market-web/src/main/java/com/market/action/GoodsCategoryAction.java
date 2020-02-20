package com.market.action;

import com.market.bean.GoodsCategory;
import com.market.service.GoodsCategoryService;
import com.opensymphony.xwork2.ModelDriven;

public class GoodsCategoryAction extends BaseAction implements
		ModelDriven<GoodsCategory> {

	private GoodsCategory goodsCategory;
	public GoodsCategory getModel() {
		return null;
	}
	
	private GoodsCategoryService goodsCategoryService;
	public GoodsCategoryService getGoodsCategoryService() {
		return goodsCategoryService;
	}
	public void setGoodsCategoryService(GoodsCategoryService goodsCategoryService) {
		this.goodsCategoryService = goodsCategoryService;
	}
	
	//public String 
}
