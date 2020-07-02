package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.MMTFlightDetailsPage;
import com.qa.pages.MMTHomePage;
import com.qa.pages.MMTReviewPage;
import com.qa.pages.SelectablePage;
import com.qa.util.TestUtil;

public class Assignment3 extends TestBase
{
	String sheetName= "Assignment33";
	public Assignment3()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	

	@DataProvider
	public Object[][]  getTestData()
	{
	Object data[][]=TestUtil.getTestData(sheetName);
	return data;
	}
	

	
		
		
	@Test(dataProvider="getTestData")
	public void VerificationSelectablePage(String from, String to, String expectedsrcdest, String expecteddurationclass, String expecteddeparturetime
			, String expectedarrivaltime, String expectedflightname, String expectedflightprice, String monthyearvalue, String dayvalue) throws InterruptedException
	{
		MMTHomePage mmthomepage= new MMTHomePage();
		Thread.sleep(10000);
		mmthomepage.onewayradioselected();
		mmthomepage.EnterFromField(from,to);
		mmthomepage.selectmonthyearday(monthyearvalue);
		mmthomepage.dayselection(dayvalue);
		
		Thread.sleep(5000);
		mmthomepage.clicksearch();
		
		
		MMTFlightDetailsPage  mmtflightDetailsPage= new MMTFlightDetailsPage();	
		mmtflightDetailsPage.FlightDetails();
		
		
		MMTReviewPage mmtreviewpage= new MMTReviewPage();
		mmtreviewpage.reviewdetails(expectedsrcdest,expecteddurationclass,expecteddeparturetime,expectedarrivaltime,expectedflightname,expectedflightprice);
		
		
	}	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	
	

}

