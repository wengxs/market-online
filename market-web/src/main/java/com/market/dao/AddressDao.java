package com.market.dao;

import java.util.List;

import com.market.bean.Address;

public interface AddressDao {
	// 持久化对象
	public void save(Address address);
	// 删除
	public void delete(Address address);
	// 更新
	public void update(Address address);
	// 查询所有
	public List<Address> findAll();
	// 根据外键ID查询
	public List<Address> findByUserID(String hql, int userID);
	// 获取一个
	public Address findAddress(String hql, Object...params);
	// 执行不返回数据的hql语句，如 update、delete 等
	public void execute(final String hql, final Object... params);
}
