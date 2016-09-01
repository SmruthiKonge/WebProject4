package com.niit.shoppingcart.test;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class TestSupplierDAO {
	@Autowired
	static SupplierDAO supplierDAO;
	
	@Autowired
	static Supplier supplier;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
    @BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		supplier = (Supplier) context.getBean("supplier");
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}
	
	@Test
	public void SupplierTestCase()
	{
		int size = supplierDAO.listSupplier().size();
		
		assertEquals("supplier list test case",5,size);
		
	}
	
	/*@Test
	public void SupplierNameTest()
	{
		supplier = supplierDAO.get("sup105");
		String name= supplier.getSupName();
         assertEquals("suppier Name test case","ijk",name);

	}*/
}
