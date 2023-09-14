package com.tencoding.bank.repository.model;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private Timestamp createdAt;
}
