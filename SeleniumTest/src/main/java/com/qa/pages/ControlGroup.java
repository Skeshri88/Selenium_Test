package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ControlGroup extends TestBase
{
	@FindBy(xpath="//span[@id='ui-id-8-button']")
	WebElement CarSize;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement verifycontrolGroupText;
	
	@FindBy(xpath="//span[@id='ui-id-8-button']")
	List<WebElement> optionsCarSize;
		
	
	@FindBy(xpath="//label[@for='transmission-standard-v']")
	WebElement Standard;
	
	@FindBy(xpath="//label[@for='insurance-v']")
	WebElement Insurance;
	
	@FindBy(xpath="//input[@id='vertical-spinner']")
	WebElement NoOfcars;

	
	@FindBy(xpath="//button[@id='book']")
	WebElement Book;
	
	@FindBy(xpath="//*[text()='Booking Successfull']")
	WebElement BookMessaging;
	
	
	
	
	
	
	
	
	
	
	public ControlGroup()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	public void ControlGroupTextverified()
	{
		verifycontrolGroupText.isDisplayed();
	}
	
	public void selectcarsize()
	{
		CarSize.click();
		 for(WebElement option : optionsCarSize) 
		 {
			    if (option.getText().equals(prop.getProperty("Car Size Value")))
			    {
			        option.click();
			    }
		 
	  }		
	}
	
	public void radiobuttonselectinStandard()
	{
		Standard.click();	
	}
	
	public void checkboxselectioninsurance()
	{
		Insurance.click();
	}
	
	public void enterNoofcars()
	{
		NoOfcars.sendKeys(prop.getProperty("No of cars Value"));
	}
	
	
	public void clickBooknow()
	{
		Book.click();
		
	}
	
	public void VerifyBookingMessage()
	{
		if(BookMessaging.isDisplayed())
		{
		System.out.println("Booking done successfull");	
		}
		else
		{
			System.out.println("Booking si not  done successfull");		
		}
	}

}

