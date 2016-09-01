package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.UserDetails;

public interface UserDetailsDAO {

	void saveOrUpdate(UserDetails userDetails);
	
	void delete(String userName);
	
	UserDetails get(String userName);
	
	List<UserDetails> listUsers();

	boolean isValidUser(String userID, String password);
}
