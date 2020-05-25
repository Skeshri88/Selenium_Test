package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class MMTReviewPage extends TestBase
{
	
	@FindBy(xpath="//h4[text()='Review your booking']")
	WebElement ReviewYourBooking;
	
	@FindBy(xpath="//div[@class='rvw-labelView-block']//p[2]")
	WebElement DepartDate;
	
	@FindBy(xpath="//div[@class='make_flex alC']//div[2]//p[1]//span")
	WebElement DepartFromTo;
	
	@FindBy(xpath="//div[@class='fli-time-section pull-left']//div[1]")
	WebElement DepartTime;
	
	
	@FindBy(xpath="//p[@class='reaching-time append_bottom3']")
	WebElement ArrivalTime;
	
	@FindBy(xpath="//p[@class='fareSmry-row LatoBold']//span[2]/span//span")
	WebElement FlightPrice;
	
	
	
	
	
	
	
	public MMTReviewPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	
	public void  verifyReviewYourBooking()
	{
		ReviewYourBooking.isDisplayed();
		
	}
	
	public void  verifyDepartureDate()
	{
		DepartDate.isDisplayed();
		String Text= DepartDate.getText();
		System.out.println(Text);
		
	}
	
	public void  verifyDepartFromTo()
	{
		DepartFromTo.isDisplayed();
		String text=DepartFromTo.getText();
		System.out.println(text);
		
	}
	
	public void  verifyDepartTime()
	{
		DepartTime.isDisplayed();
		String text= DepartTime.getText();
		System.out.println(text);
		
	}
	
	public void  verifyArrivalTime()
	{
		ArrivalTime.isDisplayed();
		String text= ArrivalTime.getText();
	    System.out.println(text);
		
	}
	
	public void  verifyFlightPrice()
	{
		FlightPrice.isDisplayed();
		String text= FlightPrice.getText();
		System.out.println(text);
		
	}

}

