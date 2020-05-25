package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class MMTFlightDetailsPage extends TestBase
{
	
	@FindBy(xpath="//button[@id='bookbutton-RKEY:54d8cf0a-d19f-4dc6-9c3d-78ce72d48a12:50_0']")
	WebElement ViewFares;
	
	@FindBy(xpath="//*[@id=\"fli_list_item_fc597b7b-62b6-4f09-9e23-93cb1abefce7\"]/div[3]/div[1]/div[2]/div[2]/button")
	WebElement BookNow;
	
	
	public MMTFlightDetailsPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	


	public MMTReviewPage FlightDetails() 
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ViewFares.click();
		BookNow.click();
		return new  MMTReviewPage();
		
		
		
	}

}

