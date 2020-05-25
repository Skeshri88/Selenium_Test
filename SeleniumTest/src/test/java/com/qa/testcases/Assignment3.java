package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.MMTFlightDetailsPage;
import com.qa.pages.MMTHomePage;
import com.qa.pages.MMTReviewPage;
import com.qa.pages.SelectablePage;

public class Assignment3 extends TestBase
{
	public Assignment3()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@Test
	public void VerificationSelectablePage() throws InterruptedException
	{
		MMTHomePage mmthomepage= new MMTHomePage();
		   mmthomepage.EnterFromField();
		   mmthomepage.EnterToField();
		   mmthomepage.DepartureDate();
		   mmthomepage.clicksearch();
		   
		   
	   MMTFlightDetailsPage  mmtflightDetailsPage =new MMTFlightDetailsPage();
	       mmtflightDetailsPage.FlightDetails();
	       
	       
	   MMTReviewPage mmtreviewPage= new MMTReviewPage();
	      mmtreviewPage.verifyReviewYourBooking();
	      mmtreviewPage.verifyArrivalTime();
	      mmtreviewPage.verifyDepartFromTo();
	      mmtreviewPage.verifyDepartTime();
	      mmtreviewPage.verifyDepartureDate();
	      mmtreviewPage.verifyFlightPrice();
	   
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	
	

}

