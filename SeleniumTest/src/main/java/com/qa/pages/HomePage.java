package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase
{
	
	@FindBy(xpath="//div[@class='category-cards']//div[5]")
     public WebElement InteractionBtn;
	
	
	public void HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public InteractionsPage clickInteractionBtn() throws InterruptedException
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");	
		InteractionBtn.isEnabled();
		InteractionBtn.isDisplayed();
		System.out.println(driver);
		InteractionBtn.click();
		return new InteractionsPage();
	}
	 
	

}
