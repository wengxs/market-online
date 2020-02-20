package com.market.action;

import com.market.bean.User;
import com.market.service.UserService;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends BaseAction implements ModelDriven<User> {

	User user = new User();
	public User getModel() {
		return user;
	}
	private UserService userService ;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 用户登录
	public String login() {
		//System.out.println(this.request.getParameter("password"));//this.getText("password"));
		if(userService.verifyUser(user)) {
			User currentUser = userService.getUser(user.getEmail(), user.getEmail());
			request.getSession().setAttribute("currentUser", currentUser);
			return SUCCESS;
		}
		else
			return INPUT;
	}
	
	// 用户注册
	public String regist() {
		try {
			userService.addUser(user);
			request.getSession().setAttribute("currentUser", user);
			return SUCCESS;
		} catch(Exception e) {
			e.getMessage();
			return ERROR;
		}
	}
	
	// 用户登录
	public String logout() {
		request.getSession().setAttribute("currentUser", null);
		return SUCCESS;
	}
}
