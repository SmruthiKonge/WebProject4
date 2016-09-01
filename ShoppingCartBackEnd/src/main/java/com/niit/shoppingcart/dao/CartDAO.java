package com.niit.shoppingcart.dao;

import java.util.List;



import com.niit.shoppingcart.model.Cart;

public interface CartDAO {

	void saveOrUpdate(Cart cart);
	
	void delete(String id);
	
	Cart get(String id);
	
	List<Cart> listCartItems();
}