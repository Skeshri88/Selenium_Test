package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class MMTHomePage extends TestBase
{
	@FindBy(xpath="//label[@for='fromCity']")
	WebElement FromField;
	
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	WebElement FromFieldDropdownselection;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement ToField;
	
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	WebElement ToFieldDropdownselection;
	
	@FindBy(xpath="//label[@for='departure']")
	WebElement DepatureDate;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[5]/div/p[1]")
	WebElement DepartureDateSelection;
	
	
	@FindBy(xpath="//a[text()='Search']")
	WebElement SearchButton;
	
	
	
	
	
	public MMTHomePage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	
	public void  EnterFromField() throws InterruptedException
	{
		Thread.sleep(2000);
		FromField.sendKeys(prop.getProperty("from"));
		Thread.sleep(5000);
		FromFieldDropdownselection.click();		
	}
		
	public void  EnterToField() throws InterruptedException
	{
		Thread.sleep(2000);
		ToField.sendKeys(prop.getProperty("to"));
		Thread.sleep(5000);
		ToFieldDropdownselection.click();
	}
	
	public void  DepartureDate() throws InterruptedException
	{
		Thread.sleep(2000);
		DepatureDate.sendKeys(prop.getProperty("MMTDate"));
		DepartureDateSelection.click();
		
	}
	
	 public MMTFlightDetailsPage clicksearch()
	 {
		 SearchButton.click();
		 return new MMTFlightDetailsPage();
	 }


}

