package com.waiyanhtet.java.service;

public interface UserService {
	
	User createUser(String name, String phone, String email);
	void deleteUser(String name);
}
