package com.market.util;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.market.bean.Goods;
import com.market.bean.GoodsCategoryChild;
import com.market.bean.GoodsImg;
import com.market.service.GoodsCategoryChildService;
import com.market.service.GoodsImgService;
import com.market.service.GoodsService;

public class GoodsTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsService goodsService = (GoodsService) context.getBean("goodsService");
		GoodsCategoryChildService goodsCategoryChildService = (GoodsCategoryChildService) context.getBean("goodsCategoryChildService");
		GoodsCategoryChild goodsCategoryChild = goodsCategoryChildService.getGoodsCategoryChild(8);
		//goodsCategoryChild.setId(8);
//		System.out.println(goodsCategoryChild.getName());
		//List<Goods> listGoods = goodsCategoryChild.getListGoods();
		//List<Goods> list = goodsService.listGoodsByCategory(goodsCategoryChild);
		/*System.out.println(listGoods.size());
		for(Goods goods:listGoods){
			System.out.println(goods.getName());
		}*/
		
		Goods g = new Goods();
		g.setName("智利樱桃1kg果径26-28mm 车厘子 进口新鲜水果");
		g.setPrice(119.00);
		g.setStock(7449);
		g.setSell(true);
		g.setContent("智利樱桃1kg果径26-28mm 车厘子 进口新鲜水果");
		g.setSaleTime(new Date());
		System.out.println(new Date());
		
		goodsService.addGoods(g, goodsCategoryChild);
		System.out.println("添加商品成功");
		g = goodsService.getGoods(10);
		
		GoodsImgService goodsImgService = (GoodsImgService) context.getBean("goodsImgService");
		List<GoodsImg> listImg = null;
		GoodsImg img = new GoodsImg();
		img.setGoods(g);
		img.setPath("img_goods/10_01.jpg");
		//listImg.add(img);
		goodsImgService.addGoodsImg(img, g);
		GoodsImg img2 = new GoodsImg();
		img2.setGoods(g);
		img2.setPath("img_goods/10_02.jpg");
		//listImg.add(img2);
		goodsImgService.addGoodsImg(img2, g);
		GoodsImg img3 = new GoodsImg();
		img3.setGoods(g);
		img3.setPath("img_goods/10_03.jpg");
		//listImg.add(img3);
		goodsImgService.addGoodsImg(img3, g);
		
		System.out.println("添加图片成功");
	}

}
