package com.niit.shoppingcart.test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class TestCategoryDAO {
	@Autowired
	static CategoryDAO categoryDAO;
	
	@Autowired
	static Category category;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		category = (Category) context.getBean("category");
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Test
	public void CategoryTestCase()
	{
		int size = categoryDAO.listCategory().size();
		
		assertEquals("category list test case",4,size);
		
	}
	
	@Test
	public void CategoryNameTest()
	{
		category = categoryDAO.get("CG121");
		String name= category.getName();
         assertEquals("category Name test case","CGName121",name);
	}
}
