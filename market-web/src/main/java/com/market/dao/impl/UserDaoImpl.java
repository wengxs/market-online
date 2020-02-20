package com.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.market.bean.User;
import com.market.dao.UserDao;

public class UserDaoImpl extends DAOSupport implements UserDao {

	public UserDaoImpl(HibernateTemplate template) {
		super(template);
	}

	public void save(User user) {
		// 保存对象
		template.save(user);
	}

	public boolean exists(User user) {
		// 根据是否成功返回密码来判断用户是否存在
		// 能查到密码则表示用户存在
		return (getPassword(user) != null)?true:false;
	}

	public void delete(User user) {
		template.delete(user);
	}

	public void update(User user) {
		template.update(user);
	}

//	public User find(String hql, Object... params) {
//		try {
//			return (User) template.find(hql, params).get(0);
//		}catch(Exception e) {
//			return null;
//		}
//	}

	public List<User> find(String hql, Object... params) {
		return template.find(hql, params);
	}
	
	public void execute(String hql, Object... params) {
		template.bulkUpdate(hql, params);
	}

	public String getPassword(User user) {
		// 实现getPasswordMD5方法
		String hql = "select password from User where nickname = ? or email = ?";
		List<String> password = template.find(hql, user.getEmail(), user.getEmail());
		if(password.size() > 0){
			return password.get(0);
		}
		return null;
	}

}
