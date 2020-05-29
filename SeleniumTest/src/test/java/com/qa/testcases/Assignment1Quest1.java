package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.InteractionsPage;
import com.qa.pages.SelectablePage;


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
	
	SelectablePage  selectablepage= new SelectablePage();
	selectablepage.clickCrasBtn();
	selectablepage.clickdapiBusBtn();
	selectablepage.clickMorbiBtn();
	selectablepage.clickPortaBtn();
	
	
		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
}
	

