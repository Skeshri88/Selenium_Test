package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.SelectMenu;
import com.qa.pages.StudentRegistrationPage;
import com.qa.pages.WidgetsPage;
import com.qa.util.TestUtil;

public class Assignment1Ques5 extends TestBase 
{
	String sheetName= "Assignment5";
	public Assignment1Ques5()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
		
	@DataProvider
	public Object[][] getTestData()
	{
		Object data[][]=TestUtil.getTestData(sheetName);
	    return data;
	}
			
	
	@Test(dataProvider="getTestData")
	public void VerificationContactTest(String selectvalue, String selectone,String oldstyle) 
	{	
		HomePage homepage = new HomePage();
		homepage.clickwidgetBtn();
		
		WidgetsPage  WidgetsPage= new WidgetsPage();
		WidgetsPage.selectmenuBtn();		
		
		SelectMenu selectmenu= new SelectMenu();
		selectmenu.selectdropdown(selectvalue, selectone, oldstyle);
			
	}
		
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	

}

