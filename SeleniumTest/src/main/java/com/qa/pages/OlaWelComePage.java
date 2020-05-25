package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class OlaWelComePage extends TestBase
{
	@FindBy(xpath="//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")
	WebElement Register;
	
	@FindBy(xpath="//div[@class=' sign-style newsletter']/a[1]")
	WebElement SigninVerification;
	
	
	
	
	public OlaWelComePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verification()
	{
		if(SigninVerification.isDisplayed())
		{
			System.out.println("Sign In link is available");
		}
		
		else
		{
			System.out.println("Sign In link is not  available");	
		}
	}
	
	
	public RegisterPage  RegisterClick()
	{
		Register.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new RegisterPage();
	}

}

