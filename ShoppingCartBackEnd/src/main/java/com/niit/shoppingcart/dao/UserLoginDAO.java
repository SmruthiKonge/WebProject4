package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.niit.shoppingcart.model.UserDetails;
import com.niit.shoppingcart.model.UserLogin;


public interface UserLoginDAO {
	void saveOrUpdate(UserLogin userLogin);

	void delete(String id);

	UserLogin get(String id);
	
	
	
	boolean isValidUser(String userId,String password);

	public List<UserLogin> list();

}
