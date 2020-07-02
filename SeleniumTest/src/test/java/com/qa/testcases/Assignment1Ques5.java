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
	String sheetName= "Assignment55";
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
			
	
	@Test(priority=1,dataProvider="getTestData")
	public void VerificationContactTest(String  oldstyle , String selectvalue,String selectone , String expectedselectvalue, String expectedselectedone, String expectedselectoldstyle) throws InterruptedException 
	{	
		HomePage homepage = new HomePage();
		homepage.clickwidgetBtn();
		
		WidgetsPage  WidgetsPage= new WidgetsPage();
		WidgetsPage.selectmenubtn();		
		
		SelectMenu selectmenu= new SelectMenu();		
		selectmenu.selectolddropdown(oldstyle);
		selectmenu.selectvaluedropdown(selectvalue);
		selectmenu.selectonedropdown(selectone);
		
		selectmenu.verifyselecteddropdown(expectedselectvalue, expectedselectedone, expectedselectoldstyle);
		
	}
	
	
	

	
	
		
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	

}

