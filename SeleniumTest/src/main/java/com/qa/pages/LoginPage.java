package com.qa.pages;


import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	static Sheet sheet;
	@FindBy(xpath="//input[@id='phdesktopbody_0_username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='phdesktopbody_0$SIGN IN']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//span[@id='phdesktopbody_0_Message']")
	WebElement LoginFailed;
	
	
	@FindBy(xpath="//h1[text()='YOUR PROFILE']")
	public  WebElement YourProfileTextVerification;
	
	
	
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  testlogin(String username,String password)
	{	    
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();
		
			
		if(YourProfileTextVerification.isDisplayed())
		{
			System.out.println("Login SuccessFull and credential correct");
								
		}
		
		else if(LoginFailed.isDisplayed())
		{
			System.out.println("Login UnsuccessFull and credential's incorrect");
			Username.clear();
			Password.clear();
			
		}		
		
		
		
		
	}

}

