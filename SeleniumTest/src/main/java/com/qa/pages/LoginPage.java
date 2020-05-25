package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(xpath="//input[@id='phdesktopbody_0_username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='phdesktopbody_0$SIGN IN']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//span[@id='phdesktopbody_0_Message']")
	WebElement LoginFailed;
	
	
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void TestLogin(String username,String password)
	{
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();
		
		if(LoginFailed.isDisplayed())
		{
			System.out.println("Login Failed");
			Username.clear();
			Password.clear();
			
		}
		
		else
		{
			System.out.println("Login Success");
		}
		
		
		
		
		
	}

}

