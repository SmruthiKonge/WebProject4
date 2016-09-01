package com.niit.shoppingcart.test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class TestProductDAO {
	@Autowired
	static ProductDAO productDAO;
	
	@Autowired
	static Product product;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		product = (Product) context.getBean("product");
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	
	@Test
	public void ProductTestCase()
	{
		int size = productDAO.listProduct().size();
		
		assertEquals("product list test case",4,size);
		
	}
	
	@Test
	public void ProductNameTest()
	{
		product = productDAO.get("PROD101");
		String name= product.getName();
         assertEquals("product Name test case","Mobile",name);
	}
}
