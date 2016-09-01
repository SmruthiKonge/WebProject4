package com.niit.shoppingcart.dao;

import java.util.List;



import com.niit.shoppingcart.model.Product;

public interface ProductDAO {

	@SuppressWarnings("rawtypes")
	void saveOrUpdate(Product product);
	
	void delete(String id);
	
	@SuppressWarnings("rawtypes")
	Product get(String id);
	
	@SuppressWarnings("rawtypes")
	List<Product> listProduct();
}