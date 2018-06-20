package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDetailDAO;
import com.niit.model.UserDetail;

public class UserDetailDAOTestCase 
{
	/*static UserDetailDAO userDetailDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		userDetailDAO=(UserDetailDAO)context.getBean("userDetailDAO");
	}
	
	/*@Test
	public void registerUserTest()
	{
		UserDetail userDetail=new UserDetail();
		
		userDetail.setLoginname("lavanya");
		userDetail.setPassword("lavanya123");
		userDetail.setUserName("lavanya");
		userDetail.setEmailId("lavanya@gmail.com");
		userDetail.setAddress("hyderabad");
		userDetail.setMobileNo("9774448890");
		userDetail.setRole("ROLE_USER");
		
		assertTrue("Problem in Registering User",userDetailDAO.registerUser(userDetail));
	}*/
	
	/*@Test
	public void checkUserTest()
	{
		UserDetail userDetail=new UserDetail();
		userDetail.setLoginname("srinivas");
		userDetail.setPassword("srinivas123");
		
		assertTrue("Problem in Login Process:",userDetailDAO.checkCredential(userDetail));
		
	}*/
	
	/*@Test 
	public void getUserTest()
	{
		assertNotNull("Problem in Accessing a User",userDetailDAO.getUser("srinivas"));
	}*/
}
