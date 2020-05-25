package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class Assignment2Login extends TestBase
{
	
	public Assignment2Login()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	
	@DataProvider
	public Object[][] getLoginTestData()
	{
	Object data[][] =TestUtil.getTestData(sheetName);
	return data;
	}
	
	
	LoginPage loginpage= new LoginPage();
	
	@Test(dataProvider="getLoginTestData")
	
	public void ValidateLoginTestdata( String UserName, String Password)
	{
		
		loginpage.TestLogin(UserName, Password);
		
	}
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	

}
