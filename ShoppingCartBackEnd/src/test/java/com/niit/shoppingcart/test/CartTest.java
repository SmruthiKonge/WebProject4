package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;

public class CartTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		Cart cart = (Cart) context.getBean("cart");
		CartDAO cartDAO = (CartDAO) context.getBean("cartDAO");
		
		cart.setCartProductId("PROD104");
		cart.setCartProductName("Pendrive");
		cart.setCartProductUser("smriti");
		cart.setCartProductPrice(30000.00);
		
		cartDAO.saveOrUpdate(cart);
		
		System.out.println(cartDAO.listCartItems());
	}
}
