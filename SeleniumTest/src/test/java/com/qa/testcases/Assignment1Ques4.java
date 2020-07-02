package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DatePickerPage;
import com.qa.pages.HomePage;
import com.qa.pages.InteractionsPage;
import com.qa.pages.WidgetsPage;
import com.qa.util.TestUtil;

public class Assignment1Ques4 extends TestBase
{
	String sheetName= "Assignment4";
	public Assignment1Ques4()
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
	public void Dateselecttest(String month, String year, String day, String date)
	{
		
	     HomePage homepage= new HomePage();
	     homepage.clickwidgetBtn();
	     
	     WidgetsPage widgetspage= new WidgetsPage();
	     widgetspage.clickwidgetBtn();
	     
	     			    
		DatePickerPage datepickerpage = new DatePickerPage();
		datepickerpage.enterDate(month,year,day);	
		
		datepickerpage.verificationDate(date);
		
		
	}
	
	

}
