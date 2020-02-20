package com.market.dao;

import java.util.List;

import com.market.bean.User;

//设计接口 UserDao
public interface UserDao {
	// 持久化“User”对象
	public void save(User user);

	// 判断指定用户是否存在
	public boolean exists(User user);

	// 删除用户
	public void delete(User user);

	// 更新
	public void update(User user);

	// 查找
	public List<User> find(String hql, Object... params);

	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);

	// 返回指定用户的经加密的密码字符串，如果该用户不存在，则返回null
	public String getPassword(User user);
}
