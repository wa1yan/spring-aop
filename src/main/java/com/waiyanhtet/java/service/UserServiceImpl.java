package com.waiyanhtet.java.service;

public class UserServiceImpl implements UserService {

	@Override
	public User createUser(String name, String phone, String email) {
		var user = new User(name, phone, email);
		System.out.println("User creation sucessful for " + user.getName());
		return user;
	}
	
	@Override
	public void deleteUser(String name) {
		System.out.println("User deletion succesful.");
	}
	

}
