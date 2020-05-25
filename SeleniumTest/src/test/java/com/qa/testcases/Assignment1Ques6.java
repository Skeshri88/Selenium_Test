package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ControlGroup;
import com.qa.pages.HomePage;
import com.qa.pages.SelectMenuPage;
//Its not clicking 
//Drop down list is not verified
public class Assignment1Ques6 extends TestBase
{
	public Assignment1Ques6()
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
		homepage.clickControlGroup();
		
		ControlGroup controlgroup= new ControlGroup();
		controlgroup.ControlGroupTextverified();
		controlgroup.selectcarsize();
		controlgroup.radiobuttonselectinStandard();
		controlgroup.checkboxselectioninsurance();
		controlgroup.enterNoofcars();
		controlgroup.clickBooknow();
		controlgroup.VerifyBookingMessage();
		
		
		
		
		
			
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}

}

