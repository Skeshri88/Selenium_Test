package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.OlaWelComePage;
import com.qa.util.TestUtil;

public class Assignment2Login extends TestBase
{
	 String sheetName ="Question2a";
	
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
	
	
	
	
	@Test(dataProvider="getLoginTestData")
	
	public void ValidateLoginTestdata( String username, String password)
	{
		
		OlaWelComePage olawelcomepage= new OlaWelComePage();
		olawelcomepage.clicksignin();
		
		LoginPage loginpage= new LoginPage();
		loginpage.testlogin(username, password);		
	}
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	

}
