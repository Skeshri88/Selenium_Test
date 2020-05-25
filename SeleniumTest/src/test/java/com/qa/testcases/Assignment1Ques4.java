package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DatePickerPage;
import com.qa.pages.DroppablePage;
import com.qa.pages.HomePage;

//date entered could not verified
public class Assignment1Ques4 extends TestBase
{
	
	public Assignment1Ques4()
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
		homepage.clickDatePicker();
		DatePickerPage datepickerpage= new DatePickerPage();
		datepickerpage.VerificationDatePickerText();
		datepickerpage.Selectdate();
		datepickerpage.verificationDate();
		
			
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}

}

