package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DatePickerPage;
import com.qa.pages.HomePage;
import com.qa.pages.SelectMenuPage;

//Drop down verification is not done
//Not clicking on the element
public class Assignment1Ques5 extends TestBase 
{
	public Assignment1Ques5()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@Test
	public void VerificationDatePickerTest() throws InterruptedException
	{
		HomePage homepage= new HomePage();
		homepage.selectmenu();
		
		SelectMenuPage selectmenupage= new SelectMenuPage();
		selectmenupage.verificationselectmenuText();
		selectmenupage.SelectSpeed();
		selectmenupage.SelectFile();
		selectmenupage.SelectNumber();
		selectmenupage.SelectTitle();
		
		
		
			
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}


}

