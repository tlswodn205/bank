package com.tencoding.bank.repository.interfaces;

import java.util.List;

import com.tencoding.bank.repository.model.Account;

public interface AccountRepository {
	public int insert(Account account);
	public int updateById(Account account);
	public int deleteById(Integer id);
	public Account findById(Integer id);
	public List<Account> findAll();
	
	public List<Account> findByUserID(Integer PrincipalId);
}
