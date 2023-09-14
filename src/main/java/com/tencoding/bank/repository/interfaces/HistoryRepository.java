package com.tencoding.bank.repository.interfaces;

import java.util.List;

import com.tencoding.bank.repository.model.History;

public interface HistoryRepository {
	public int insert(History history);
	public int updateById(History history);
	public int deleteById(Integer id);
	public History findById(Integer id);
	public List<History> findAll();
	

	public List<History> findByWAccountId(Integer wAccountId);
	public List<History> findByDAccountId(Integer dAccountId);
}
