package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactPage extends TestBase
{
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement HTMLContactFormText;
	
	
	@FindBy(xpath="//input[@class='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lname']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='country']")
	WebElement Country;
	
	@FindBy(xpath="//textarea[@id='subject']")
	WebElement Subject;
	
	@FindBy(xpath="//a[text()='Google Link']")
	WebElement GoogleLink;
	
	@FindBy(xpath="//a[text()='Google Link is here']")
	WebElement GoogleLinkishere;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Submit;
	
	public ContactPage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHTMLContactFormText()
	{
		HTMLContactFormText.isDisplayed();
	}
	
	
	public void EnterFirstName() 
	{
		FirstName.sendKeys(prop.getProperty("ContactFirstName"));		
	}
	
	
	
	
	public void  EnterLastName()
	{
		LastName.sendKeys(prop.getProperty("ContactLasttName"));
		
		
	}
	
	
	public void  EnterCountry()
	{
		Country.sendKeys(prop.getProperty("ContactCountry"));
	}
	
	public void  EnterSubject()
	{
		Subject.sendKeys(prop.getProperty("ContactSubject"));
	}
	
	public void verifyGoogleLink()
	{
		GoogleLink.isDisplayed();
	}
	
	
	public void verifyGoogleLinkishere()
	{
		GoogleLinkishere.isDisplayed();
	}

	
	public ContactHomePage clickSubmitButton()
	{
		Submit.click();
		return new  ContactHomePage();
	}
	



}

