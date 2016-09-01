package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;

public class UserDetailsTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		UserDetails userDetails = (UserDetails)context.getBean("userDetails");
		
		UserDetailsDAO userDetailsDAO =(UserDetailsDAO)context.getBean("userDetailsDAO");
		
		userDetails.setUserId("usr005");
		userDetails.setUserName("Neha");
		//userDetails.setMobile();
		userDetails.setEmail("neha.k@gmail.com");
		userDetails.setPassword("smriti");
		
		userDetailsDAO.saveOrUpdate(userDetails);
		
		System.out.println(userDetailsDAO.listUsers());
	}
}
