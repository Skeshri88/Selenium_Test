package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.OlaWelComePage;
import com.qa.pages.RegisterPage;
import com.qa.util.TestUtil;

public class Assignment2 extends TestBase
{
	String sheetName= "Question2";
	public Assignment2()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@DataProvider()
	public Object[][]  getTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test(dataProvider="getTestData")
	public void VerificationDatePickerTest(String email, String password, String confirmpassword
            , String day, String month, String year, String firstname,
            String lastname, String country, String address, String post, String city,String middlename,String phonenumber) throws InterruptedException
	{
		OlaWelComePage olawelcomepage= new OlaWelComePage();
		   olawelcomepage.verification();
		   olawelcomepage.RegisterClick();
		   
		
		   
		 RegisterPage registerpage= new RegisterPage();
		 registerpage.RegisterwithFields(email, password, confirmpassword, day, month, year, firstname, lastname, country, address, post, city, middlename, phonenumber);
		 
		 
		 registerpage.verifySuccessfullRegistration();
		 	
			
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}

}

