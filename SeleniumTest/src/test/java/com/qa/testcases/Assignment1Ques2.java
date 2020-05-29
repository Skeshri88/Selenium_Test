package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.SelectablePage;
import com.qa.pages.StudentRegistrationPage;

public class Assignment1Ques2 extends TestBase
{
	public Assignment1Ques2()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@Test
	public void VerificationContactTest() throws InterruptedException
	{
		StudentRegistrationPage studentregistrationpage= new StudentRegistrationPage();
		studentregistrationpage.FirstNameEnter();
		studentregistrationpage.LastNameEnter();
		studentregistrationpage.EmailEnter();
		studentregistrationpage.MaleClick();
		studentregistrationpage.MobileNumberEnter();
		studentregistrationpage.DOBSelection();
		
		
		
		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	
	
	
	

}

