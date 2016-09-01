package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		Supplier supplier = (Supplier) context.getBean("supplier");

		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");

		supplier.setSupId("sup105");
		supplier.setSupName("ijk");
		supplier.setSupContact("9876543");
		supplier.setSupAddress("Hydearbad");
		supplier.setSupEmail("ijk@gmail.com");
		
		supplierDAO.saveOrUpdate(supplier);

/*		if (supplierDAO.get("SUP105") != null)
			System.out.println("Supplier Exist");
		else
		System.out.println("Supplier not Exist ");

		
			 //supplierDAO.delete("SUP-001");
*/		 
		 System.out.println(supplierDAO.listSupplier());
		 
	}

}
