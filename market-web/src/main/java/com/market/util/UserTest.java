package com.market.util;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.market.bean.Address;
import com.market.bean.User;
import com.market.dao.UserDao;
import com.market.service.AddressService;
import com.market.service.UserService;
import com.market.service.impl.ServiceManager;

public class UserTest {
	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//AddressService add = (AddressService) context.getBean("addressService");
		
//		UserService user = (UserService) context.getBean("userService");
//		UserDao userDao = (UserDao) context.getBean("userDao");
//		User u = user.getUser("sol");
//		if(u!=null){
//			System.out.println(u.getRealname());
//			List<Address> list = add.listAddressByUser(u);
//			for(int i = 0; i<list.size(); i++){
//				Address address = list.get(i);
//				System.out.println(address.getAddressee());
//			}
//		}
//		User user1 = new User();
//		user1.setNickname("sol");
//		user1.setEmail("754543850@qq.com");
//		String password = userDao.getPassword(user1);
//		System.out.println(password);
//		
//		ServiceManager sm = (ServiceManager) context.getBean("serviceManager");
//		User user2 = sm.getUserService().getUser("sol");
//		User user3 = new User();
//		user2.setQq("754543850");
//		System.out.println(user2.getEmail());
//		sm.getUserService().updateUser(user2);
		
		
		/*Set<User> u1 = null;
		u1.add(user2);
		List<User> u2 = null;
		u2=(List<User>) u1;*/
		
		Integer q = 100;
		Integer w = 100;
		System.out.println(q==w);
	}
	
}
