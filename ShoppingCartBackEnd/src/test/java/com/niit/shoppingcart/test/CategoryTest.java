package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		Category category = (Category) context.getBean("category");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
		category.setId("CG123");
		category.setName("CGName123");
		category.setDescription("This is Category");
		
		categoryDAO.saveOrUpdate(category);
		
		System.out.println(categoryDAO.listCategory());
		/*if(categoryDAO.get("cat-004")!=null)
		{
			System.out.println("Category Exist");
		}
		else{
			System.out.println("Category doesnt exist");
		}
		
		categoryDAO.delete("cat-003");*/
		
		
	}

}
