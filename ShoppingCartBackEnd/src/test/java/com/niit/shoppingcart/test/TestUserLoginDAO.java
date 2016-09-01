package com.niit.shoppingcart.test;

import static org.junit.Assert.*;




import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserLoginDAO;
import com.niit.shoppingcart.model.UserDetails;

public class TestUserLoginDAO {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
	//beans:- UserDetails & UserDetailsDAO from context
	
	@Autowired
	static UserLoginDAO userLoginDAO;
	
	@Autowired
	static UserDetails userDetails;
	
	static AnnotationConfigApplicationContext context;

	
	//@Before will execute always before executing any test case
	//@BeforeClass will execute once
	@Before
	public void init()
	{
		System.out.println("Init method");
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userLoginDAO = (UserLoginDAO) context.getBean("userLoginDAO");
		userDetails = (UserDetails) context.getBean("userDetails");
		
	}
	
	public static void clos()
	{
		context.close();
		userLoginDAO = null;
		userDetails = null;
	}
	
	//select count(*) from user_details
	@Test
	public void UsersTestCase()
	{
		int size = userLoginDAO.list().size();
		
		assertEquals("User list test case",4,size);
		
	}
	
	
	//select name from User_Details where id = 'smriti'
	/*@Test
	public void UserNameTestCase()
	{
		
		userDetails = userLoginDAO.getUserName();
		String userName = userDetails.getUserName();
		
		assertEquals("Name test case", "smriti",userName);
	}*/
}
