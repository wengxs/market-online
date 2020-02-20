package com.market.service.impl;

import java.util.List;

import com.market.bean.User;
import com.market.dao.UserDao;
import com.market.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) throws Exception {
		if(userDao.exists(user)) {
			System.out.println("<" + user + ">已存在");
			throw new Exception("<" + user + ">已经存在！");
		}
		else {
			userDao.save(user);
		}
	}

	public void removeUser(User user) throws Exception {
		userDao.delete(user);
	}

	public void updateUser(User user) {
		userDao.update(user);
	}

	public User getUser(Object... params) {
		String hql ="from User where nickname=? or email=?";
		List<User>list = userDao.find(hql, params);
		if(list.size()>0)
			return list.get(0);
		return null;
	}
	
	public List<User> listUsers() {
		return userDao.find("from User");
	}

	public boolean verifyUser(User user) {
		String password = userDao.getPassword(user);
		boolean result = false;
		try {
			result = user.getPassword().equals(password)?true:false;
		} catch (Exception e) {
			
		}
		return result;
	}
	
}
