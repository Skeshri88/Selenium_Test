package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DatePickerPage  extends TestBase
{
	@FindBy(xpath="//*[@id='content']/h1")
	WebElement DatePickerText;
	
	
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement DatePickerPoup;

	public DatePickerPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void VerificationDatePickerText()
	{
		if(DatePickerText.isDisplayed())
		{
			System.out.println("DatePicker text is available");
		}
		else
		{
			System.out.println("DatePicker text is not  available");
		}
	}
	public void  Selectdate() throws InterruptedException
	{
		DatePickerPoup.sendKeys(prop.getProperty("DatePickerDate"));
		Thread.sleep(5000);	
	}	
	public void verificationDate()
	{
		
		String text1=DatePickerPoup.getText();
		System.out.println(text1);
		if( prop.getProperty("text")==text1)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		
		
	}

}

