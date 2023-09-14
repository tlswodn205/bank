package com.tencoding.bank.repository.model;

import java.security.Timestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Account {
	private Integer id;
	private String number;
	private String password;
	private Long balance;
	private Integer userId;
	private Timestamp createdAt;
	
	public void withdraw(Long amount) {
		this.balance -= amount;
	}
	
	public void deposit(Long amount) {
		this.balance += amount;
	}
	// 패스워드 체크
	
	public void checkPassword(String password) {
		if(password == this.password) {}
	}
	// 잔액 여부 확인
	
}
