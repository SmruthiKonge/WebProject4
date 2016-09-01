package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserLoginDAO;
import com.niit.shoppingcart.model.UserLogin;

public class UserLoginTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		UserLoginDAO userLoginDAO = (UserLoginDAO) context.getBean("userLoginDAO");

		UserLogin userLogin = (UserLogin) context.getBean("userLogin");
		userLogin.setUserId("usr004");
		userLogin.setUserName("abc");
		userLogin.setEmail("abc@gmail.com");
		userLogin.setMobile("9876543210");
		userLogin.setAddress("delhi");
		userLogin.setPassword("abc");

		// test case for insert or updating user

		userLoginDAO.saveOrUpdate(userLogin);

		// Test case for get user

		/*if (userLoginDAO.get("usr004") != null) {
			System.out.println("USer Exist");
		} else {
			System.out.println("User doesnt Exist");
		}*/

		// Test case for delete user

		//userLoginDAO.delete("002");
		
		
	}

}