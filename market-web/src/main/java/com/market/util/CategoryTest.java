package com.market.util;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.market.bean.GoodsCategory;
import com.market.bean.GoodsCategoryChild;
import com.market.service.GoodsCategoryChildService;
import com.market.service.GoodsCategoryService;

public class CategoryTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		GoodsCategoryService dao = (GoodsCategoryService) context.getBean("goodsCategoryService");
//		List<GoodsCategory> li = dao.listCategoryes();
//		for(int i =0; i<li.size(); i++){
//			GoodsCategory gc  = li.get(i);
//			System.out.println(gc.getName());
//		}
//		System.out.println("结束");
		
		GoodsCategoryService goodsCategoryService = (GoodsCategoryService) context.getBean("goodsCategoryService");
		GoodsCategoryChildService goodsCategoryChildService = (GoodsCategoryChildService) context.getBean("goodsCategoryChildService");
		
		List<GoodsCategory> list_GoodsCategory = goodsCategoryService.listCategoryes();
		
		for(GoodsCategory menu: list_GoodsCategory){
			//menu.setSubmenu(goodsCategoryChildService.listCategoryes(menu));
		}
		
		for(GoodsCategory menu: list_GoodsCategory){
			for(GoodsCategoryChild submenu: menu.getSubmenu()){
				System.out.println(submenu.getName());
			}
			System.out.println();
		}
		
		GoodsCategoryChild goodsCategoryChild = goodsCategoryChildService.getGoodsCategoryChild(8);
		System.out.println(goodsCategoryChild.getName());
	}
}
