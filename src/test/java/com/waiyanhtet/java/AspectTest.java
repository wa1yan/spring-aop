package com.waiyanhtet.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.waiyanhtet.java.service.UserService;

@SpringJUnitConfig(locations = "classpath:/application.xml")
public class AspectTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	void test() {
		userService.createUser("William", "0948544783", "waiyan@gmail.com");
		
		System.out.println("========================");
		userService.deleteUser("William");
	}

}
