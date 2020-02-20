package com.market.service;

import java.util.List;

import com.market.bean.User;

public interface UserService {
	// add
	public void addUser(User user) throws Exception;

	// remove
	public void removeUser(User user) throws Exception;

	// update
	public void updateUser(User user);

	// getOne
	public User getUser(Object... params);

	// listAll
	public List<User> listUsers();

	// verifyUser
	public boolean verifyUser(User user);
}
