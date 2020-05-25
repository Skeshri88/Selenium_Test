package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.SelectablePage;


//Go to Selectable page then text ==text1 validation need to check
public class Assignment1Quest1 extends TestBase
{
	public Assignment1Quest1()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@Test
	public void VerificationSelectablePage()
	{
		HomePage homepage= new HomePage();
		homepage.clickonselectablelink();
		
		
		SelectablePage selectablepage= new SelectablePage();
		selectablepage.ClickAllItemList();
		selectablepage.VerifySelectableText();	
		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	

}
