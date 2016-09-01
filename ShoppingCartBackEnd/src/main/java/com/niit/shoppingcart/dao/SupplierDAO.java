package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {

	void saveOrUpdate(Supplier supplier);

	void delete(String id);

	Supplier get(String id);
	
	public List<Supplier> listSupplier();

	Supplier getByName(String name);
}