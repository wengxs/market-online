package com.market.action;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.market.bean.GoodsCategory;
import com.market.service.GoodsCategoryChildService;
import com.market.service.GoodsCategoryService;

public class InitAction implements ServletContextListener,ApplicationContextAware {

	private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		
	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		ServletContext application=servletContextEvent.getServletContext();
		GoodsCategoryService goodsCategoryService = (GoodsCategoryService) applicationContext.getBean("goodsCategoryService");
		//GoodsCategoryChildService goodsCategoryChildService = (GoodsCategoryChildService) applicationContext.getBean("goodsCategoryChildService");
		
		List<GoodsCategory> list_GoodsCategory = goodsCategoryService.listCategoryes();
		
		/*for(GoodsCategory menu: list_GoodsCategory){
			menu.setSubmenu(goodsCategoryChildService.listCategoryes(menu));
		}*/
		
		application.setAttribute("menu", list_GoodsCategory);
	}
//	public static void main(String[] args) {
//		InitAction initAction = new InitAction();
//		ServletContext application=initAction.servletContextEvent.getServletContext();
//		GoodsCategoryService goodsCategoryService = (GoodsCategoryService) applicationContext.getBean("goodsCategoryService");
//		GoodsCategoryChildService goodsCategoryChildService = (GoodsCategoryChildService) applicationContext.getBean("goodsCategoryChildService");
//		
//		List<GoodsCategory> list_GoodsCategory = goodsCategoryService.listCategoryes();
//		
//		for(GoodsCategory menu: list_GoodsCategory){
//			menu.setSubmenu(goodsCategoryChildService.listCategoryes(menu));
//		}
//		
//		application.setAttribute("menu", list_GoodsCategory);
//	}
}
