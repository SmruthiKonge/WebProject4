package com.niit.shoppingcart.dao;

import java.util.List;



import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

public interface CategoryDAO {

	void saveOrUpdate(Category category);
	
	void delete(String id);
	
	Category get(String id);
	
	public List<Category> listCategory();
	
	List<Product> selectedCatProdList(String id);
	
	int getProductsByCategory(String id);

	Category getByName(String name);
}
