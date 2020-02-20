package com.market.action;

import java.util.List;

import com.market.bean.Goods;
import com.market.bean.GoodsCategoryChild;
import com.market.bean.GoodsImg;
import com.market.service.GoodsCategoryChildService;
import com.market.service.GoodsImgService;
import com.market.service.GoodsService;
import com.opensymphony.xwork2.ModelDriven;

public class GoodsAction extends BaseAction implements ModelDriven<Goods>  {

	private Goods goods = new Goods();
	public Goods getModel() {
		return null;
	}

	private Goods singleGoods;
	private GoodsCategoryChild goodsCategoryChild;
	private GoodsService goodsService;
	private GoodsCategoryChildService goodsCategoryChildService;
	public GoodsCategoryChild getGoodsCategoryChild() {
		return goodsCategoryChild;
	}
	public void setGoodsCategoryChild(GoodsCategoryChild goodsCategoryChild) {
		this.goodsCategoryChild = goodsCategoryChild;
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
	
	public Goods getSingleGoods() {
		return singleGoods;
	}
	public void setSingleGoods(Goods singleGoods) {
		this.singleGoods = singleGoods;
	}

	private List<Goods> listGoods;
	public List<Goods> getListGoods() {
		return listGoods;
	}
	public void setListGoods(List<Goods> listGoods) {
		this.listGoods = listGoods;
	}
	
	// 根据分类获取商品列表
	public String showByCategory() {
		try {
			String s;
			Integer gategory_id = Integer.parseInt(request.getParameter("category"));
			goodsCategoryChild = goodsCategoryChildService.getGoodsCategoryChild(gategory_id);
			listGoods = goodsService.listGoodsByCategory(getGoodsCategoryChild());
			return SUCCESS;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return ERROR;
		}
	}
	
	// 查看单个商品
	public String showGoods() {
		try {
			int id = Integer.parseInt(request.getParameter("gid"));
			Goods goodsTemp = goodsService.getGoods(id);
			setSingleGoods(goodsTemp);
			
			return SUCCESS;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return ERROR;
		}
	}
	
	private List<Goods> hot;
	public List<Goods> getHot(){
		return hot;
	}
	// 热销
	public String hot() {
		hot = goodsService.getHot();
		return "hot";
	}
	
	private List<Goods> top;
	public List<Goods> getTop(){
		return top;
	}
	// 精品
	public String top() {
		top = goodsService.getTop();
		return "top";
	}
}
