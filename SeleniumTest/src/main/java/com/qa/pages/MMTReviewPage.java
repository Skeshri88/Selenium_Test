package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class MMTReviewPage extends TestBase
{
	
	@FindBy(xpath="//h4[text()='Review your booking']")
	WebElement ReviewYourBooking;
	
	@FindBy(xpath="//div[@class='make_flex alC']//div[2]//span")
	WebElement SrcDest;
	
	
	@FindBy(xpath="//div[@class='make_flex alC']//div[2]//p[2]")
	WebElement DurationClass;
	
	@FindBy(xpath="//div[@class='dept-time append_bottom3 make_relative']")
	WebElement DeptTime;
	
	
	@FindBy(xpath="//p[@class='reaching-time append_bottom3']")
	WebElement ArrivalTime;
	
	@FindBy(xpath="//div[@class='pull-left airways-info-sect']//p[1]")
	WebElement FlightName;
	
	
	@FindBy(xpath="//p[@class='fareSmry-row LatoBold']//span[2]//span//span")
	WebElement FlightPrice;
	
	

	
	
	public MMTReviewPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	public void reviewdetails(String expectedsrcdest, String expecteddurationclass, String expecteddeparturetime
			, String expectedarrivaltime, String expectedflightname, String expectedflightprice)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ReviewYourBooking.isDisplayed();
		
		String srcdesttext= SrcDest.getText();
		Assert.assertEquals(srcdesttext, expectedsrcdest);
		
		String duratinclasstext= DurationClass.getText();
		Assert.assertEquals(duratinclasstext, expecteddurationclass);
		
		String departuretimetext= DeptTime.getText();
		Assert.assertEquals(departuretimetext, expecteddeparturetime);
		
		String arrivaltimetext= ArrivalTime.getText();
		Assert.assertEquals(arrivaltimetext, expectedarrivaltime);
		
		String flightnametext= FlightName.getText();
		Assert.assertEquals(flightnametext, expectedflightname);
		
		String flightpricetext= FlightPrice.getText();
		Assert.assertEquals(flightpricetext, expectedflightprice);
		
		
				
	}
	
	
	

}

