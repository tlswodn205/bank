package com.tencoding.bank.repository.interfaces;

import java.util.List;

import com.tencoding.bank.repository.model.User;

public interface UserRepository {
	public int insert(User user);
	public int updateById(User user);
	public int deleteById(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
}
